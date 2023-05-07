package com.agencia.viajes.agencia.service;

import java.util.List;

import com.agencia.viajes.agencia.controller.dto.VendedorDto;

public interface VendedorService {
    List<VendedorDto> getVendedores();
    void saveVendedor(VendedorDto vendedor);
}
