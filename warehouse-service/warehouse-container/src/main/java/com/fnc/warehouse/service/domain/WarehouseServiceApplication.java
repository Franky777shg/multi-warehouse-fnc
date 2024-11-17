package com.fnc.warehouse.service.domain;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@EnableJpaRepositories(basePackages = {
        "com.fnc.warehouse.service.dataaccess.warehouse.repository"
})
@EntityScan(basePackages = {
        "com.fnc.warehouse.service.dataaccess.warehouse.entity",
        "com.fnc.warehouse.service.domain.ports.output.message.publisher"
})
@SpringBootApplication(scanBasePackages = "com.fnc")
@RestController
@RequestMapping(value = "/")
public class WarehouseServiceApplication {
    public static void main(String[] args) {
        SpringApplication.run(WarehouseServiceApplication.class, args);
    }

    @GetMapping
    public String hello() { return "Hello Frengky"; }

    @GetMapping("/world")
    public String world() { return "Hello world"; }
}
