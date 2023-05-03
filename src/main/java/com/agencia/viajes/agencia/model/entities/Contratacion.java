package com.agencia.viajes.agencia.model.entities;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinColumns;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "Contratacion")
@Data
public class Contratacion {
    @Id
    @ManyToOne
    @JoinColumn(name = "cod_sucursal", referencedColumnName = "codigo")
    private Sucursal sucursal;

    @Id
    @ManyToOne
    @JoinColumn(name = "cod_turista", referencedColumnName = "codigo")
    private Turista turista;

    @Id
    @Column(name = "fecha_contratacion", nullable = false)
    private Date fechaContratacion;

    @ManyToOne
    @JoinColumn(name = "cod_vendedor", referencedColumnName = "codigo")
    private Vendedor vendedor;

    @Column(name = "fecha_venta", nullable = false)
    private Date fechaVenta;

    @Column(name = "precio_total", nullable = false)
    private Float precioTotal;

    @ManyToOne
    @JoinColumn(name = "cod_viaje", referencedColumnName = "codigo")
    private Viaje viaje;

    @Column(name = "fecha_llegada_hospedaje", nullable = true)
    private Date fechaLlegadaHospedaje;
    
    @Column(name = "fecha_salida_hospedaje", nullable = true)
    private Date fechaSalidaHospedaje;

    @ManyToOne
    @JoinColumns({
        @JoinColumn(name = "cod_hotel", referencedColumnName = "codigo_hotel"),
        @JoinColumn(name = "id_regimen", referencedColumnName = "id_regimen")
    })
    private ContratoHospedaje contratoHospedaje;
}
