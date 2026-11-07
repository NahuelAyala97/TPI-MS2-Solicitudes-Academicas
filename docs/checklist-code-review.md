# Checklist de Code Review

**Proyecto:** Sistema de Gestión de Solicitudes Académicas

**Versión revisada:** Etapa de refactoring

## Criterios de revisión

- [ ] **Nombres claros:** las clases, métodos y atributos tienen nombres que permiten comprender su función.
- [ ] **Responsabilidades:** las clases tienen responsabilidades definidas y los métodos realizan tareas específicas.
- [ ] **Código duplicado:** no se repiten innecesariamente instrucciones que pueden reutilizarse.
- [ ] **Encapsulamiento:** los atributos están protegidos y se accede a ellos mediante los métodos correspondientes.
- [ ] **Validaciones:** el sistema controla los datos incorrectos y muestra los mensajes esperados.
- [ ] **Legibilidad:** los métodos tienen una estructura sencilla y el código es fácil de comprender.
- [ ] **Funcionamiento:** las operaciones principales mantienen los resultados de la versión inicial.
- [ ] **Mantenimiento:** la organización permite realizar modificaciones sin afectar innecesariamente otras clases.

## Observaciones y correcciones

### SistemaSolicitudes.java

**Observación 1 — Encapsulamiento**

- **Problema:** el atributo `solicitudes` está declarado como público.
- **Recomendación:** cambiar su visibilidad a `private`.
- **Estado:** Pendiente de corrección.

**Observación 2 — Validaciones incompletas**

- **Problema:** no se comprueba si el tipo o la prioridad son nulos al registrar una solicitud. Tampoco se controla si el responsable recibido es `null` al asignarlo.
- **Recomendación:** incorporar las validaciones necesarias para evitar datos incompletos.
- **Estado:** Pendiente de evaluación.

**Observación 3 — Nombre de variable**

- **Problema:** el método `asignarResponsable()` utiliza la variable `s`, mientras que los demás métodos utilizan `solicitud`.
- **Recomendación:** utilizar un nombre más descriptivo y consistente.
- **Estado:** Pendiente de corrección.

### Solicitud.java

**Observación 4 — Validación del estado**

- **Problema:** el método `setEstado()` permite asignar un valor `null`, aunque los estados válidos están definidos mediante un `enum`.
- **Recomendación:** incorporar una validación para evitar asignar un estado nulo.
- **Estado:** Pendiente de corrección.

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

- **Problema:** se utilizan nombres abreviados como `e1`, `e2`, `r1` y `r2`, que no indican claramente a qué estudiante o responsable corresponden.
- **Recomendación:** reemplazarlos por nombres más descriptivos para mejorar la legibilidad.
- **Estado:** Pendiente de corrección.

## Criterios de aceptación técnica

Se considerará aceptada la revisión cuando las funcionalidades principales continúen funcionando, los problemas importantes identificados hayan sido corregidos y las mejoras realizadas estén documentadas.