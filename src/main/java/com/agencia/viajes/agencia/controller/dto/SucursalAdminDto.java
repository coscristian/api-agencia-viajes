package com.agencia.viajes.agencia.controller.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class SucursalAdminDto {
    private String codigo;
    private String nombre, apellidos, telefono;
}
