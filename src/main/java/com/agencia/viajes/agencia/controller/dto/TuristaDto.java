package com.agencia.viajes.agencia.controller.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

// Dto: Objetos que solo tienen, constructor, setter y getter
@Data // Permite generar los setter y getter
@AllArgsConstructor
@NoArgsConstructor
public class TuristaDto {
    private String codigo;
    private String nombre;
    private String apellidos;
    private String telefono;
}
