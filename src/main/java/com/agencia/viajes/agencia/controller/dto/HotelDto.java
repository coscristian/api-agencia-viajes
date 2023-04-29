package com.agencia.viajes.agencia.controller.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Hotel {
    private Integer codigo;
    private String nombre;
    private String telefono;
    private Integer plazasDisponibles;
    private Integer idCalle;
}
