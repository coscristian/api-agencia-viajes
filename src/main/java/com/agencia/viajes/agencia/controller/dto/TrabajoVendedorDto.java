package com.agencia.viajes.agencia.controller.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data // Permite generar los setter y getter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class TrabajoVendedorDto {
    private String fechaInicio, fechaFin, fechaAsignacion, codigoVendedor, codigoAdminGeneral;
    private Integer codigoSucursal;
}

