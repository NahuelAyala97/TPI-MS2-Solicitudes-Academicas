package org.example;

public class Main {

    public static void main(String[] args) {

        SistemaSolicitudes sistema = new SistemaSolicitudes();

        // Crear estudiantes
        Estudiante e1 = new Estudiante(1, "Juan Perez", "juan@email.com");
        Estudiante e2 = new Estudiante(2, "Maria Gomez", "maria@email.com");

        // Crear responsables
        Responsable r1 = new Responsable(1, "Ana Lopez", "Secretaria");
        Responsable r2 = new Responsable(2, "Carlos Ruiz", "Alumnos");

        // Registrar solicitudes
        System.out.println("REGISTRO DE SOLICITUDES");

        sistema.registrarSolicitud(new Solicitud(1, e1,
                "Solicitar certificado de alumno regular",
                "Certificado",
                PrioridadSolicitud.ALTA,
                EstadoSolicitud.PENDIENTE));

        sistema.registrarSolicitud(new Solicitud(2, e2,
                "Consultar equivalencias",
                "Consulta",
                PrioridadSolicitud.MEDIA,
                EstadoSolicitud.PENDIENTE));

        sistema.registrarSolicitud(new Solicitud(3, e1,
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

        sistema.asignarResponsable(1, r1);
        sistema.asignarResponsable(2, r2);

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

        sistema.registrarSolicitud(new Solicitud(1, e1,
                "Solicitud repetida",
                "Consulta",
                PrioridadSolicitud.ALTA,
                EstadoSolicitud.PENDIENTE));
    }
}
