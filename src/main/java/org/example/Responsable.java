package org.example;

public class Responsable {
    private int id;
    private String nombre;
    private String area;

    public Responsable(int id, String nombre, String area) {
        this.id = id;
        this.nombre = nombre;
        this.area = area;
    }

    public String getNombre() {
        return nombre;
    }
}

