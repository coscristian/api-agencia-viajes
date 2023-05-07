package com.agencia.viajes.agencia.model.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.IdClass;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.persistence.UniqueConstraint;
import lombok.AccessLevel;
import lombok.Data;
import lombok.Setter;

@Entity
@Table(name = "TrabajoVendedor", uniqueConstraints = {@UniqueConstraint(columnNames = { "cod_vendedor", "cod_sucursal" })})
@Data
//@IdClass(TrabajoVendedorPK.class)
public class TrabajoVendedor {

    @Id
    @Setter(AccessLevel.NONE)
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id_trabajo")
    private Integer idTrabajo;

    @Column(name = "fecha_inicio", nullable = false)
    private String fechaInicio;

    @Column(name = "fecha_fin", nullable = true)
    private String fechaFin;

    @Column(name = "fecha_asignacion", nullable = false)
    private String fechaAsignacion;

    @ManyToOne
    @JoinColumn(name = "cod_admin_general", referencedColumnName = "codigo")
    private AdminGeneral adminGeneral;

    //  @Id
    @ManyToOne
    @JoinColumn(name = "cod_vendedor", referencedColumnName = "codigo")
    private Vendedor vendedor;

    //@Id
    @ManyToOne
    @JoinColumn(name = "cod_sucursal", referencedColumnName = "codigo")
    private Sucursal sucursal;

}


