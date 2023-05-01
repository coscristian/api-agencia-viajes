package com.agencia.viajes.agencia.model.entities;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "AdminSucursal")
@Data
public class AdminSucursal {
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

    @OneToMany
    private List<AdminTrabajaSucursal> adminTrabajaSucursal;

    @OneToOne
    private AsignacionTrabajoAdminSucursal asignacionTrabajoAdminSucursal;

    @OneToOne
    private CreacionAdminSucursal creacionAdminSucursal;
    

}
