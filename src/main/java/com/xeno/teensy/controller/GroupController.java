package com.xeno.teensy.controller;

import com.xeno.teensy.mapper.GroupMapper;
import com.xeno.teensy.mapper.UserMapper;
import com.xeno.teensy.service.GroupService;
import io.tej.SwaggerCodgen.api.GroupApi;
import io.tej.SwaggerCodgen.model.*;
import org.mapstruct.factory.Mappers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin
@RestController
public class GroupController implements GroupApi {

    @Autowired
    GroupService groupService;

    private final GroupMapper groupMapper = Mappers.getMapper(GroupMapper.class);

    @Override
    public ResponseEntity<GroupResponse> getGroupInfo(Integer groupId) {
        return ResponseEntity.ok(groupMapper.toResponse(groupService.getGroupInfo(groupId)));
    }

    @Override
    public ResponseEntity<GroupResponse> createGroup(GroupDto groupDto) {
        return ResponseEntity.ok(groupMapper.toResponse(groupService.createGroup(groupMapper.toEntity(groupDto))));
    }

    @Override
    public ResponseEntity<List<GroupResponse>> getUserGroups() {
        return ResponseEntity.ok(groupMapper.toGroupResponseList(groupService.getUserGroups()));
    }

    @Override
    public ResponseEntity<List<GroupResponse>> getAllGroups() {
        return ResponseEntity.ok(groupMapper.toGroupResponseList(groupService.getAllGroups()));
    }

    @Override
    public ResponseEntity<GenericResponse> deleteGroup(Integer groupId) {
        if(groupService.deleteGroup(groupId)){
            return ResponseEntity.ok(new GenericResponse().message("Deleted Successfully"));
        }
        return ResponseEntity.status(401).body(new GenericResponse().message("You do not have permission to delete this group"));
    }

    @Override
    public ResponseEntity<List<UserResponseDto>> getGroupAdmins(Integer groupId) {
        return ResponseEntity.ok(groupService.getGroupAdminDetails(groupId));
    }

    @Override
    public ResponseEntity<GenericResponse> addGroupAdmin(Integer groupId, AdminDto adminDto) {
        groupService.insertGroupAdmin(groupId, adminDto.getEmail());
        return ResponseEntity.ok(new GenericResponse().message("Admin Added"));
    }

    @Override
    public ResponseEntity<GenericResponse> deleteGroupAdmin(Integer groupId, Integer userId) {
        groupService.deleteGroupAdmin(userId, groupId);
        return ResponseEntity.ok(new GenericResponse().message("Admin deleted"));
    }

    @Override
    public ResponseEntity<IsAdminDto> isGroupAdmin(Integer groupId) {
        return ResponseEntity.ok(new IsAdminDto().isadmin(groupService.isGroupAdmin(groupId)));
    }
}
