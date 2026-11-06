package org.example;

import java.util.ArrayList;

public class SistemaSolicitudes {

    public ArrayList<Solicitud> solicitudes = new ArrayList<>();

    // Registrar una nueva solicitud
    public void registrarSolicitud(int id, Estudiante estudiante,
                                   String descripcion, String tipo,
                                   String prioridad, String estado) {

        for (Solicitud s : solicitudes) {
            if (s.id == id) {
                System.out.println("Ya existe una solicitud con ese ID.");
                return;
            }
        }

        if (estudiante == null || descripcion == null || descripcion.isBlank()) {
            System.out.println("Los datos de la solicitud son incorrectos.");
            return;
        }

        if (!estado.equals("Pendiente") &&
                !estado.equals("En proceso") &&
                !estado.equals("Resuelta")) {
            System.out.println("Estado no válido.");
            return;
        }

        Solicitud s = new Solicitud(id, estudiante, descripcion,
                tipo, prioridad, estado);

        solicitudes.add(s);
        System.out.println("Solicitud registrada correctamente.");
    }

    // Cambiar el estado de una solicitud
    public void cambiarEstado(int id, String nuevoEstado) {

        for (Solicitud s : solicitudes) {
            if (s.id == id) {

                if (!nuevoEstado.equals("Pendiente") &&
                        !nuevoEstado.equals("En proceso") &&
                        !nuevoEstado.equals("Resuelta")) {
                    System.out.println("Estado no válido.");
                    return;
                }

                s.estado = nuevoEstado;
                System.out.println("Estado actualizado correctamente.");
                return;
            }
        }

        System.out.println("Solicitud no encontrada.");
    }

    // Asignar un responsable
    public void asignarResponsable(int id, Responsable responsable) {

        for (Solicitud s : solicitudes) {
            if (s.id == id) {
                s.responsable = responsable;
                System.out.println("Responsable asignado correctamente.");
                return;
            }
        }

        System.out.println("Solicitud no encontrada.");
    }

    // Buscar solicitudes por tipo
    public void buscarPorTipo(String tipo) {

        boolean encontrado = false;

        System.out.println("Solicitudes de tipo: " + tipo);

        for (Solicitud s : solicitudes) {
            if (s.tipo.equalsIgnoreCase(tipo)) {

                System.out.println("ID: " + s.id);
                System.out.println("Estudiante: " + s.estudiante.nombre);
                System.out.println("Descripción: " + s.descripcion);
                System.out.println("Prioridad: " + s.prioridad);
                System.out.println("Estado: " + s.estado);

                if (s.responsable != null) {
                    System.out.println("Responsable: " + s.responsable.nombre);
                }

                System.out.println("--------------------");
                encontrado = true;
            }
        }

        if (!encontrado) {
            System.out.println("No se encontraron solicitudes.");
        }
    }

    // Generar reporte de solicitudes
    public void generarReporte() {

        int pendientes = 0;
        int enProceso = 0;
        int resueltas = 0;

        System.out.println("REPORTE DE SOLICITUDES");
        System.out.println("--------------------");

        for (Solicitud s : solicitudes) {

            System.out.println("ID: " + s.id);
            System.out.println("Estudiante: " + s.estudiante.nombre);
            System.out.println("Tipo: " + s.tipo);
            System.out.println("Descripción: " + s.descripcion);
            System.out.println("Prioridad: " + s.prioridad);
            System.out.println("Estado: " + s.estado);

            if (s.responsable != null) {
                System.out.println("Responsable: " + s.responsable.nombre);
            } else {
                System.out.println("Responsable: Sin asignar");
            }

            System.out.println("--------------------");

            if (s.estado.equals("Pendiente")) {
                pendientes++;
            } else if (s.estado.equals("En proceso")) {
                enProceso++;
            } else if (s.estado.equals("Resuelta")) {
                resueltas++;
            }
        }

        System.out.println("Total de solicitudes: " + solicitudes.size());
        System.out.println("Pendientes: " + pendientes);
        System.out.println("En proceso: " + enProceso);
        System.out.println("Resueltas: " + resueltas);
    }
}

