package com.fnc.warehouse.service.domain.event;

import com.fnc.warehouse.service.domain.entity.Warehouse;

import java.time.ZonedDateTime;

public class WarehouseCreatedEvent extends WarehouseEvent {
    public WarehouseCreatedEvent(Warehouse warehouse, ZonedDateTime createdAt) {
        super(warehouse, createdAt);
    }

    @Override
    public void fire() {

    }
}
