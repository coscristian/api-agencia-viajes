package com.agencia.viajes.agencia.model.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.IdClass;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "HotelTieneRegimen")
@Data
@IdClass(HotelTieneRegimen.class)
public class HotelTieneRegimen {
    @Id
    @ManyToOne
    @JoinColumn(name = "cod_hotel", referencedColumnName = "codigo")
    private Hotel codigoHotel;

    @Id
    @ManyToOne
    @JoinColumn(name = "id_regimen", referencedColumnName = "id")
    private Regimen idRegimen;
}
