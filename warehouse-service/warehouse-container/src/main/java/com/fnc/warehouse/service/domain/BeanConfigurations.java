package com.fnc.warehouse.service.domain;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanConfigurations {

    @Bean
    public WarehouseDomainService warehouseDomainService() {
        return new WarehouseDomainServiceImpl();
    }
}
