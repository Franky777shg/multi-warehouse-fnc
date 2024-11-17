package com.fnc.warehouse.service.domain;

import com.fnc.warehouse.service.domain.dto.create.CreateWarehouseCommand;
import com.fnc.warehouse.service.domain.dto.create.CreateWarehouseResponse;
import com.fnc.warehouse.service.domain.event.WarehouseCreatedEvent;
import com.fnc.warehouse.service.domain.mapper.WarehouseDataMapper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class WarehouseCreateCommandHandler {
    private final WarehouseCreateHelper warehouseCreateHelper;

    private final WarehouseDataMapper warehouseDataMapper;

//    private final WarehouseCreatedRequestMessagePublisher warehouseCreatedRequestMessagePublisher;

    public WarehouseCreateCommandHandler(WarehouseCreateHelper warehouseCreateHelper,
                                         WarehouseDataMapper warehouseDataMapper) {
        this.warehouseCreateHelper = warehouseCreateHelper;
        this.warehouseDataMapper = warehouseDataMapper;

    }

    public CreateWarehouseResponse createWarehouse(CreateWarehouseCommand createWarehouseCommand) {
        WarehouseCreatedEvent warehouseCreatedEvent = warehouseCreateHelper.persistWarehouse(createWarehouseCommand);
        log.info("Warehouse is created with id: {}", warehouseCreatedEvent.getEntity().getId().getValue());
//        warehouseCreatedRequestMessagePublisher.publish(warehouseCreatedEvent);
        return warehouseDataMapper.warehouseToCreateWarehouseResponse(warehouseCreatedEvent.getEntity(),
                "Warehouse created successfully");
    }
}
