package com.agencia.viajes.agencia.model.entities;

import lombok.Data;
import lombok.Setter;
import lombok.AccessLevel;

@Data
public class Sucursal {
    @Setter(AccessLevel.NONE)
    private Integer codigo;
    private String telefono;
}
