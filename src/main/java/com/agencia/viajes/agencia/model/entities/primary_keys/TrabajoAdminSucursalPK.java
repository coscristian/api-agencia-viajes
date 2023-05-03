package com.agencia.viajes.agencia.model.entities.primary_keys;

import java.io.Serializable;
import java.util.Date;

import com.agencia.viajes.agencia.model.entities.AdminSucursal;
import com.agencia.viajes.agencia.model.entities.Sucursal;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data
@EqualsAndHashCode
public class TrabajoAdminSucursalPK implements Serializable{
    private AdminSucursal adminSucursal;
    private Sucursal sucursal;
    private Date fechaAsignacion;
}
