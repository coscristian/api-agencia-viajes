package com.agencia.viajes.agencia.model.entities;

import java.util.Date;

import com.agencia.viajes.agencia.model.entities.keys.OrigenVueloId;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.IdClass;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "OrigenVuelo")
@IdClass(OrigenVueloId.class)
@Data
public class OrigenVuelo {
    @Id
    private Integer numeroVuelo;

    @Id
    private Integer idAeropuerto;

    @Column(name = "fecha_salida", nullable = false)
    private Date fechaSalida;

    @OneToOne
    private Vuelo vuelo;

    @OneToOne
    private Aeropuerto aeropuerto;
}
