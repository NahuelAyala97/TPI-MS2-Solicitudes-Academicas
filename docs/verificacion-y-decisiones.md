# Verificación y decisiones técnicas

## 1. Verificación del funcionamiento

Se realizaron pruebas manuales mediante la ejecución de `Main.java`, comparando los resultados de la versión inicial con los de la versión refactorizada.

Se verificaron las siguientes operaciones:

- Registro de tres solicitudes.
- Cambio de estado de dos solicitudes.
- Asignación de dos responsables.
- Búsqueda de solicitudes por tipo.
- Generación del reporte general.
- Control de ID inexistente, estado inválido e ID duplicado.

En ambas versiones se mantuvieron los resultados esperados. El reporte mostró tres solicitudes: una pendiente, una en proceso y una resuelta.

Durante el Code Review también se comprobaron las validaciones de solicitudes sin tipo o prioridad, responsables nulos y estados nulos. Todas mostraron el comportamiento esperado.

Las capturas de las ejecuciones antes y después se encuentran en el apartado 6 del informe y en su anexo de evidencias.

## 2. Decisiones técnicas

**Separación de responsabilidades:** se creó `ReporteSolicitudes` para separar la presentación de datos de la gestión de solicitudes.

**Simplificación del código:** se extrajeron métodos, se eliminaron instrucciones duplicadas y se mejoraron los nombres de las variables.

**Encapsulamiento:** se utilizaron atributos privados y métodos de acceso donde fueron necesarios.

**Estados y prioridades:** se reemplazaron los valores `String` por `enum` para definir los valores permitidos.

**Verificación:** se utilizaron pruebas manuales, ya que la consigna permite presentar casos de prueba o evidencias de ejecución.