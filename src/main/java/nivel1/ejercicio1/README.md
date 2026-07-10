# S1_04_Nivel_1-Ejercicio_1
**Tests unitarios con JUnits**
## 📌 Enunciado
Crea una clase Java que gestione una colección de libros de una biblioteca. Esta clase debe ofrecer las siguientes funcionalidades:

Añadir libros a la colección.
Recuperar la lista completa de libros (siguiendo el comando de inserción).
Obtener el título de un libro a partir de su posición.
Añadir un libro en una posición específica en la colección.
Eliminar un libro por su título.
Devolver una copia de la lista ordenada alfabéticamente .
Implementa test unitarios con JUnit 5 para validar el comportamiento de la clase. Asegúrate de cubrir, como mínimo, los siguientes casos:

La colección no debe ser nula después de instanciar la clase.
El tamaño de la colección es correcto después de añadir varios libros.
Los libros se encuentran en la posición esperada una vez añadidos.
El método para obtener un libro por posición devuelve el título correcto.
Añadir un libro en una posición concreta modifica correctamente la colección.
Eliminar un libro por el título reduce el tamaño de la colección.
La lista ordenada devuelve los libros en orden alfabético (sin modificar la colección original).
No deben permitirse libros con títulos duplicados.
## 🧩 Explicaciones
- He intentado aplicar todos los consejos de buenas prácticas. De ahora en adelante iniciaré los proyectos con dichos consejos en mente.
- Para el deleteBook() se me ocurrió crear una excepción de tipo Runtime para arrojarla si se intenta borrar un libro que no existe
- Te go algún warning de la función lambda pero como aún no he aprendido esto y veo que me funciona todo lo he ignorado.