package com.agencia.viajes.agencia.controller.dto;

// Dto: Objetos que solo tienen, constructor, setter y getter

public class TuristaDto {
    
    private String codigo;
    private String nombre;
    private String apellidos;
    private String telefono;

    public TuristaDto() {

    }
    public TuristaDto(String codigo, String nombre, String apellidos, String telefono) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.telefono = telefono;
    }
    public String getCodigo() {
        return codigo;
    }
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getApellidos() {
        return apellidos;
    }
    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }
    public String getTelefono() {
        return telefono;
    }
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
}
