package com.xeno.teensy.controller;

import com.xeno.teensy.service.ApprovalService;
import io.tej.SwaggerCodgen.api.ApprovalApi;
import io.tej.SwaggerCodgen.model.ApprovalDto;
import io.tej.SwaggerCodgen.model.GenericResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApprovalController implements ApprovalApi {

    @Autowired
    ApprovalService approvalService;

    @Override
    public ResponseEntity<GenericResponse> sendApproval(ApprovalDto approvalDto) {
        this.approvalService.sendApproval(approvalDto);
        return ResponseEntity.ok(new GenericResponse().message("Approval Sent"));
    }
}
