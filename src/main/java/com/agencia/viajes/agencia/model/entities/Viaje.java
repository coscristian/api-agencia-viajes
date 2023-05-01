package com.agencia.viajes.agencia.model.entities;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.Setter;
import lombok.AccessLevel;


@Entity
@Table(name = "Viaje")
@Data
public class Viaje {
    
    @Setter(AccessLevel.NONE)
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer codigo;

    @Column(name = "fecha_inicio", nullable = false)
    private Date fechaInicio;

    @Column(name = "fecha_fin", nullable = false)
    private Date fechaFin;

    @Column(name = "precio_total", nullable = false)
    private Float precioTotal;

    @OneToOne
    private ContratacionRealizaViaje contratacionRealizaViaje;

    @OneToOne
    private ContrataUna contrataUna;
}
