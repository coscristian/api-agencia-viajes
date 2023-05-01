package com.agencia.viajes.agencia.model.entities;

import java.util.Date;

import com.agencia.viajes.agencia.model.entities.keys.VentaContratacionId;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.IdClass;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "VentaContratacion")
@IdClass(VentaContratacionId.class)
@Data
public class VentaContratacion {
    @Id
    private Integer codigoVendedor;

    @Id
    private Integer codigoSucursal;

    @Id
    private Integer codigoTurista;

    @Column(name = "fecha_venta", nullable = false)
    private Date fechaVenta;

    @ManyToOne
    private Vendedor vendedor;

    @ManyToOne
    private Sucursal sucursal;

    @ManyToOne
    private Turista turista;

}
