package com.agencia.viajes.agencia.model.entities;

import java.util.Date;
import java.util.List;

import com.agencia.viajes.agencia.model.entities.keys.VendedorTrabajaSucursalId;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.IdClass;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "VendedorTrabajaSucursal")
@Data
@IdClass(VendedorTrabajaSucursalId.class)
public class VendedorTrabajaSucursal {
    @Id
    private String codigoVendedor;
    
    @Id
    private Integer codigoSucursal;
    
    @Column(name = "fecha_inicio", nullable = false)
    private Date fechaInicio;

    @Column(name = "fecha_fin", nullable = true)
    private Date fechaFin;

    @OneToMany
    List<Vendedor> vendedores;
}
