package com.xeno.teensy.service;

import com.xeno.teensy.jooq.sample.model.Tables;
import com.xeno.teensy.jooq.sample.model.tables.pojos.Tribe;
import com.xeno.teensy.jooq.sample.model.tables.pojos.User;
import org.jooq.DSLContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GroupService {

    @Autowired
    DSLContext context;

    @Autowired
    MyUserDetailsService userDetailsService;

    public Tribe createGroup(Tribe group){
        User user = userDetailsService.getCurrentUserDetails();

        Tribe tribe = context.insertInto(Tables.TRIBE, Tables.TRIBE.TITLE, Tables.TRIBE.DESCRIPTION, Tables.TRIBE.USERID)
                .values(group.getTitle(), group.getDescription(), user.getId())
                .returning()
                .fetchOne()
                .into(Tribe.class);

        addAdmin(user.getId(), tribe.getId());
        return tribe;
    }

    public void addAdmin(int userId, int groupId){
        context.insertInto(Tables.TRIBE_ADMIN, Tables.TRIBE_ADMIN.USERID, Tables.TRIBE_ADMIN.GROUPID)
                .values(userId, groupId)
                .execute();
    }

    public List<Tribe> getUserGroups(){
        User user = userDetailsService.getCurrentUserDetails();
        return context.select(Tables.TRIBE.asterisk())
                .from(Tables.TRIBE, Tables.TRIBE_ADMIN)
                .where(Tables.TRIBE.ID.eq(Tables.TRIBE_ADMIN.GROUPID))
                .and(Tables.TRIBE_ADMIN.USERID.eq(user.getId()))
                .fetchInto(Tribe.class);
    }

    public List<Tribe> getAllGroups(){
        return context.select(Tables.TRIBE.asterisk())
                .from(Tables.TRIBE)
                .fetchInto(Tribe.class);
    }

    public boolean deleteGroup(int groupId){
        User user = userDetailsService.getCurrentUserDetails();
        if(getGroupAdmins(groupId).contains(user.getId())){
            context.delete(Tables.TRIBE_ADMIN)
                    .where(Tables.TRIBE_ADMIN.GROUPID.eq(groupId))
                    .execute();
            context.delete(Tables.TRIBE)
                    .where(Tables.TRIBE.ID.eq(groupId))
                    .execute();
            return true;
        }
        return false;
    }

    public List<Integer> getGroupAdmins(int groupId){
        return context.select(Tables.TRIBE_ADMIN.USERID)
                .from(Tables.TRIBE_ADMIN)
                .where(Tables.TRIBE_ADMIN.GROUPID.eq(groupId))
                .fetchInto(Integer.class);
    }
}
