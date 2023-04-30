package com.agencia.viajes.agencia.model.entities;

import java.util.Date;

import com.agencia.viajes.agencia.model.entities.keys.CreacionVendedorId;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.IdClass;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "CreacionVendedor")
@IdClass(CreacionVendedorId.class)
@Data
public class CreacionVendedor {
    @Id
    private String codigoAdminGeneral;

    @Id
    private String codigoVendedor;

    @Column(name = "fecha_creacion")
    private Date fechaCreacion;

    @ManyToOne
    private Vendedor vendedor;
}
