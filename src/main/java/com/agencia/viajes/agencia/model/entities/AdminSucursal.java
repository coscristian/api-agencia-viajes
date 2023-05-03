package com.agencia.viajes.agencia.model.entities;

import java.util.Date;
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
@Table(name = "AdminSucursal")
@Data
public class AdminSucursal {
    @Id
    private String codigo;

    @Column(name = "nombre", nullable = false, length = 25)
    private String nombre;

    @Column(name = "telefono", nullable = false, length = 10)
    private String telefono;

    @Column(name = "fecha_creacion", nullable = false)
    private Date fechaCreacion;

    @Column(name = "activo", nullable = false)
    private Boolean activo;

    @ManyToOne
    @JoinColumn(name = "cod_admin_general", referencedColumnName = "codigo")
    private AdminGeneral adminGeneral;

    @OneToMany(mappedBy = "adminSucursal")
    List<TrabajoAdminSucursal> trabajos;
}
