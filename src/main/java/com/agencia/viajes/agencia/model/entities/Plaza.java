package com.agencia.viajes.agencia.model.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.Setter;
import lombok.AccessLevel;

@Entity
@Table(name = "Plaza")
@Data
public class Plaza {
    @Id
    @Setter(AccessLevel.NONE)
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @Column(name = "descripcion", nullable = false, length = 30)
    private String descripcion;

    @Column(name = "precio", nullable = false)
    private Float precio;
}
