package com.mftplus.eesample.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

@NoArgsConstructor
@Getter
@Setter
@SuperBuilder

@Entity(name = "roleEntity")
@Table(name = "roles")
public class Role {
    @Id
    @Column(name = "role_name", length = 20)
    private String roleName;
}
