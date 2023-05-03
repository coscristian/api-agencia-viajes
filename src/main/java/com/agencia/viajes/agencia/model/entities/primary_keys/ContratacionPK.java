package com.agencia.viajes.agencia.model.entities.primary_keys;

import java.util.Date;

import com.agencia.viajes.agencia.model.entities.Sucursal;
import com.agencia.viajes.agencia.model.entities.Turista;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@EqualsAndHashCode
public class ContratacionPK {
    private Sucursal sucursal;
    private Turista turista;
    private Date fechaContratacion;
}
