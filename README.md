Tu tarea será representar un sistema de gestión de biblioteca utilizando clases bajo el Patrón MVC en Java. Este sistema deberá permitir gestionar libros y usuarios, así como realizar préstamos y devoluciones. Además, tendrás que implementar métodos para manipular y mostrar información de manera estructurada, aplicando los conceptos vistos hasta ahora.

Detalles del problema
📚 Información del Libro
Un ISBN que sirva como identificador único.
Un título y un autor.
El año de publicación.
Una editorial.
Un género, representado como un enum, que puede ser:
NOVELA, CIENCIA_FICCION, HISTORIA, FANTASIA, MISTERIO, INFANTIL, POESIA, OTRO, etc.
Cantidad total de copias disponibles en la biblioteca.
Cantidad de copias actualmente disponibles para préstamo.
Un estado, que puede ser:
DISPONIBLE
PRESTADO
RESERVADO
El estado debe ser gestionado mediante un enum.
👤 Información del Usuario
Un ID único.
Un nombre.
Una lista de libros actualmente prestados.
Un historial de libros prestados (libros que tuvo y ya devolvió).
⛔ Restricciones
No permitir que un usuario tenga más de 3 libros prestados a la vez.
Un usuario no puede tener un libro prestado por más de 30 días.
Si un usuario ha tenido un libro durante 30 días, no podrá volver a pedirlo hasta que pasen 7 días desde la devolución.
Tareas
1) Atributos
Identifica los atributos necesarios para representar los libros, usuarios y préstamos.
Piensa qué atributos adicionales podrían ser necesarios para mejorar la gestión del sistema.
2) Métodos
Prestar un libro.
Devolver un libro.
Reservar un libro.
Buscar libro por:
Título
ISBN
Género
Identificar qué usuario tiene un libro actualmente prestado
Resumen de Biblioteca:
Resumen de Libros: listar todos los libros y su estado actual.
Resumen de Usuarios: listar usuarios y los libros que tienen prestados.
3) Tercera clase (gestión de préstamos)
Para mantener una mejor organización del sistema, además de Libro y Usuario, se deberá incluir una tercera clase encargada de gestionar los préstamos de libros.

Fecha de préstamo.
Fecha de vencimiento del préstamo.
⚠️ El alumnado deberá diseñar la estructura de esta tercera clase, definiendo los atributos y métodos necesarios para garantizar un funcionamiento adecuado del sistema.
4) MVC: Controladores y Vista
El sistema debe estar estructurado bajo el patrón MVC (Modelo–Vista–Controlador).
Controladores:
Se encargan de la lógica del sistema y de coordinar la interacción entre los modelos y la vista.
Ejemplo: GestorBiblioteca puede encargarse de gestionar libros y usuarios.
Vista:
Se encarga de mostrar la información al usuario.
Usar una interfaz de consola (Consola.java), encargada de imprimir mensajes y listas de libros/usuarios, etc.
💡 Recuerda: el objetivo es que la estructura MVC esté clara y que el sistema funcione de manera coherente.
‼️ El alumnado deberá crear los controladores y vistas necesarias para gestionar la lógica del sistema.
✅ Requerimientos
Agregar validaciones para evitar que se preste un libro ya prestado o reservado.
Evitar cambios de estado incorrectos, como devolver un libro que no está prestado.
Controlar excepciones si se intenta prestar más de 3 libros a un usuario.
Implementar la restricción de tiempo de préstamo de 30 días y el bloqueo de 7 días después de la devolución.
Manejo de excepciones personalizadas o estándar de Java:
Crear excepciones personalizadas como LibroNoDisponibleException o LimitePrestamosExcedidoException cuando sea necesario.
Usar excepciones estándar cuando aplique, por ejemplo:
IllegalArgumentException para argumentos inválidos (ej.: intentar prestar un libro ya prestado).
NullPointerException para evitar operaciones sobre objetos nulos (si procede).
👥 Modalidad de trabajo (Git + GitHub)
Esta actividad se realiza en pareja y debe desarrollarse en un repositorio GitHub compartido.
Importante: la defensa es individual (ver más abajo).

Requisitos mínimos (obligatorios)
Repositorio compartido en GitHub (ambos deben tener acceso).
Cada integrante debe realizar commits propios (no todo desde una sola cuenta).
Crear y usar al menos una rama secundaria (ej.: feature/prestamos, feature/busqueda).
Incluir un archivo README.md con:
Descripción breve del proyecto.
Cómo ejecutar el programa.
Sección “Reparto de tareas” (qué hizo cada persona).
⚠️ Nota: Se revisará el historial de commits/ramas para comprobar participación real. Un repositorio con aportación claramente desequilibrada puede afectar a la calificación del trabajo en pareja.
Entrega
1) Enlace al repositorio GitHub
Pega el enlace al repositorio en la entrega del CAMPUS.
Asegúrate de que el repositorio tenga el README.md (incluye “Reparto de tareas”).
2) Archivo comprimido (.zip)
Sube también un .zip con el proyecto (por seguridad y para corrección rápida).

Formato del archivo:

apellido1_nombre1_apellido2_nombre2_UT4_Act1.Ev.zip
El .zip debe incluir: código fuente + README.md.

3) Entrega individual (ambos entregan)
Ambos miembros deben realizar la entrega en el CAMPUS.
En el comentario de la entrega, indica claramente el nombre y apellidos de tu compañero/a.
La entrega debe incluir el enlace al repositorio GitHub y el .zip del proyecto.
4) Defensa individual (obligatoria) — 5% de la nota
La defensa es individual, aunque el proyecto sea en pareja.
Duración aproximada: 2–3 minutos por alumno/a.
Durante la defensa tendrás que explicar y demostrar tu aportación en el repositorio (commits/ramas) y una parte concreta del sistema.
💡 Consejo: prepara 2 ejemplos listos (por ejemplo, “prestar libro” y “devolver libro”) y muestra dónde están las validaciones y/o excepciones.
El trabajo fue divido por DARA, ALONSO y ALEXANDER
