package com.agencia.viajes.agencia.service.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.agencia.viajes.agencia.controller.dto.VendedorDto;
import com.agencia.viajes.agencia.model.entities.TrabajoVendedor;
import com.agencia.viajes.agencia.model.entities.Vendedor;
import com.agencia.viajes.agencia.model.repository.AdminGeneralRepository;
import com.agencia.viajes.agencia.model.repository.SucursalRepository;
import com.agencia.viajes.agencia.model.repository.TrabajoVendedorRepository;
import com.agencia.viajes.agencia.model.repository.VendedorRepository;
import com.agencia.viajes.agencia.service.VendedorService;

import lombok.AllArgsConstructor;

@AllArgsConstructor
@Service
public class VendedorServiceImpl implements VendedorService{
    private final VendedorRepository vendedorRepository;
    private final AdminGeneralRepository adminGeneralRepository;
    private final SucursalRepository sucursalRepository;
    private final TrabajoVendedorRepository trabajoVendedorRepository;

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

    @Override
    public List<VendedorDto> getVendedores() {
        var vendedoresDb = vendedorRepository.findAll();
        var trabajosDb = trabajoVendedorRepository.findAll();
        String fechaInicio = "", fechaFin = "", fechaAsignacion = "";
        List<VendedorDto> vendedoresDto = new ArrayList<>();

        for (Vendedor vendedor: vendedoresDb) {
            for (TrabajoVendedor trabajoVendedor : trabajosDb) {
                if(trabajoVendedor.getVendedor().getCodigo().equals(vendedor.getCodigo())){
                    fechaInicio = trabajoVendedor.getFechaInicio();
                    fechaFin = trabajoVendedor.getFechaFin();
                    fechaAsignacion = trabajoVendedor.getFechaAsignacion();
                }
            }

            var vendedorDto = VendedorDto.builder()
                .codigo(vendedor.getCodigo())
                .nombre(vendedor.getNombre())
                .apellidos(vendedor.getApellidos())
                .telefono(vendedor.getTelefono())
                .codigoSucursal(vendedor.getSucursal().getCodigo())
                .codigoAdminGeneral(vendedor.getAdminGeneral().getCodigo())
                .activo(vendedor.getActivo())
                .build();
            vendedoresDto.add(vendedorDto);
        }
        return vendedoresDto;

/*
        return vendedorRepository.findAll().stream()
            .map(vendedor ->
                VendedorDto.builder()
                .codigo(vendedor.getCodigo())
                .nombre(vendedor.getNombre())
                .apellidos(vendedor.getTelefono())
                .codigoSucursal(vendedor.getSucursal().getCodigo())
                .codigoAdminGeneral(vendedor.getAdminGeneral().getCodigo())
                //.fechaInicio(trabajoVendedorRepository.findById(null))
                //.fechaInicio(trabajoVendedorRepository.findById(new TrabajoVendedorPK(vendedor, vendedor.getSucursal())).get().getFechaInicio())
                //.fechaFin(trabajoVendedorRepository.findById(new TrabajoVendedorPK(vendedor, vendedor.getSucursal())).get().getFechaFin())
                //.fechaAsignacion(trabajoVendedorRepository.findById(new TrabajoVendedorPK(vendedor, vendedor.getSucursal())).get().getFechaAsignacion())
                .activo(vendedor.getActivo())
                .build())
                .collect(Collectors.toList());
                 */
    }

}
