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
@Table(name = "Vendedor")
@Data
public class Vendedor {
    @Id
    @Column(name = "codigo", nullable=false, length = 10)
    private String codigo;

    @Column(name = "nombre", nullable = false, length = 25)
    private String nombre;

    @Column(name = "apellidos", nullable = false, length = 25)
    private String apellidos;

    @Column(name = "telefono", nullable = false, length = 10)
    private String telefono;

    @ManyToOne
    @JoinColumn(name = "cod_sucursal", referencedColumnName = "codigo")
    private Sucursal sucursal;

    @ManyToOne
    @JoinColumn(name = "cod_admin_general", referencedColumnName = "codigo")
    private AdminGeneral adminGeneral;

    @OneToMany(mappedBy = "vendedor")
    private List<Contratacion> contrataciones;
    
}
