package com.agencia.viajes.agencia.model.entities;

import java.util.Date;

import com.agencia.viajes.agencia.model.entities.keys.ContratacionRealizaViajeId;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.IdClass;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "ContratacionRealizaViaje")
@IdClass(ContratacionRealizaViajeId.class)
@Data
public class ContratacionRealizaViaje {
    @Id
    private Integer codigoViaje;

    @Id
    private Integer codigoSucursal;

    @Id
    private Integer codigoTurista;

    @Id
    private Date fechaContratoSucursal;

    @Column(name = "fecha_contrato_viaje", nullable = false)
    private Date fechaContratoViaje;

    @ManyToOne
    private Sucursal sucursal;

    @OneToOne
    private Turista turista;

    @OneToOne
    private Contrata contrata;

    @OneToOne
    private Viaje viaje;
}
