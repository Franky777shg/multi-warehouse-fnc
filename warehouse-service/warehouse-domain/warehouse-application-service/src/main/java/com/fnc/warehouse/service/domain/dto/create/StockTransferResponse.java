package com.fnc.warehouse.service.domain.dto.create;

import com.fnc.warehouse.service.domain.valueObject.TransferStatus;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

import javax.validation.constraints.NotNull;
import java.util.UUID;

@Getter
@Builder
@AllArgsConstructor
public class StockTransferResponse {
    @NotNull
    private final TransferStatus transferStatus;

    private final UUID transferTrackingId;
}
