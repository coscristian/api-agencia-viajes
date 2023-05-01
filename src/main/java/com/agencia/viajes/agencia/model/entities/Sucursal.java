package com.agencia.viajes.agencia.model.entities;

import lombok.Data;
import lombok.Setter;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.OneToMany;
import lombok.AccessLevel;

@Entity
@Data
public class Sucursal {
    @Setter(AccessLevel.NONE)
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer codigo;
    
    @Column(name = "telefono", nullable = false, length = 10)
    private String telefono;

    @Column(name = "id_ciudad", nullable = false)
    private Integer idCiudad;

    @Column(name = "activo", nullable = false)
    private Boolean activo;

    @OneToMany
    private List<AdminTrabajaSucursal> adminTrabajaSucursal;
}
