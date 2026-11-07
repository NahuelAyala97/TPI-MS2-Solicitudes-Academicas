package org.example;

import java.util.ArrayList;

public class SistemaSolicitudes {

    public ArrayList<Solicitud> solicitudes = new ArrayList<>();

    // Registrar una nueva solicitud
    public void registrarSolicitud(Solicitud nuevaSolicitud) {

        if (nuevaSolicitud == null) {
            System.out.println("Los datos de la solicitud son incorrectos.");
            return;
        }

        for (Solicitud solicitud : solicitudes) {
            if (solicitud.getId() == nuevaSolicitud.getId()) {
                System.out.println("Ya existe una solicitud con ese ID.");
                return;
            }
        }

        if (nuevaSolicitud.getEstudiante() == null ||
                nuevaSolicitud.getDescripcion() == null ||
                nuevaSolicitud.getDescripcion().isBlank()) {
            System.out.println("Los datos de la solicitud son incorrectos.");
            return;
        }

        if (!esEstadoValido(nuevaSolicitud.getEstado())) {
            System.out.println("Estado no válido.");
            return;
        }

        solicitudes.add(nuevaSolicitud);
        System.out.println("Solicitud registrada correctamente.");
    }


    // Cambiar el estado de una solicitud

    public void cambiarEstado(int id, String nuevoEstado) {

        for (Solicitud solicitud : solicitudes) {
            if (solicitud.getId() == id) {

                EstadoSolicitud estado = EstadoSolicitud.desdeTexto(nuevoEstado);

                if (!esEstadoValido(estado)) {
                    System.out.println("Estado no válido.");
                    return;
                }

                solicitud.setEstado(estado);
                System.out.println("Estado actualizado correctamente.");
                return;
            }
        }

        System.out.println("Solicitud no encontrada.");
    }


    // Asignar un responsable
    public void asignarResponsable(int id, Responsable responsable) {

        for (Solicitud s : solicitudes) {
            if (s.getId() == id) {
                s.setResponsable(responsable);
                System.out.println("Responsable asignado correctamente.");
                return;
            }
        }

        System.out.println("Solicitud no encontrada.");
    }

    // Buscar solicitudes por tipo

    public void buscarPorTipo(String tipo) {

        boolean encontrado = false;
        ReporteSolicitudes reporte = new ReporteSolicitudes();

        System.out.println("Solicitudes de tipo: " + tipo);

        for (Solicitud solicitud : solicitudes) {
            if (solicitud.getTipo().equalsIgnoreCase(tipo)) {

                reporte.mostrarSolicitudBusqueda(solicitud);
                encontrado = true;
            }
        }

        if (!encontrado) {
            System.out.println("No se encontraron solicitudes.");
        }
    }


    // Generar reporte de solicitudes
    public void generarReporte() {
        ReporteSolicitudes reporte = new ReporteSolicitudes();
        reporte.generarReporte(solicitudes);
    }


    private boolean esEstadoValido(EstadoSolicitud estado) {
        return estado != null;
    }
}

