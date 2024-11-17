package com.fnc.warehouse.service.domain.ports.output.repository;

import java.util.UUID;

public interface StockRepository {
    void initializeDefaultInventory(UUID warehouseId);
}
