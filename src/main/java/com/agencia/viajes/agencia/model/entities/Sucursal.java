package com.agencia.viajes.agencia.model.entities;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AccessLevel;
import lombok.Data;
import lombok.Setter;

@Entity
@Table(name = "Sucursal")
@Data
public class Sucursal {
    @Id
    @Setter(AccessLevel.NONE)
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer codigo;

    @Column(name = "telefono")
    private String telefono;

    @Column(name = "activo", nullable = false)
    private Boolean activo;

    @Column(name = "direccion", nullable = false)
    private String direccion;

    @Column(name = "ciudad", nullable = false)
    private String ciudad;

    @OneToMany(mappedBy = "sucursal")
    private List<TrabajoVendedor> trabajosVendedores;

    @OneToMany(mappedBy = "sucursal")
    private List<Vendedor> vendedores;

    @OneToMany(mappedBy = "sucursal")
    private List<TrabajoAdminSucursal> trabajosAdminSucursal;

    @OneToMany(mappedBy = "sucursal")
    private List<Contratacion> contrataciones;

}
