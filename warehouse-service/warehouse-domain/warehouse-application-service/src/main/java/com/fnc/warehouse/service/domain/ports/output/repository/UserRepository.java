package com.fnc.warehouse.service.domain.ports.output.repository;

import com.fnc.warehouse.service.domain.entity.User;

import java.util.Optional;
import java.util.UUID;

public interface UserRepository {
    Optional<User> findById(UUID userId);
}
