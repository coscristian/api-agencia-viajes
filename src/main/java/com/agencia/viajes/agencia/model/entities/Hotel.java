package com.agencia.viajes.agencia.model.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "Hotel")
@Data
public class Hotel {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer codigo;

    @Column(name = "nombre", nullable = false, length = 25)
    private String nombre;

    @Column(name = "telefono", nullable = true, length = 10)
    private String telefono;

    @Column(name = "activo", nullable = false)
    private Boolean activo;

    @Column(name = "plazas_disponibles", nullable = false)
    private Integer plazasDisponibles;

    @Column(name = "direccion", nullable = false)
    private String direccion;

    @Column(name = "ciudad", nullable = false)
    private String ciudad;

    @ManyToOne
    @JoinColumn(name = "cod_admin_general", referencedColumnName = "codigo")
    private AdminGeneral adminGeneral;
}
