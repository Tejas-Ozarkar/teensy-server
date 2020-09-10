package com.xeno.teensy.service;

import com.xeno.teensy.jooq.sample.model.Tables;
import com.xeno.teensy.jooq.sample.model.tables.pojos.User;
import org.jooq.DSLContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Optional;

@Service
public class MyUserDetailsService implements UserDetailsService {

    @Autowired
    DSLContext context;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        // TODO Auto-generated method stub
        Optional<User> user = Optional.ofNullable(this.findUserByUsername(username));
        user.orElseThrow(() -> new UsernameNotFoundException("Not Found: "+username));
        return new org.springframework.security.core.userdetails.User(user.get().getUsername(), user.get().getPassword(), new ArrayList<>());
    }

    private User findUserByUsername(String username){
        return context
                .selectFrom(Tables.USER)
                .where(Tables.USER.USERNAME.eq(username))
                .limit(1)
                .fetchOneInto(User.class);
    }

    public void signupUser(User user){
        context.insertInto(Tables.USER,Tables.USER.FIRSTNAME,Tables.USER.LASTNAME,
                Tables.USER.EMAIL,Tables.USER.USERNAME, Tables.USER.PASSWORD)
                .values(user.getFirstname(),user.getLastname(),user.getEmail(),user.getUsername(),user.getPassword())
                .execute();
    }

}