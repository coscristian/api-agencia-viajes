package com.agencia.viajes.agencia.model.entities.primary_keys;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@EqualsAndHashCode
public class TrabajoVendedorPK implements Serializable{
    private String codigoVendedor;
    private Integer codigoSucursal;
}
