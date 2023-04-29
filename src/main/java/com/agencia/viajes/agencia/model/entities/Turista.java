package com.agencia.viajes.agencia.model.entities;

import lombok.Data;

@Data
public class Turista {
    private String codigo, nombre, apellidos, telefono;
    private Integer idCalle;
}
