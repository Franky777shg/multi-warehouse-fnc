package com.fnc.warehouse.service.domain.dto.create;

import com.fnc.warehouse.service.domain.valueObject.WarehouseStatus;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Builder;

import javax.validation.constraints.NotNull;
import java.util.UUID;

@Getter
@Builder
@AllArgsConstructor
public class CreateWarehouseResponse {
    @NotNull
    private final UUID warehouseId;
    @NotNull
    private final WarehouseStatus warehouseStatus;
    @NotNull
    private final String message;


}
