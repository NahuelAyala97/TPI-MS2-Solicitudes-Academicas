package org.example;

import java.util.List;

public class ReporteSolicitudes {

    public void generarReporte(List<Solicitud> solicitudes) {

        int pendientes = 0;
        int enProceso = 0;
        int resueltas = 0;

        System.out.println("REPORTE DE SOLICITUDES");
        System.out.println("--------------------");

        for (Solicitud solicitud : solicitudes) {

            mostrarSolicitud(solicitud);

            if (solicitud.getEstado() == EstadoSolicitud.PENDIENTE) {
                pendientes++;
            } else if (solicitud.getEstado() == EstadoSolicitud.EN_PROCESO) {
                enProceso++;
            } else if (solicitud.getEstado() == EstadoSolicitud.RESUELTA) {
                resueltas++;
            }

        }

        mostrarResumen(solicitudes.size(), pendientes, enProceso, resueltas);
    }

    private void mostrarSolicitud(Solicitud solicitud) {

        mostrarIdentificacion(solicitud);
        System.out.println("Tipo: " + solicitud.getTipo());
        mostrarDetalle(solicitud);

        if (solicitud.getResponsable() != null) {
            mostrarResponsable(solicitud);
        } else {
            System.out.println("Responsable: Sin asignar");
        }

        System.out.println("--------------------");
    }

    public void mostrarSolicitudBusqueda(Solicitud solicitud) {

        mostrarIdentificacion(solicitud);
        mostrarDetalle(solicitud);

        if (solicitud.getResponsable() != null) {
            mostrarResponsable(solicitud);
        }

        System.out.println("--------------------");
    }

    private void mostrarIdentificacion(Solicitud solicitud) {
        System.out.println("ID: " + solicitud.getId());
        System.out.println("Estudiante: " + solicitud.getEstudiante().getNombre());
    }

    private void mostrarDetalle(Solicitud solicitud) {
        System.out.println("Descripción: " + solicitud.getDescripcion());
        System.out.println("Prioridad: " + solicitud.getPrioridad());
        System.out.println("Estado: " + solicitud.getEstado());
    }

    private void mostrarResponsable(Solicitud solicitud) {
        System.out.println("Responsable: " +
                solicitud.getResponsable().getNombre());
    }

    private void mostrarResumen(int total, int pendientes,
                                int enProceso, int resueltas) {

        System.out.println("Total de solicitudes: " + total);
        System.out.println("Pendientes: " + pendientes);
        System.out.println("En proceso: " + enProceso);
        System.out.println("Resueltas: " + resueltas);
    }
}
