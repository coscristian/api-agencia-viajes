package com.agencia.viajes.agencia.model.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "Regimen")
@Data
public class Regimen {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    
    @Column(name = "descripcion", nullable = false, length = 100)
    private String descripcion;

    @Column(name = "precio", nullable = false)
    private Float precio;
}
