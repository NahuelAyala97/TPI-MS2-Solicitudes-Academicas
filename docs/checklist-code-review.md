# Checklist de Code Review

**Proyecto:** Sistema de Gestión de Solicitudes Académicas

**Versión revisada:** Etapa de refactoring

## Criterios de revisión

- [x] **Nombres claros:** las clases, métodos y atributos tienen nombres que permiten comprender su función.
- [x] **Responsabilidades:** las clases tienen responsabilidades definidas y los métodos realizan tareas específicas.
- [x] **Código duplicado:** no se repiten innecesariamente instrucciones que pueden reutilizarse.
- [x] **Encapsulamiento:** los atributos están protegidos y se accede a ellos mediante los métodos correspondientes.
- [x] **Validaciones:** el sistema controla los datos incorrectos y muestra los mensajes esperados.
- [x] **Legibilidad:** los métodos tienen una estructura sencilla y el código es fácil de comprender.
- [x] **Funcionamiento:** las operaciones principales mantienen los resultados de la versión inicial.
- [x] **Mantenimiento:** la organización permite realizar modificaciones sin afectar innecesariamente otras clases.

## Observaciones y correcciones

### SistemaSolicitudes.java

**Observación 1 — Encapsulamiento**

- **Problema:** el atributo `solicitudes` está declarado como público.
- **Recomendación:** cambiar su visibilidad a `private`.
- **Estado:** Resuelta.
- **Corrección realizada:** se modificó la visibilidad del atributo `solicitudes` de `public` a `private`, evitando el acceso directo desde otras clases.
- **Verificación:** se ejecutó `Main.java` y se comprobó que las operaciones y validaciones mantienen sus resultados.

**Observación 2 — Validaciones incompletas**

- **Problema:** no se comprueba si el tipo o la prioridad son nulos al registrar una solicitud. Tampoco se controla si el responsable recibido es `null` al asignarlo.
- **Recomendación:** incorporar las validaciones necesarias para evitar datos incompletos.
- **Estado:** Corregida.
- **Corrección realizada:** se incorporaron validaciones para evitar registrar solicitudes sin tipo o prioridad y para impedir asignar un responsable nulo.
- **Verificación:** se ejecutaron casos con datos incorrectos y se comprobó que el sistema los rechaza mediante los mensajes correspondientes.

**Observación 3 — Nombre de variable**

- **Problema:** el método `asignarResponsable()` utiliza la variable `s`, mientras que los demás métodos utilizan `solicitud`.
- **Recomendación:** utilizar un nombre más descriptivo y consistente.
- **Estado:** Resuelta.
- **Corrección realizada:** se reemplazó la variable `s` por `solicitud` en el método `asignarResponsable()`, utilizando un nombre más descriptivo y consistente con el resto de la clase.
- **Verificación:** se ejecutó `Main.java` y se comprobó que el funcionamiento se mantiene correctamente.

### Solicitud.java

**Observación 4 — Validación del estado**

- **Problema:** el método `setEstado()` permite asignar un valor `null`, aunque los estados válidos están definidos mediante un `enum`.
- **Recomendación:** incorporar una validación para evitar asignar un estado nulo.
- **Estado:** Corregida.
- **Corrección realizada:** se incorporó una validación en `setEstado()` para impedir asignar un estado nulo, utilizando `IllegalArgumentException`.
- **Verificación:** se ejecutó una prueba con setEstado(null) y se comprobó que genera la excepción esperada.

### Estudiante.java

No se encontraron observaciones que requieran corrección. La clase mantiene sus atributos privados, utiliza nombres claros y cumple con su responsabilidad.

### Responsable.java

No se encontraron observaciones que requieran corrección. La clase mantiene sus atributos privados, utiliza nombres claros y cumple con su responsabilidad.

### ReporteSolicitudes.java

No se encontraron observaciones que requieran corrección. La clase tiene una responsabilidad definida y utiliza métodos pequeños para mostrar los datos y generar el resumen.

Se comprobó que reutiliza los métodos de presentación y que mantiene los resultados del reporte original.

### EstadoSolicitud.java y PrioridadSolicitud.java

No se encontraron observaciones que requieran corrección. Ambos enum permiten definir los estados y prioridades disponibles, evitando utilizar valores de texto arbitrarios.

### Main.java

**Observación 5 — Nombres de variables**

- **Problema:** se utilizaban nombres abreviados como `e1`, `e2`, `r1` y `r2`.
- **Recomendación:** reemplazarlos por nombres más descriptivos.
- **Estado:** Resuelta.
- **Corrección realizada:** se reemplazaron las variables por `estudianteJuan`, `estudianteMaria`, `responsableAna` y `responsableCarlos`.
- **Verificación:** se ejecutó `Main.java` y se comprobó que las operaciones mantienen sus resultados.

## Criterios de aceptación técnica

Para aceptar la revisión se establecieron los siguientes criterios:

- Que las clases tengan responsabilidades definidas y nombres claros.
- Que los atributos estén correctamente encapsulados.
- Que el sistema controle los datos incorrectos.
- Que las operaciones principales mantengan su funcionamiento después de las correcciones.
- Que las observaciones encontradas y las correcciones realizadas estén documentadas.

## Resultado del Code Review

Durante la revisión se analizaron las ocho clases del sistema y se registraron cinco observaciones relacionadas con el encapsulamiento, las validaciones y los nombres de variables.

Se realizaron las cinco correcciones y se verificó su funcionamiento mediante la ejecución de `Main.java`, incluyendo pruebas específicas para los datos incorrectos.


Por lo tanto, se considera que el Code Review cumple con los criterios de aceptación técnica establecidos. Las mejoras realizadas quedaron documentadas en este archivo y en el historial del repositorio.