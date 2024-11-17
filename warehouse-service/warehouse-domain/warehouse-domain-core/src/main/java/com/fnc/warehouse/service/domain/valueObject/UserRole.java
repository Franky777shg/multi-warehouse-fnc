package com.fnc.warehouse.service.domain.valueObject;

public class UserRole {

    private final UserRoleType type;

    public UserRole(UserRoleType type) {
        this.type = type;
    }

    public UserRoleType getType() { return type; }

}
