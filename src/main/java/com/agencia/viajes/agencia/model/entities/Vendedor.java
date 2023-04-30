package com.agencia.viajes.agencia.model.entities;

import jakarta.persistence.Entity;
import lombok.Data;

@Entity
@Data
public class Vendedor {
    private String codigo, nombre, apellidos, telefono;
}
