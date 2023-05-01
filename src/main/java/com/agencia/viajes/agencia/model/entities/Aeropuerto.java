package com.agencia.viajes.agencia.model.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.Setter;
import lombok.AccessLevel;

@Entity
@Table(name = "Aeropuerto")
@Data
public class Aeropuerto {
    @Id
    @Setter(AccessLevel.NONE)
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @Column(name = "nombre", nullable = false, length = 25)
    private String nombre;

    @Column(name = "codigo_iata", nullable = false, length = 5)
    private String codigoIata;

    @OneToOne
    private OrigenVuelo origenVuelo;

    @OneToOne
    private DestinoVuelo destinoVuelo;
}
