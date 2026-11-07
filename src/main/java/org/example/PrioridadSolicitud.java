package org.example;

public enum PrioridadSolicitud {
    ALTA("Alta"),
    MEDIA("Media"),
    BAJA("Baja");

    private final String texto;

    PrioridadSolicitud(String texto) {
        this.texto = texto;
    }

    @Override
    public String toString() {
        return texto;
    }
}

