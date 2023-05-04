package com.agencia.viajes.agencia.controller.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class SucursalDto {
    private Integer codigo;
    private String telefono;
    private String direccion;
    private String ciudad;
}
