package com.agencia.viajes.agencia.model.entities;

import com.agencia.viajes.agencia.model.entities.keys.PlazaTieneVueloId;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.IdClass;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "PlazaTieneVuelo")
@IdClass(PlazaTieneVueloId.class)
@Data
public class PlazaTieneVuelo {
    @Id
    private Integer numeroVuelo;

    @Id
    private Integer idPlaza;

    @OneToOne
    private Plaza plaza;

    @OneToOne
    private Vuelo vuelo;
}
