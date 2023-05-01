package com.agencia.viajes.agencia.model.entities;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import lombok.Data;

@Entity
@Data
public class Vendedor {
    @Id
    private String codigo;

    @Column(name = "nombre")
    private String nombre;

    @Column(name = "apellidos")
    private String apellidos;

    @Column(name = "telefono")
    private String telefono;

    @ManyToOne
    private VendedorTrabajaSucursal vendedorTrabajaSucursal;

    @OneToOne
    AsignacionTrabajoVendedor asignacionTrabajoVendedor;

    @OneToMany
    List<VentaContratacion> ventaContratacion;
    

}
