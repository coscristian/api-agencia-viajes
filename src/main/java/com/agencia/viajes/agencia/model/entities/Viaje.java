package com.agencia.viajes.agencia.model.entities;

import java.util.Date;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AccessLevel;
import lombok.Data;
import lombok.Setter;

@Entity
@Table(name = "Viaje")
@Data
public class Viaje {
    @Id
    @Setter(AccessLevel.NONE)
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer codigo;

    private Date fechaInicio;

    private Date fechaFin;

    @OneToMany(mappedBy = "viaje")
    private List<Contratacion> contrataciones;

    @OneToMany(mappedBy = "viaje")
    private List<Plaza> plazas;
    
}
