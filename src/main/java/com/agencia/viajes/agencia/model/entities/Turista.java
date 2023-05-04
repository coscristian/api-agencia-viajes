package com.agencia.viajes.agencia.model.entities;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "Turista")
@Data
public class Turista {
    @Id
    @Column(name = "codigo", nullable = false, length = 10)
    private String codigo;

    @Column(name = "nombre", nullable = false, length = 25)
    private String nombre;

    @Column(name = "apellidos", nullable = false, length = 25)
    private String apellidos;

    @Column(name = "telefono", nullable = false, length = 10)
    private String telefono;

    @Column(name = "activo", nullable = false)
    private Boolean activo;

    @Column(name = "direccion", nullable = false)
    private String direccion;

    @Column(name = "ciudad", nullable = false)
    private String ciudad;

    @OneToMany(mappedBy = "turista")
    private List<Contratacion> contrataciones;
}
