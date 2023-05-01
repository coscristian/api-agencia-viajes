package com.agencia.viajes.agencia.model.entities;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "AdminGeneral")
@Data
public class AdminGeneral {
    @Id
    private String codigo;

    @Column(name = "nombre", nullable = false, length = 25)
    private String nombre;

    @Column(name = "apellidos", nullable = false, length = 25)
    private String apellidos;

    @Column(name = "telefono", nullable = true, length = 10)
    private String telefono;

    @Column(name = "activo", nullable = false)
    private Boolean activo;

    @Column(name = "id_calle")
    private Integer idCalle;

    @OneToMany
    private List<CreacionVendedor> creacionVendedor;

    @OneToMany
    private List<AsignacionTrabajoVendedor> asignacionTrabajoVendedor;

    @OneToMany
    private List<AsignacionTrabajoAdminSucursal> asignacionTrabajoAdminSucursal;

    @OneToMany
    private List<CreacionAdminSucursal> creacionAdminSucursales;

}
