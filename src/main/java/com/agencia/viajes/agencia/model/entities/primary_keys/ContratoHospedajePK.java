package com.agencia.viajes.agencia.model.entities.primary_keys;

import java.io.Serializable;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data
@EqualsAndHashCode
public class ContratoHospedajePK implements Serializable{
    private Integer codigoHotel;
    private Integer idRegimen;
}
