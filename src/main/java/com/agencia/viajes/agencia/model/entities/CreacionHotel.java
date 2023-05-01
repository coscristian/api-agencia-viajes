package com.agencia.viajes.agencia.model.entities;

import java.util.Date;

import com.agencia.viajes.agencia.model.entities.keys.CreacionHotelId;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.IdClass;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "CreacionHotel")
@IdClass(CreacionHotelId.class)
@Data
public class CreacionHotel {
    @Id
    private String codigoAdminGeneral;

    @Id
    private Integer codigoHotel;

    @Column(name = "fecha_creacion", nullable = false)
    private Date fechaCreacion;

    @OneToOne
    private Hotel hotel;

    @ManyToOne
    private AdminGeneral adminGeneral;
}
