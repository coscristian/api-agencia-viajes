package com.agencia.viajes.agencia.model.entities;

import java.util.Date;
import java.util.List;

import com.agencia.viajes.agencia.model.entities.keys.ContrataTieneRegimenId;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.IdClass;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "ContrataTieneRegimen")
@IdClass(ContrataTieneRegimenId.class)
@Data
public class ContrataTieneRegimen {
    @Id
    private Integer codigoSucursal;

    @Id
    private String codigoTurista;

    @Id
    private Date fechaContratacion;

    @Id
    private Integer idRegimen;

    @Column(name = "fecha_llegada", nullable = false)
    private Date fechaLlegada;

    @Column(name = "fecha_salida", nullable = false)
    private Date fechaSalida;

    @OneToMany
    private List<Contrata> contratos;

    @ManyToOne
    private Regimen regimen;
}
