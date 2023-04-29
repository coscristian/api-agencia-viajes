package com.agencia.viajes.agencia.controller.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data // Permite generar los setter y getter
@AllArgsConstructor
@NoArgsConstructor
public class AdminGeneral {
    private String codigo;
    private String nombre;
    private String apellidos;
    private String telefono;
}
