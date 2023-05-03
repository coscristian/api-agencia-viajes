package com.agencia.viajes.agencia.model.entities;

import java.util.List;

import com.agencia.viajes.agencia.model.entities.primary_keys.ContratoHospedajePK;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.IdClass;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "ContratoHospedaje")
@Data
@IdClass(ContratoHospedajePK.class)
public class ContratoHospedaje {
    @Id
    @Column(name = "codigo_hotel")
    private Integer codigoHotel;

    @Id
    @Column(name = "id_regimen")
    private Integer idRegimen;

    @OneToMany(mappedBy = "contratoHospedaje")
    private List<Contratacion> contrataciones;
}
