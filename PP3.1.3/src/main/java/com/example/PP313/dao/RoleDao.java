package com.example.PP313.dao;

import com.example.PP313.model.Role;

import java.util.List;

public interface RoleDao {

    void createRole(Role role);

    List<Role> getAllRoles();

    Role finedRoleByRoleName(String roleName);

}
