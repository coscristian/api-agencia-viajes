package com.agencia.viajes.agencia.model.entities;

import java.util.Date;

import com.agencia.viajes.agencia.model.entities.primary_keys.TrabajoVendedorPK;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.IdClass;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "TrabajoVendedor")
@Data
@IdClass(TrabajoVendedorPK.class)
public class TrabajoVendedor {
    @Id
    @ManyToOne
    @JoinColumn(name = "cod_vendedor", referencedColumnName = "codigo")
    private Vendedor vendedor;

    @Id
    @ManyToOne
    @JoinColumn(name = "cod_sucursal", referencedColumnName = "codigo")
    private Sucursal sucursal;

    @Column(name = "fecha_inicio", nullable = false)
    private String fechaInicio;

    @Column(name = "fecha_fin", nullable = true)
    private String fechaFin;

    @Column(name = "fecha_asignacion", nullable = false)
    private String fechaAsignacion;

    @ManyToOne
    @JoinColumn(name = "cod_admin_general", referencedColumnName = "codigo")
    private AdminGeneral adminGeneral;

}


