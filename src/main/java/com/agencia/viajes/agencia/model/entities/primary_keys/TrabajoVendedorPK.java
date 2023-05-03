package com.agencia.viajes.agencia.model.entities.primary_keys;

import java.io.Serializable;

import com.agencia.viajes.agencia.model.entities.Sucursal;
import com.agencia.viajes.agencia.model.entities.Vendedor;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@EqualsAndHashCode
public class TrabajoVendedorPK implements Serializable{
    private Vendedor vendedor;
    private Sucursal sucursal;
}
