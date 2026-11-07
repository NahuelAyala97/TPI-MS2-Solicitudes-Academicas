package org.example;

public class Estudiante {
    private int id;
    private String nombre;
    private String email;

    public Estudiante(int id, String nombre, String email) {
        this.id = id;
        this.nombre = nombre;
        this.email = email;
    }

    public String getNombre() {
        return nombre;
    }
}

