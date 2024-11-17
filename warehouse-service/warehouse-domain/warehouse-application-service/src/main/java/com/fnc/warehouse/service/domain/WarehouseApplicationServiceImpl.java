package com.fnc.warehouse.service.domain;

import com.fnc.warehouse.service.domain.dto.create.CreateWarehouseCommand;
import com.fnc.warehouse.service.domain.dto.create.CreateWarehouseResponse;
import com.fnc.warehouse.service.domain.dto.create.StockTransferCommand;
import com.fnc.warehouse.service.domain.dto.create.StockTransferResponse;
import com.fnc.warehouse.service.domain.ports.input.service.WarehouseApplicationService;
import org.springframework.stereotype.Service;
import org.springframework.validation.annotation.Validated;

@Validated
@Service
public class WarehouseApplicationServiceImpl implements WarehouseApplicationService {
    private final WarehouseCreateCommandHandler warehouseCreateCommandHandler;

    public WarehouseApplicationServiceImpl(WarehouseCreateCommandHandler warehouseCreateCommandHandler) {
        this.warehouseCreateCommandHandler = warehouseCreateCommandHandler;
    }

    @Override
    public CreateWarehouseResponse createWarehouse(CreateWarehouseCommand createWarehouseCommand) {
    return warehouseCreateCommandHandler.createWarehouse(createWarehouseCommand);
    }

//    @Override
//    public StockTransferResponse transferStock(StockTransferCommand stockTrasnferCommand) {
//        return null;
//    }
}
