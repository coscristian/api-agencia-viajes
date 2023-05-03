package com.agencia.viajes.agencia.model.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "Plaza")
@Data
public class Plaza {
    @Id
    private Integer id;

    @Column(name = "descipcion", nullable = false, length = 30)
    private String descripcion;

    @Column(name = "precio", nullable = false)
    private Float precio;

    @ManyToOne
    @JoinColumn(name = "viaje", referencedColumnName = "codigo")
    private Viaje viaje;

    @ManyToOne
    @JoinColumn(name = "vuelo", referencedColumnName = "numero")
    private Vuelo vuelo;
}
