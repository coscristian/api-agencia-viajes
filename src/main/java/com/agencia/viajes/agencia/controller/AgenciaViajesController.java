package com.agencia.viajes.agencia.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.agencia.viajes.agencia.controller.dto.SucursalDto;
import com.agencia.viajes.agencia.controller.dto.TuristaDto;
import com.agencia.viajes.agencia.service.SucursalService;
import com.agencia.viajes.agencia.service.TuristaService;

import lombok.AllArgsConstructor;

// Spring MVC
/*
 * - @RESTController controla las peticiones de navegación, define un @ResponseBody el cual 
 * define que se retornará un JSON o XML.
 * - @Controler tiene la misma función pero retorna una vista.
 * - @RequestMapping("ruta") Determina la ruta inicial del controlador
 * - @GetMapping("ruta") Determina rutas especiales para cada funcionalidad
 */

@AllArgsConstructor
@RestController
@CrossOrigin(origins = "http://localhost:3006")
@RequestMapping("admin")
public class AgenciaViajesController { 

    private TuristaService turistaService;
    private SucursalService sucursalService;

    @GetMapping("/turistas") // Petición de tipo GET a esta ruta
    public List<TuristaDto> getAllTuristas(){
        return turistaService.getTuristas();
    }

    @GetMapping("/sucursales") // Petición de tipo GET a esta ruta
    public List<SucursalDto> getAllSucursales(){
        return sucursalService.getSucursales();
    }
    /*
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
    */

    // Model attribute permite recibir en ese objeto los datos que vienen en el body
    @PostMapping("/turista/crear")
    public ResponseEntity<String> postCrearTurista(@RequestBody TuristaDto turista){
        System.out.println(turista.toString());
        //System.out.println(turista.getNombre());
        turistaService.saveTurista(turista);
        return new ResponseEntity<>("Well done!!", HttpStatus.OK);

    }


    @GetMapping("/turista/{cod}")
    public String getTuristaById(@PathVariable("cod") String cod){
        var turistaOp = this.turistaService.getTuristaById(cod);
        if(turistaOp.isEmpty()) return "Error: El Turista con ID:" + cod + " no existe.";
        return turistaOp.get().getNombre();
    }
    

}
