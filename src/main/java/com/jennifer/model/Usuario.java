/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.jennifer.model;

/**
 *
 * @author JuaN
 */
public class Usuario {

    // Atributos de la clase.
    private String nombre;
    private String email;

    // Constructor sin parametros.
    public Usuario() {

    }

    // Getters y Setters.
    // Metodo para asignar valor al atributo nombre.
    public void setNombre(String name) {
        this.nombre = name;
    }

    // Metodo para obtener valor del atributo nombre.
    public String getNombre() {
        return nombre;
    }

    // Metodo para asignar valor al atributo email.
    public void setEmail(String email) {
        this.email = email;
    }

    // Metodo para obtener valor del atributo email.
    public String getEmail() {
        return email;
    }
}
