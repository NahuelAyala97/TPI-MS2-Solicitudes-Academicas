package org.example;

public class Main {

    public static void main(String[] args) {

        SistemaSolicitudes sistema = new SistemaSolicitudes();

        // Crear estudiantes
        Estudiante estudianteJuan = new Estudiante(1, "Juan Perez", "juan@email.com");
        Estudiante estudianteMaria = new Estudiante(2, "Maria Gomez", "maria@email.com");

        //Crear responsable
        Responsable responsableAna = new Responsable(1, "Ana Lopez", "Secretaria");
        Responsable responsableCarlos = new Responsable(2, "Carlos Ruiz", "Alumnos");

        // Registrar solicitudes
        System.out.println("REGISTRO DE SOLICITUDES");

        sistema.registrarSolicitud(new Solicitud(1, estudianteJuan,
                "Solicitar certificado de alumno regular",
                "Certificado",
                PrioridadSolicitud.ALTA,
                EstadoSolicitud.PENDIENTE));

        sistema.registrarSolicitud(new Solicitud(2, estudianteMaria,
                "Consultar equivalencias",
                "Consulta",
                PrioridadSolicitud.MEDIA,
                EstadoSolicitud.PENDIENTE));

        sistema.registrarSolicitud(new Solicitud(3, estudianteJuan,
                "Solicitar certificado analitico",
                "Certificado",
                PrioridadSolicitud.BAJA,
                EstadoSolicitud.PENDIENTE));
        // Cambiar estados
        System.out.println("\nCAMBIO DE ESTADOS");

        sistema.cambiarEstado(2, "En proceso");
        sistema.cambiarEstado(3, "Resuelta");

        // Asignar responsables
        System.out.println("\nASIGNACION DE RESPONSABLES");

        sistema.asignarResponsable(1, responsableAna);
        sistema.asignarResponsable(2, responsableCarlos);

        // Buscar solicitudes
        System.out.println("\nBUSQUEDA DE SOLICITUDES");

        sistema.buscarPorTipo("Certificado");

        // Generar reporte
        System.out.println("\nREPORTE GENERAL");

        sistema.generarReporte();

        // Verificar casos incorrectos
        System.out.println("\nCASOS INCORRECTOS");

        sistema.cambiarEstado(99, "Resuelta");
        sistema.cambiarEstado(1, "Cancelada");

        sistema.registrarSolicitud(new Solicitud(1, estudianteJuan,
                "Solicitud repetida",
                "Consulta",
                PrioridadSolicitud.ALTA,
                EstadoSolicitud.PENDIENTE));


        System.out.println("\nVALIDACIONES DEL CODE REVIEW");

// Solicitud sin tipo
        sistema.registrarSolicitud(new Solicitud(4, estudianteJuan,
                "Prueba sin tipo", null,
                PrioridadSolicitud.MEDIA,
                EstadoSolicitud.PENDIENTE));

// Solicitud sin prioridad
        sistema.registrarSolicitud(new Solicitud(5, estudianteJuan,
                "Prueba sin prioridad", "Consulta",
                null, EstadoSolicitud.PENDIENTE));

// Responsable nulo
        sistema.asignarResponsable(1, null);

// Estado nulo
        Solicitud solicitudPrueba = new Solicitud(6, estudianteJuan,
                "Prueba de estado", "Consulta",
                PrioridadSolicitud.MEDIA,
                EstadoSolicitud.PENDIENTE);

        try {
            solicitudPrueba.setEstado(null);
            System.out.println("Error: se permitió un estado nulo.");
        } catch (IllegalArgumentException e) {
            System.out.println("Validación de estado nulo correcta: " + e.getMessage());
        }

    }
}
