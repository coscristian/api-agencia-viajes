package com.agencia.viajes.agencia.controller.dto;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class VendedorDto {
    private String codigo;
    private String nombre, apellidos, telefono;
    private Integer codigoSucursal;
    private String codigoAdminGeneral;
    private String fechaInicio;
    private String fechaFin;
    private String fechaAsignacion;
    private Boolean activo;
}
