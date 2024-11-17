package com.fnc.warehouse.service.dataaccess.warehouse.entity;

import com.fnc.warehouse.service.domain.dto.create.WarehouseLocation;
import com.fnc.warehouse.service.domain.valueObject.WarehouseStatus;
import jakarta.persistence.*;
import lombok.*;

import java.util.Objects;
import java.util.UUID;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "warehouse")
@Entity
public class WarehouseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;

    private String name;

    @Enumerated(EnumType.STRING)
    private WarehouseStatus warehouseStatus;

    private String failureMessages;

    @OneToOne(cascade = CascadeType.ALL, mappedBy = "warehouse")
    private WarehouseLocationEntity warehouseLocation;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        WarehouseEntity that = (WarehouseEntity) o;
        return id.equals(that.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
