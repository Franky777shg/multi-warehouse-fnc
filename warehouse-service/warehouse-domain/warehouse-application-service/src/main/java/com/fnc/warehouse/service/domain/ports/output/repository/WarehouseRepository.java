package com.fnc.warehouse.service.domain.ports.output.repository;

import com.fnc.warehouse.service.domain.entity.*;

import java.util.UUID;

public interface WarehouseRepository  {
    Warehouse save(Warehouse warehouse);

    Warehouse findById(UUID warehouseId);
}
