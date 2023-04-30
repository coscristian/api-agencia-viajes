package com.agencia.viajes.agencia.model.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "Turista")
@Data
public class Turista {
    @Id
    private String codigo; 

    @Column(name = "nombre", nullable = false, length = 25)
    private String nombre; 

    @Column(name = "apellidos", nullable = false, length = 40)
    private String apellidos;

    @Column(name = "telefono", nullable = true, length = 10)
    private String telefono;

    @Column(name = "activo", nullable = false)
    private Boolean activo;

    @Column(name = "id_calle", nullable = false)
    private Integer idCalle;

    @ManyToOne
    private Calle calle;

}
