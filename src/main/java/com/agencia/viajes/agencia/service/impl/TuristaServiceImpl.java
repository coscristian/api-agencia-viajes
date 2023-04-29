package com.agencia.viajes.agencia.service.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.agencia.viajes.agencia.controller.dto.HotelDto;
import com.agencia.viajes.agencia.controller.dto.SucursalAdminDto;
import com.agencia.viajes.agencia.controller.dto.SucursalDto;
import com.agencia.viajes.agencia.controller.dto.TuristaDto;
import com.agencia.viajes.agencia.controller.dto.VendedorDto;
import com.agencia.viajes.agencia.service.TuristaService;

@Service // Hay una clase(bean) que implementa una interface y hace parte de un servicio
public class TuristaServiceImpl implements TuristaService {
    List<TuristaDto> turistas = new ArrayList<>();
    List<SucursalDto> sucursales = new ArrayList<>();
    List<HotelDto> hoteles = new ArrayList<>();
    List<SucursalAdminDto> sucursalAdmins = new ArrayList<>();
    List<VendedorDto> vendedores = new ArrayList<>();

    /*
     * SOLID
     * S: (SRP) Responsabilidad Unica -> Una clase va a a tener solo una responsabilidad dentro del sistema.
     * O: (OCP) Abierto / Cerrado -> Abiertas a extensión pero cerradas a modificación.
     * L: (LSP) Sustitución de Liskov -> Busca que las clases hijas puedan reemplazar a la clase padre en cualquier contexto.
     * I: (ISP) Segregación de Interfaces -> Las dependecias entre dos clases deben ser representadas en una interface.
     * D: (DIP) Inyección de dependencias -> Usar un patrón de diseño(Factory, Singleton...) para crear las dependencias de una clase
     */

    public TuristaServiceImpl(){
        this.turistas.add(new TuristaDto("1087489628", "Cristian","Quesada Cossio", "3207101556"));
        this.turistas.add(new TuristaDto("35586755", "Yuldavis", "Cossio Perea", "3104131241"));
        
        this.sucursales.add(new SucursalDto(1, "3212458"));
        this.sucursales.add(new SucursalDto(2, "3465874"));

        this.hoteles.add(new HotelDto(1, "Movich", "3207101556", 4, 3));

        this.sucursalAdmins.add(new SucursalAdminDto("10024241","Cesar", "Quesada Vivas", "3136293123"));
        this.vendedores.add(new VendedorDto("25474966", "Pepito", "Ramirez", "320451242"));
    }

    @Override 
    public List<TuristaDto> getTuristas() { 
        return this.turistas;
    }

    @Override
    public Optional<TuristaDto> getTuristaById(String id) {
        var turista = turistas.stream() 
            .filter(t -> t.getCodigo().equals(id))
            .findFirst(); // En caso de no encontrar uno, retorna un opcional
        return turista;
    }
    
}
