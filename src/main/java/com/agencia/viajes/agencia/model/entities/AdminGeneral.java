package com.agencia.viajes.agencia.model.entities;

import jakarta.persistence.Entity;
import lombok.Data;

@Entity
@Data
public class AdminGeneral {
    private String codigo, nombre, apellidos, telefono;
    private Integer idCalle;
}
