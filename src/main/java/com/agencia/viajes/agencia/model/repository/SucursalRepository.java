package com.agencia.viajes.agencia.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.agencia.viajes.agencia.model.entities.Sucursal;

public interface SucursalRepository extends JpaRepository<Sucursal, Integer>{
    
}
