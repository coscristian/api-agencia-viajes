package com.agencia.viajes.agencia.model.entities;

import java.util.Date;

import com.agencia.viajes.agencia.model.entities.keys.DestinoVueloId;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.IdClass;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "DestinoVuelo")
@IdClass(DestinoVueloId.class)
@Data
public class DestinoVuelo {
    @Id
    private Integer numeroVuelo;

    @Id
    private Integer idAeropuerto;

    @Column(name = "fecha_llegada", nullable = false)
    private Date fechaLlegada;

    @OneToOne
    private Aeropuerto aeropuerto;

    @OneToOne
    private Vuelo vuelo;
}
