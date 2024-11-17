package com.fnc.user.service.domain.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.UUID;

@Entity
@Table(name = "user_address")
@Getter
@Setter
public class UserAddressEntity extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(updatable = false, nullable = false)
    private UUID id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id", nullable = false)
    private UserEntity user;

    @Column(nullable = false)
    private String name;

    @Column(name = "full_address", nullable = false)
    private String fullAddress;

    @Column(name = "postal_code", nullable = false)
    private short postalCode;

    @Column(name = "is_main_address", nullable = false)
    private boolean isMainAddress;
}

