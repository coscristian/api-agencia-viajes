package com.agencia.viajes.agencia.model.entities;

import java.util.Date;

import com.agencia.viajes.agencia.model.entities.keys.AsignacionTrabajoVendedorId;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.IdClass;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@IdClass(AsignacionTrabajoVendedorId.class)
@Table(name = "AsignacionTrabajoVendedor")
public class AsignacionTrabajoVendedor {
    @Id
    private String codigoAdminGeneral;

    @Id
    private String codigoVendedor;

    @Id
    private Integer codigoSucursal;

    @Column(name = "fecha_asignacion", nullable = false)
    private Date fechaAsignacion;

    @OneToOne
    private Vendedor vendedor;

    @OneToOne
    private Sucursal sucursal;

    @ManyToOne
    private AdminGeneral adminGeneral;

}
