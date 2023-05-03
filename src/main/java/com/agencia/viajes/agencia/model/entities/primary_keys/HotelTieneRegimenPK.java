package com.agencia.viajes.agencia.model.entities.primary_keys;

import java.io.Serializable;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@EqualsAndHashCode
public class HotelTieneRegimenPK implements Serializable{
    private Integer codigoHotel;
    private Integer idRegimen;
}
