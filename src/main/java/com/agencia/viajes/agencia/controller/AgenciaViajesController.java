package com.agencia.viajes.agencia.controller;

import java.util.ArrayList;

import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.agencia.viajes.agencia.controller.dto.TuristaDto;
import com.agencia.viajes.agencia.exception.ResourceNotFoundException;

// Spring MVC
/*
 * - @RESTController controla las peticiones de navegación, define un @ResponseBody el cual 
 * define que se retornará un JSON o XML.
 * - @Controler tiene la misma función pero retorna una vista.
 * - @RequestMapping("ruta") Determina la ruta inicial del controlador
 * - @GetMapping("ruta") Determina rutas especiales para cada funcionalidad
 */

@RestController
@RequestMapping("admin")
public class AgenciaViajesController { 

    List<TuristaDto> turistas = new ArrayList<>();

    public AgenciaViajesController(){
        this.turistas.add(new TuristaDto("1087489628", "Cristian","Quesada Cossio", "3207101556"));
        this.turistas.add(new TuristaDto("35586755", "Yuldavis", "Cossio Perea", "3104131241"));
    }

    @GetMapping("/turistas") // Petición de tipo GET a esta ruta
    public List<TuristaDto> getAllTuristas(){
        return this.turistas;
    }

    @GetMapping("/turista/{cod}")
    public String getTuristaById(@PathVariable("cod") String cod){
        try {
            var turista = turistas.stream()
            .filter(t -> t.getCodigo().equals(cod))
            .findFirst()
            .orElseThrow(() -> new ResourceNotFoundException("Turista no existe"));    
            return turista.getNombre();
        } catch (ResourceNotFoundException e) {
            return e.getMessage();
        }
    }
    

}
