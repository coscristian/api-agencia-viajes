package com.agencia.viajes.agencia.model.entities;

import java.util.Date;
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
import lombok.AccessLevel;
import lombok.Data;
import lombok.Setter;

@Entity
@Table(name = "Vuelo")
@Data
public class Vuelo {
    @Id
    @Setter(AccessLevel.NONE)
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer numero;

    @Column(name = "fecha_salida")
    private Date fechaSalida;

    @Column(name = "fecha_llegada")
    private Date fechaLlegada;

    @ManyToOne
    @JoinColumn(name = "id_aeropuerto_salida", referencedColumnName = "id")
    private Aeropuerto aeropuertoSalida;

    @JoinColumn(name = "id_aeropuerto_llegada", referencedColumnName = "id")
    private Aeropuerto aeropuertoLlegada;

    @OneToMany(mappedBy = "vuelo")
    private List<Plaza> plazas;
}
