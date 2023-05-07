package com.agencia.viajes.agencia.service.impl;

import org.springframework.stereotype.Service;

import com.agencia.viajes.agencia.controller.dto.TrabajoVendedorDto;
import com.agencia.viajes.agencia.model.entities.TrabajoVendedor;
import com.agencia.viajes.agencia.model.repository.AdminGeneralRepository;
import com.agencia.viajes.agencia.model.repository.SucursalRepository;
import com.agencia.viajes.agencia.model.repository.TrabajoVendedorRepository;
import com.agencia.viajes.agencia.model.repository.VendedorRepository;
import com.agencia.viajes.agencia.service.TrabajoVendedorService;

import lombok.AllArgsConstructor;

@AllArgsConstructor
@Service // Hay una clase(bean) que implementa una interface y hace parte de un servicio
public class TrabajoServiceImpl implements TrabajoVendedorService{
    
    private final VendedorRepository vendedorRepository;
    private final SucursalRepository sucursalRepository;
    private final AdminGeneralRepository adminGeneralRepository;
    private final TrabajoVendedorRepository trabajoVendedorRepository;

    @Override
    public void save(TrabajoVendedorDto trabajoVendedorDto) {
        
        TrabajoVendedor trabajoVendedorDb = new TrabajoVendedor();

        trabajoVendedorDb.setFechaInicio(trabajoVendedorDto.getFechaInicio());
        trabajoVendedorDb.setFechaFin(trabajoVendedorDto.getFechaFin());
        trabajoVendedorDb.setFechaAsignacion(trabajoVendedorDto.getFechaAsignacion());

        var adminGeneralOp = adminGeneralRepository.findById(trabajoVendedorDto.getCodigoAdminGeneral());
        trabajoVendedorDb.setAdminGeneral(adminGeneralOp.get());

        var vendedorOp = vendedorRepository.findById(trabajoVendedorDto.getCodigoVendedor());
        trabajoVendedorDb.setVendedor(vendedorOp.get());

        var sucursalOp = sucursalRepository.findById(trabajoVendedorDto.getCodigoSucursal());
        trabajoVendedorDb.setSucursal(sucursalOp.get());

        trabajoVendedorRepository.save(trabajoVendedorDb);
    }
    
}
