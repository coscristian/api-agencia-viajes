package com.agencia.viajes.agencia.model.entities;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "Calle")
@Data
public class Calle {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @Column(name = "nombre", nullable = false, length = 25)
    private String nombre;

    @OneToMany(mappedBy = "calle")
    private List<AdminGeneral> adminsGeneral;

    @OneToMany(mappedBy = "calle")
    private List<Turista> turistas;

    @ManyToOne
    @JoinColumn(name = "id_ciudad", referencedColumnName = "id")
    private Ciudad ciudad;

    @OneToMany(mappedBy = "calle")
    private List<Hotel> hoteles;

}
