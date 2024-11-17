package com.fnc.warehouse.service.dataaccess.warehouse.repository;

import com.fnc.warehouse.service.dataaccess.warehouse.entity.WarehouseEntity;
//import com.fnc.warehouse.service.domain.entity.Stock;
//import com.fnc.warehouse.service.domain.entity.Warehouse;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

//import java.util.Optional;
import java.util.UUID;

@Repository
public interface WarehouseJpaRepository extends JpaRepository<WarehouseEntity, UUID> {
//    Optional<WarehouseEntity> save(WarehouseEntity warehouseEntity);

//    Stock getStock(UUID stockId);
}
