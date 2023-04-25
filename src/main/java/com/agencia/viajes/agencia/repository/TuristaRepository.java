package com.agencia.viajes.agencia.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.agencia.viajes.agencia.model.Turista;

@Repository
public interface TuristaRepository extends JpaRepository<Turista, String>{

}
