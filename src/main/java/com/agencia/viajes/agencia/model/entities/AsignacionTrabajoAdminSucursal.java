package com.agencia.viajes.agencia.model.entities;

import java.util.Date;

import com.agencia.viajes.agencia.model.entities.keys.AsignacionTrabajoAdminSucursalId;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.IdClass;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "AsignacionTrabajoAdminSucursal")
@IdClass(AsignacionTrabajoAdminSucursalId.class)
@Data
public class AsignacionTrabajoAdminSucursal {
    @Id
    private String codigoAdminGeneral;

    @Id
    private String codigoAdminSucursal;

    @Id
    private Integer codigoSucursal;

    @Column(name = "fecha_asignacion", nullable = false)
    private Date fechaAsignacion;

    @ManyToOne
    private AdminGeneral adminGeneral;

    @OneToOne
    private AdminSucursal adminSucursal;

}
