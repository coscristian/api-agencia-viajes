package com.agencia.viajes.agencia.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.agencia.viajes.agencia.model.entities.Sucursal;

@Repository
public interface SucursalRepository extends JpaRepository<Sucursal, Integer>{
    
}
