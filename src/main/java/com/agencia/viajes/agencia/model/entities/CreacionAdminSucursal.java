package com.agencia.viajes.agencia.model.entities;

import java.util.Date;

import com.agencia.viajes.agencia.model.entities.keys.CreacionAdminSucursalId;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.IdClass;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "CreacionAdminSucursal")
@IdClass(CreacionAdminSucursalId.class)
@Data
public class CreacionAdminSucursal {
    @Id
    private String codigoAdminGeneral;
    @Id
    private String codigoAdminSucursal;

    @Column(name = "fecha_creacion", nullable = false)
    private Date fechaCreacion;

    @ManyToOne
    private AdminGeneral adminGeneral;

    @OneToOne
    private AdminSucursal adminSucursal;
}
