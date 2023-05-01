package com.agencia.viajes.agencia.model.entities;

import com.agencia.viajes.agencia.model.entities.keys.ContrataUnaId;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.IdClass;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "ContrataUna")
@IdClass(ContrataUnaId.class)
@Data
public class ContrataUna {
    @Id
    private Integer codigoViaje;

    @Id
    private Integer idPlaza;

    @OneToOne
    private Viaje viaje;

    @OneToOne
    private Plaza plaza;
}
