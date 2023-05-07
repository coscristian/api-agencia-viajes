package com.agencia.viajes.agencia.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.agencia.viajes.agencia.model.entities.AdminGeneral;

@Repository
public interface AdminGeneralRepository extends JpaRepository<AdminGeneral, String>{
        
}
