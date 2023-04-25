package com.agencia.viajes.agencia.controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.agencia.viajes.agencia.controller.dto.TuristaDto;
import com.agencia.viajes.agencia.model.Turista;
import com.agencia.viajes.agencia.repository.TuristaRepository;

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
    /*
    @GetMapping("/sucursales") // Petición de tipo GET a esta ruta
    public String goToSucursales(){
        
    }
     */
    List<TuristaDto> turistas = new ArrayList<>();


    private TuristaRepository turistaRepository;

    public AgenciaViajesController(TuristaRepository turistaRepository){
        this.turistaRepository = turistaRepository;
        this.turistas.add(new TuristaDto("1087489628", "Cristian","Quesada Cossio", "3207101556"));
    
        this.turistas.add(new TuristaDto("35586755", "Yuldavis", "Cossio Perea", "3104131241"));
    }

    /*
    @GetMapping("/sucursales")
    public ResponseEntity<String> allSucursales(){
        return new ResponseEntity<String>("Getting all Sucursales", HttpStatus.OK);
    }
     */

    @GetMapping("/turista/{id}")
    public String getTuristaById(Integer id){
        for (TuristaDto turistaDto : turistas) {
            System.out.print(turistaDto.getCodigo());
            System.out.print(id);
            if(turistaDto.getCodigo().equals(id)){
                return turistaDto.getNombre();
            }
        }
        return "Not Found";
    }
    
    @GetMapping("/turistas")
    public List<TuristaDto> getAllTuristas(){
        return this.turistas;
    }
     

}
