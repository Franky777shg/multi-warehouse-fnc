package com.fnc.warehouse.service.domain.event;

import com.fnc.warehouse.service.domain.entity.Warehouse;

import java.time.ZonedDateTime;

public class WarehouseUpdatedEvent extends WarehouseEvent {

    public WarehouseUpdatedEvent(Warehouse warehouse, ZonedDateTime updatedAt) {
        super(warehouse, updatedAt);
    }

    @Override
    public void fire() {

    }
}
