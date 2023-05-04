package com.agencia.viajes.agencia.service;

import java.util.List;
import java.util.Optional;

import com.agencia.viajes.agencia.controller.dto.TuristaDto;

// Métodos o funciones que el controlador va a poder utilizar
public interface TuristaService {
    List<TuristaDto> getTuristas();
    Optional<TuristaDto> getTuristaById(String id); // Optional evita NULL pointer exception, es un contenedor que permite determinar si existe o no un dato
    void saveTurista(TuristaDto turistaDto);
}
