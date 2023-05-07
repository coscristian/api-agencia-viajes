package com.agencia.viajes.agencia.model.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.agencia.viajes.agencia.model.entities.TrabajoVendedor;

@Repository
public interface TrabajoVendedorRepository extends JpaRepository<TrabajoVendedor, Integer>{
    //Optional<TrabajoVendedor> findByVendedor(String vendedor);
}
