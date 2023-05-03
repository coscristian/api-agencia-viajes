package com.agencia.viajes.agencia.model.entities;

import java.util.Date;

import com.agencia.viajes.agencia.model.entities.primary_keys.TrabajoAdminSucursalPK;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.IdClass;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "TrabajoAdminSucursal")
@Data
@IdClass(TrabajoAdminSucursalPK.class)
public class TrabajoAdminSucursal {
    @Id
    @ManyToOne
    @JoinColumn(name = "cod_admin_sucursal", referencedColumnName = "codigo")
    private AdminSucursal adminSucursal;

    @Id
    @ManyToOne
    @JoinColumn(name = "cod_sucursal", referencedColumnName = "codigo")
    private Sucursal sucursal;

    @Id
    @Column(name = "fecha_asignacion", nullable = false)
    private Date fechaAsignacion;

    @Column(name = "fecha_inicio", nullable = false)
    private Date fechaInicio;

    @Column(name = "fecha_fin", nullable = true)
    private Date fechaFin;

    @ManyToOne
    @JoinColumn(name = "cod_admin_general", referencedColumnName = "codigo")
    private AdminGeneral adminGeneral;
}
