package com.fnc.warehouse.service.domain.event;

import com.fnc.warehouse.service.domain.entity.Warehouse;

import java.time.ZonedDateTime;

public class WarehouseDeletedEvent extends WarehouseEvent {
    public WarehouseDeletedEvent(Warehouse warehouse, ZonedDateTime deletedAt) {
        super(warehouse, deletedAt);
    }

    @Override
    public void fire() {

    }
}
