package com.agencia.viajes.agencia.model.entities;

import jakarta.persistence.Entity;
import lombok.Data;

@Entity
@Data
public class AdminSucursal {
    private String codigo, nombre, apellidos, telefono;
}
