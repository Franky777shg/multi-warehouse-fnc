package com.fnc.warehouse.service.domain.event;

import com.fnc.domain.event.DomainEvent;
import com.fnc.warehouse.service.domain.entity.Warehouse;

import java.time.ZonedDateTime;

public abstract class WarehouseEvent implements DomainEvent<Warehouse> {
    private final Warehouse warehouse;
    private final ZonedDateTime createdAt;

    protected WarehouseEvent(Warehouse warehouse, ZonedDateTime createdAt) {
        this.warehouse = warehouse;
        this.createdAt = createdAt;
    }

    @Override
    public Warehouse getEntity() {
        return warehouse;
    }

    @Override
    public ZonedDateTime getCreatedAt() {
        return createdAt;
    }
}