package com.agencia.viajes.agencia.service.impl;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.agencia.viajes.agencia.controller.dto.TuristaDto;
//import com.agencia.viajes.agencia.model.repository.TuristaRepository;
import com.agencia.viajes.agencia.service.TuristaService;

import lombok.AllArgsConstructor;

@AllArgsConstructor
@Service // Hay una clase(bean) que implementa una interface y hace parte de un servicio
public class TuristaServiceImpl implements TuristaService {
    /*
     * Aquí se trabaja con las interfaces, las dependencias no se hacen con los objetos concretos (implementaciones), sino con las interfaces
     */
    //private final TuristaRepository turistaRepository;

    @Override
    public List<TuristaDto> getTuristas() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getTuristas'");
    }

    @Override
    public Optional<TuristaDto> getTuristaById(String id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getTuristaById'");
    }

    /*
     * SOLID
     * S: (SRP) Responsabilidad Unica -> Una clase va a a tener solo una responsabilidad dentro del sistema.
     * O: (OCP) Abierto / Cerrado -> Abiertas a extensión pero cerradas a modificación.
     * L: (LSP) Sustitución de Liskov -> Busca que las clases hijas puedan reemplazar a la clase padre en cualquier contexto.
     * I: (ISP) Segregación de Interfaces -> Las dependecias entre dos clases deben ser representadas en una interface.
     * D: (DIP) Inyección de dependencias -> Usar un patrón de diseño(Factory, Singleton...) para crear las dependencias de una clase
     */
/*
    @Override 
    public List<TuristaDto> getTuristas() { 
        var turistas = this.turistaRepository.findAll();
        System.out.println(turistas.size());

        return turistas.stream()
                .map(t -> new TuristaDto(t.getCodigo(), t.getNombre(), t.getApellidos(), t.getTelefono(), t.getActivo(), t.getIdCalle()))
                .collect(Collectors.toList());
    }
     */
    /*
    @Override
    public Optional<TuristaDto> getTuristaById(String id) {
        var turista = turistaRepository.findById(id);
        if(turista.isEmpty())
            return Optional.empty();
            
        return Optional.of(new TuristaDto(
            turista.get().getCodigo(),
            turista.get().getNombre(),
            turista.get().getApellidos(),
            turista.get().getTelefono(),
            turista.get().getActivo(),
            turista.get().getIdCalle()));
    }
     */
}
