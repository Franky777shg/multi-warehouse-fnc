package com.fnc.warehouse.service.domain.dto.create;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

import javax.validation.constraints.NotNull;
import java.util.UUID;
import java.util.List;

@Getter
@Builder
@AllArgsConstructor
public class CreateWarehouseCommand {
    private final UUID warehouseId;
    @NotNull
    private final String name;
    @NotNull
    private final WarehouseLocation location;

    private final List<User> users;

    public UUID getWarehouseId() {
        return warehouseId;
    }

    public @NotNull String getName() {
        return name;
    }

    public @NotNull WarehouseLocation getLocation() {
        return location;
    }

    public List<User> getUsers() {
        return users;
    }
}
