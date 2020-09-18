package com.xeno.teensy.service;

import com.xeno.teensy.jooq.sample.model.Tables;
import com.xeno.teensy.jooq.sample.model.tables.pojos.User;
import io.tej.SwaggerCodgen.model.ApprovalDto;
import io.tej.SwaggerCodgen.model.CardResponse;
import org.jooq.DSLContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ApprovalService {

    @Autowired
    MyUserDetailsService userDetailsService;

    @Autowired
    DSLContext context;

    public void sendApproval(ApprovalDto approvalDto){
        User user = userDetailsService.getCurrentUserDetails();
        context
                .insertInto(Tables.APPROVAL, Tables.APPROVAL.TITLE, Tables.APPROVAL.DESCRIPTION, Tables.APPROVAL.ICON, Tables.APPROVAL.LONGURL, Tables.APPROVAL.USERID, Tables.APPROVAL.CARDID, Tables.APPROVAL.GROUPID)
                .values(approvalDto.getTitle(), approvalDto.getDescription(), approvalDto.getIcon(), approvalDto.getLongurl(), user.getId(), approvalDto.getCardId(), approvalDto.getGroupId())
                .execute();
    }
}
