package com.agencia.viajes.agencia.model.entities;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.Setter;
import lombok.AccessLevel;


@Entity
@Table(name = "Vuelo")
@Data
public class Vuelo {
    @Id
    @Setter(AccessLevel.NONE)
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer numero;

    @Column(name = "fecha", nullable = false)
    private Date fecha; 

    @OneToOne
    private PlazaTieneVuelo plazaTieneVuelo;

    @OneToOne
    private OrigenVuelo origenVuelo;

    @OneToOne
    private DestinoVuelo destinoVuelo;
}
