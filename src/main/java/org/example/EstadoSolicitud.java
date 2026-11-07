package org.example;

public enum EstadoSolicitud {
    PENDIENTE("Pendiente"),
    EN_PROCESO("En proceso"),
    RESUELTA("Resuelta");

    private final String texto;

    EstadoSolicitud(String texto) {
        this.texto = texto;
    }

    public static EstadoSolicitud desdeTexto(String texto) {
        for (EstadoSolicitud estado : values()) {
            if (estado.texto.equals(texto)) {
                return estado;
            }
        }
        return null;
    }

    @Override
    public String toString() {
        return texto;
    }
}
