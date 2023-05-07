package com.agencia.viajes.agencia.service.impl;

import org.springframework.stereotype.Service;

import com.agencia.viajes.agencia.controller.dto.VendedorDto;
import com.agencia.viajes.agencia.model.entities.Vendedor;
import com.agencia.viajes.agencia.model.repository.AdminGeneralRepository;
import com.agencia.viajes.agencia.model.repository.SucursalRepository;
import com.agencia.viajes.agencia.model.repository.VendedorRepository;
import com.agencia.viajes.agencia.service.VendedorService;

import lombok.AllArgsConstructor;

@AllArgsConstructor
@Service
public class VendedorServiceImpl implements VendedorService{
    private final VendedorRepository vendedorRepository;
    private final AdminGeneralRepository adminGeneralRepository;
    private final SucursalRepository sucursalRepository;

    public void saveVendedor(VendedorDto vendedorDto){
        Vendedor vendedorDb = new Vendedor();
        vendedorDb.setCodigo(vendedorDto.getCodigo());
        vendedorDb.setNombre(vendedorDto.getNombre());
        vendedorDb.setApellidos(vendedorDto.getApellidos());
        vendedorDb.setTelefono(vendedorDto.getTelefono());
        vendedorDb.setActivo(vendedorDto.getActivo());
        var adminGeneral = adminGeneralRepository.findById(vendedorDto.getCodigoAdminGeneral());
        vendedorDb.setAdminGeneral(adminGeneral.get());

        var sucursal = sucursalRepository.findById(vendedorDto.getCodigoSucursal());
        vendedorDb.setSucursal(sucursal.get());

        vendedorRepository.save(vendedorDb);
    }

}
