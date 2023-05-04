package com.agencia.viajes.agencia.service.impl;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.agencia.viajes.agencia.controller.dto.SucursalDto;
import com.agencia.viajes.agencia.model.repository.SucursalRepository;
import com.agencia.viajes.agencia.service.SucursalService;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class SucursalServiceImp implements SucursalService{
    
    private final SucursalRepository sucursalRepository;

    @Override
    public List<SucursalDto> getSucursales() {
        var sucursales = sucursalRepository.findAll();
        return sucursales.stream().map(s -> 
            SucursalDto.builder()
            .codigo(s.getCodigo())
            .telefono(s.getTelefono())
            .direccion(s.getDireccion())
            .ciudad(s.getCiudad())
            .build())
            .collect(Collectors.toList());
    }
}
    

    
