package com.agencia.viajes.agencia.model.entities;

import java.util.Date;

import com.agencia.viajes.agencia.model.entities.keys.ContrataId;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.IdClass;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "Contrata")
@IdClass(ContrataId.class)
@Data
public class Contrata {
    @Id
    private Integer codigoSucursal;

    @Id
    private String codigoTurista;

    @Id
    private Date fechaContratacion;

    @Column(name = "activo", nullable = false)
    private Boolean activo;

    @ManyToOne
    private Turista turista;

    @ManyToOne
    private Sucursal sucursal;

    @OneToOne
    private ContratacionRealizaViaje contratacionRealizaViaje;

    @ManyToOne
    private ContrataTieneRegimen contrataTieneRegimen;

}
