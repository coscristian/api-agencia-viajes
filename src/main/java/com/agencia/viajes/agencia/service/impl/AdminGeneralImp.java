package com.agencia.viajes.agencia.service.impl;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.agencia.viajes.agencia.controller.dto.AdminGeneralDto;
import com.agencia.viajes.agencia.model.repository.AdminGeneralRepository;
import com.agencia.viajes.agencia.service.AdminGeneralService;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class AdminGeneralImp implements AdminGeneralService{

    private final AdminGeneralRepository adminGeneralRepository;

    @Override
    public List<AdminGeneralDto> getAdminsGeneral() {
        var adminsGeneral = adminGeneralRepository.findAll();
        return adminsGeneral.stream().map(admin ->
            AdminGeneralDto.builder()
            .codigo(admin.getCodigo())
            .nombre(admin.getNombre())
            .apellidos(admin.getApellidos())
            .telefono(admin.getTelefono())
            .direccion(admin.getDireccion())
            .ciudad(admin.getCiudad())
            .activo(admin.getActivo())
            .build())
            .collect(Collectors.toList());
    }
    
}
