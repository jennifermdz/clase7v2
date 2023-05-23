package com.jennifer.model;

public class Usuario {

    // Atributos de la clase.
    private String nombre;
    private String email;
    private String nacionalidad;
    private int id;

    // Constructor sin parámetros.
    public Usuario() {

    }

    // Getters y Setters.

    // Método para asignar valor al atributo nombre.
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    // Método para obtener valor del atributo nombre.
    public String getNombre() {
        return nombre;
    }

    // Método para asignar valor al atributo email.
    public void setEmail(String email) {
        this.email = email;
    }

    // Método para obtener valor del atributo email.
    public String getEmail() {
        return email;
    }

    // Método para asignar valor al atributo nacionalidad.
    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    // Método para obtener valor del atributo nacionalidad.
    public String getNacionalidad() {
        return nacionalidad;
    }

    // Método para asignar valor al atributo id.
    public void setId(int id) {
        this.id = id;
    }

    // Método para obtener valor del atributo id.
    public int getId() {
        return id;
    }
}

