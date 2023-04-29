package com.agencia.viajes.agencia.controller;

import java.util.ArrayList;

import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.agencia.viajes.agencia.controller.dto.HotelDto;
import com.agencia.viajes.agencia.controller.dto.SucursalAdminDto;
import com.agencia.viajes.agencia.controller.dto.SucursalDto;
import com.agencia.viajes.agencia.controller.dto.TuristaDto;
import com.agencia.viajes.agencia.controller.dto.VendedorDto;
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
    List<SucursalDto> sucursales = new ArrayList<>();
    List<HotelDto> hoteles = new ArrayList<>();
    List<SucursalAdminDto> sucursalAdmins = new ArrayList<>();
    List<VendedorDto> vendedores = new ArrayList<>();

    public AgenciaViajesController(){
        this.turistas.add(new TuristaDto("1087489628", "Cristian","Quesada Cossio", "3207101556"));
        this.turistas.add(new TuristaDto("35586755", "Yuldavis", "Cossio Perea", "3104131241"));
        
        this.sucursales.add(new SucursalDto(1, "3212458"));
        this.sucursales.add(new SucursalDto(2, "3465874"));

        this.hoteles.add(new HotelDto(1, "Movich", "3207101556", 4, 3));

        this.sucursalAdmins.add(new SucursalAdminDto("10024241","Cesar", "Quesada Vivas", "3136293123"));
        this.vendedores.add(new VendedorDto("25474966", "Pepito", "Ramirez", "320451242"));
    }

    @GetMapping("/turistas") // Petición de tipo GET a esta ruta
    public List<TuristaDto> getAllTuristas(){
        return this.turistas;
    }

    @GetMapping("/sucursales")
    public List<SucursalDto> getAllSucursales(){
        return this.sucursales;
    }

    @GetMapping("/hoteles")
    public List<HotelDto> getAllHoteles(){
        return this.hoteles;
    }

    @GetMapping("/sucursal_admins")
    public List<SucursalAdminDto> getAllSucursalAdmins(){
        return this.sucursalAdmins;
    }

    @GetMapping("/vendedores")
    public List<VendedorDto> getAllVendedores(){
        return this.vendedores;
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
