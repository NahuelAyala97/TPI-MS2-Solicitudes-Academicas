package org.example;

public class Solicitud {
    private int id;
    private Estudiante estudiante;
    private String descripcion;
    private String tipo;
    private PrioridadSolicitud prioridad;
    private EstadoSolicitud estado;
    private Responsable responsable;

    public Solicitud(int id, Estudiante estudiante,
                     String descripcion, String tipo,
                     PrioridadSolicitud prioridad,
                     EstadoSolicitud estado) {
        this.id = id;
        this.estudiante = estudiante;
        this.descripcion = descripcion;
        this.tipo = tipo;
        this.prioridad = prioridad;
        this.estado = estado;
        this.responsable = null;
    }

    public int getId() {
        return id;
    }

    public Estudiante getEstudiante() {
        return estudiante;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public String getTipo() {
        return tipo;
    }

    public PrioridadSolicitud getPrioridad() {
        return prioridad;
    }

    public EstadoSolicitud getEstado() {
        return estado;
    }

    public void setEstado(EstadoSolicitud estado) {
        this.estado = estado;
    }

    public Responsable getResponsable() {
        return responsable;
    }

    public void setResponsable(Responsable responsable) {
        this.responsable = responsable;
    }
}
