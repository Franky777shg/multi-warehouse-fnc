package com.fnc.warehouse.service.domain.entity;

import com.fnc.domain.entity.*;
import com.fnc.domain.valueObject.*;
import com.fnc.warehouse.service.domain.valueObject.UserRole;

public class User extends BaseEntity<UserId> {

    private UserId userId;
    private String name;
    private UserRole userRole;

    public User(UserId userId, String name, UserRole userRole) {
        super.setId(userId);
        this.name = name;
        this.userRole = userRole;
    }

    public User(UserId userId) {
        super.setId(userId);
    }

    public UserId getUserId() { return userId; }
    public String getName() { return name; }
    public UserRole getUserRole() { return userRole; }


}
