package com.agencia.viajes.agencia.model.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.AccessLevel;
import lombok.Data;
import lombok.Setter;

@Entity
@Table(name = "Hotel")
@Data
public class Hotel {
    @Id
    @Setter(AccessLevel.NONE)
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer codigo;

    @Column(name = "nombre", nullable = false, length = 25)
    private String nombre;

    @Column(name = "telefono", nullable = false, length = 10)
    private String telefono;

    @Column(name = "plazas_disponibles", nullable = false)
    private Integer plazasDisponibles;

    @Column(name = "activo", nullable = false)
    private Boolean activo;

    @ManyToOne
    private Calle idCalle;

    @OneToOne
    private CreacionHotel creacionHotel;
}
