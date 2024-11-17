package com.fnc.warehouse.service.domain.ports.input.service;

import com.fnc.warehouse.service.domain.dto.create.CreateWarehouseCommand;
import com.fnc.warehouse.service.domain.dto.create.CreateWarehouseResponse;
import com.fnc.warehouse.service.domain.dto.create.StockTransferResponse;
import com.fnc.warehouse.service.domain.dto.create.StockTransferCommand;

import javax.validation.Valid;

public interface WarehouseApplicationService {
    CreateWarehouseResponse createWarehouse(@Valid CreateWarehouseCommand createWarehouseCommand);

//    StockTransferResponse transferStock(@Valid StockTransferCommand stockTrasnferCommand);
}
