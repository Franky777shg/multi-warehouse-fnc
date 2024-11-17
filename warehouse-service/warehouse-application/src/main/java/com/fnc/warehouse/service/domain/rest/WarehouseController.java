package com.fnc.warehouse.service.domain.rest;

import com.fnc.warehouse.service.domain.ports.input.service.WarehouseApplicationService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@Slf4j
@RestController
@RequestMapping( value = "/warehouses" )
public class WarehouseController {
    private final WarehouseApplicationService warehouseApplicationService;

    public WarehouseController(WarehouseApplicationService warehouseApplicationService) {
        this.warehouseApplicationService = warehouseApplicationService;
    }

    @GetMapping()
    public ResponseEntity<String> getWarehouse() {
        log.info("Warehouse get");
        return ResponseEntity.ok("hello this is get warehouses");
    }
}

