package com.agencia.viajes.agencia.controller.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data // Permite generar los setter y getter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class AdminGeneralDto {
    private String codigo;
    private String nombre;
    private String apellidos;
    private String telefono;
    private String direccion;
    private String ciudad;
    private Boolean activo;
}
