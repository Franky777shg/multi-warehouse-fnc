package com.fnc.warehouse.service.domain;



import com.fnc.warehouse.service.domain.dto.create.CreateWarehouseCommand;
import com.fnc.warehouse.service.domain.entity.Warehouse;
import com.fnc.warehouse.service.domain.event.*;
import com.fnc.warehouse.service.domain.exception.StockException;
import com.fnc.warehouse.service.domain.exception.WarehouseDomainException;
import com.fnc.warehouse.service.domain.mapper.WarehouseDataMapper;
import com.fnc.warehouse.service.domain.ports.output.repository.WarehouseRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.util.UUID;

@Slf4j
@Component
public class WarehouseCreateHelper {
    private final WarehouseDomainService warehouseDomainService;

    private final WarehouseRepository warehouseRepository;

    private final WarehouseDataMapper warehouseDataMapper;

//    private final StockRequestRequestMessagePublisher stockRequestRequestMessagePublisher;


    public WarehouseCreateHelper(WarehouseDomainService warehouseDomainService,
                                 WarehouseRepository warehouseRepository,
                                 WarehouseDataMapper warehouseDataMapper
//                                 StockRequestRequestMessagePublisher stockRequestRequestMessagePublisher
    ) {
        this.warehouseDomainService = warehouseDomainService;
        this.warehouseRepository = warehouseRepository;
        this.warehouseDataMapper = warehouseDataMapper;
//        this.stockRequestRequestMessagePublisher = stockRequestRequestMessagePublisher;
    }

    @Transactional
    public WarehouseCreatedEvent persistWarehouse(CreateWarehouseCommand createWarehouseCommand) {
        Warehouse warehouse = warehouseDataMapper.createWarehouseCommandToWarehouse(createWarehouseCommand);
        WarehouseCreatedEvent warehouseCreatedEvent = warehouseDomainService.createWarehouse(
                warehouse.getName(),
                warehouse.getLocation());

        saveWarehouse(warehouse);

        log.info("Warehouse is created with id: {}", warehouseCreatedEvent.getEntity().getId().getValue());
        return warehouseCreatedEvent;
    }

    private Warehouse saveWarehouse(Warehouse warehouse) {
        Warehouse warehouseResult = warehouseRepository.save(warehouse);
        if (warehouseResult == null) {
            log.error("Could not save order!");
            throw new WarehouseDomainException("Could not save order!");
        }
        log.info("Warehouse is saved with id: {}", warehouseResult.getId().getValue());
        return warehouseResult;
    }

//    @Transactional
//    public StockTransferRequestedEvent requestedStockTransferEvent(StockTransferCommand stockTransferCommand) {
//        Stock sourceStock = getWarehouse(stockTransferCommand.getSourceStockId());
//        Stock destinationStock = getWarehouse(stockTransferCommand.getDestinationStockId());
//
//        StockTransferRequestedEvent stockTransferRequestedEvent = warehouseDomainService.requestStockTransfer(
//                sourceStock,destinationStock,
//                stockTransferCommand.getQty(),
//                stockTransferCommand.getTransferType(),
//                stockRequestRequestMessagePublisher);
//
//        log.info("Stock is requested with id: {}", stockTransferRequestedEvent.getEntity().getId().getValue());
//        return stockTransferRequestedEvent;
//    }

    private Warehouse getWarehouse(UUID warehouseId) {
        Warehouse whResult = warehouseRepository.findById(warehouseId);
        if (whResult == null) {
            log.error("Data not found");
            throw new StockException("Data not found");
        }
        return whResult;
    }

}