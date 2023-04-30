package com.agencia.viajes.agencia.model.entities;

import lombok.Data;
import lombok.Setter;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import lombok.AccessLevel;

@Entity
@Data
public class Sucursal {
    @Setter(AccessLevel.NONE)
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer codigo;
    private String telefono;
}
