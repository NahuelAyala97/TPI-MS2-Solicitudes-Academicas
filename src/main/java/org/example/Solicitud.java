package org.example;

public class Solicitud {
    public int id;
    public Estudiante estudiante;
    public String descripcion;
    public String tipo;
    public String prioridad;
    public String estado;
    public Responsable responsable;

    public Solicitud(int id, Estudiante estudiante,
                     String descripcion, String tipo,
                     String prioridad, String estado) {
        this.id = id;
        this.estudiante = estudiante;
        this.descripcion = descripcion;
        this.tipo = tipo;
        this.prioridad = prioridad;
        this.estado = estado;
        this.responsable = null;
    }
}
