package com.agencia.viajes.agencia.controller.dto;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class VendedorDto {
    private String codigo;
    private String nombre, apellidos, telefono;
    private Integer codigoSucursal;
    private Integer codigoAdminGeneral;
    private Date fechaInicio;
    private Date fechaFin;
    private Date fechaAsignacion;
}
