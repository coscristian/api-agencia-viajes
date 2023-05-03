package com.agencia.viajes.agencia.controller.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

// Dto: Objetos que solo tienen, constructor, setter y getter
// @Builder  Permite no usar el constructor completo, sino solo los datos que me interesan
@Data // Permite generar los setter y getter
@AllArgsConstructor
@NoArgsConstructor
public class TuristaDto {
    private String codigo;
    private String nombre;
    private String apellidos;
    private String telefono;
    private Boolean activo;
    private Integer idCalle;
}
