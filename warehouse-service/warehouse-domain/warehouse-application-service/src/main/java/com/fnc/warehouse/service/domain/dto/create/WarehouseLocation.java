package com.fnc.warehouse.service.domain.dto.create;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

import javax.validation.constraints.Max;
import javax.validation.constraints.NotNull;

@Getter
@Builder
@AllArgsConstructor
public class WarehouseLocation {
    @NotNull
    private final float latitude;
    @NotNull
    private final float longitude;
    @NotNull
    @Max(value = 50)
    private final String address;
    @NotNull
    @Max(value = 10)
    private final String postalCode;
    @NotNull
    @Max(value = 50)
    private final String city;
    @NotNull
    @Max(value = 50)
    private final String province;
    @NotNull
    @Max(value = 50)
    private final String district;

    @NotNull
    public float getLatitude() {
        return latitude;
    }

    @NotNull
    public float getLongitude() {
        return longitude;
    }

    public @NotNull @Max(value = 50) String getAddress() {
        return address;
    }

    public @NotNull @Max(value = 10) String getPostalCode() {
        return postalCode;
    }

    public @NotNull @Max(value = 50) String getCity() {
        return city;
    }

    public @NotNull @Max(value = 50) String getProvince() {
        return province;
    }

    public @NotNull @Max(value = 50) String getDistrict() {
        return district;
    }
}
