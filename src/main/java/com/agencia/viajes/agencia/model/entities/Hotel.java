package com.agencia.viajes.agencia.model.entities;

import lombok.Data;
import lombok.Setter;
import lombok.AccessLevel;

@Data
public class Hotel {
    @Setter(AccessLevel.NONE)
    private String codigo;
    private String nombre, telefono;
    private Integer plazasDisponibles, idCalle;
}
