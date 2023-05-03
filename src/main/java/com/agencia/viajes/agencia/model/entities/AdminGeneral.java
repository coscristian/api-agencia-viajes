package com.agencia.viajes.agencia.model.entities;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "AdminGeneral")
@Data
public class AdminGeneral {
    @Id
    @Column(name = "codigo")
    private String codigo;

    @Column(name = "nombre", nullable = false, length = 25)
    private String nombre;

    @Column(name = "apellidos", nullable = false, length = 25)
    private String apellidos;

    @Column(name = "telefono", nullable = true, length = 10)
    private String telefono;

    @Column(name = "activo", nullable = false)
    private Boolean activo;

    //@ManyToOne
    //private Calle calle;

    @OneToMany(mappedBy = "adminGeneral")
    private List<TrabajoVendedor> trabajoVendedor;

    @OneToMany(mappedBy = "adminGeneral")
    private List<Vendedor> vendedores;

    @OneToMany(mappedBy = "adminGeneral")
    private List<AdminSucursal> administradoresSucursales;

    @ManyToOne
    @JoinColumn(name = "id_calle", referencedColumnName = "id")
    private Calle calle;

    @OneToMany(mappedBy = "adminGeneral")
    private List<Hotel> hoteles;

    @OneToMany(mappedBy = "adminGeneral")
    private List<TrabajoAdminSucursal> trabajosAdminSucursal;

    /*
    @OneToMany 
    private List<Vendedor> vendedores;

    @OneToMany
    private List<AdminSucursal> adminSucursales;

    @OneToMany
    private List<Hotel> hoteles;

    @OneToMany
    private List<CreacionVendedor> creacionVendedor;

    @OneToMany
    private List<AsignacionTrabajoVendedor> asignacionTrabajoVendedor;

    @OneToMany
    private List<AsignacionTrabajoAdminSucursal> asignacionTrabajoAdminSucursal;

    @OneToMany
    private List<CreacionAdminSucursal> creacionAdminSucursales;

    @OneToMany
    private List<CreacionHotel> creacionHoteles;
 */
}
