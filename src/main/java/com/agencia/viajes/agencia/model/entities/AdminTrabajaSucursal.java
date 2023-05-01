package com.agencia.viajes.agencia.model.entities;

import java.util.Date;

import com.agencia.viajes.agencia.model.entities.keys.AdminTrabajaSucursalId;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.IdClass;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "AdminTrabajaSucursal")
@IdClass(AdminTrabajaSucursalId.class)
@Data
public class AdminTrabajaSucursal {
    @Id
    private String codigoAdminSucursal;
    
    @Id
    private Integer codigoSucursal;

    @Column(name = "fecha_inicio")
    private Date fechaInicio;

    @Column(name = "fecha_fin")
    private Date fechaFin;

    @ManyToOne
    private AdminSucursal adminSucursal;

}
