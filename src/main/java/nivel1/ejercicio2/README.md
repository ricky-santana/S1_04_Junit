# S1_04_Nivel_1-Ejercicio_1
**Tests unitarios con JUnits**
## 📌 Enunciado
Crea una clase llamada CalculoDni que contenga un método público para calcular la letra correspondiente de un DNI, dado el número (sin letra).

Crea una clase de test con JUnit 5 que parametrice una serie de pruebas para validar el correcto comportamiento del cálculo.

El test debe comprobar como mínimo 10 casos de números de DNI distintos con su letra correspondiente, validando que el resultado del método coincide con el valor esperado.

También se deben validar valores inválidos , como números negativos o demasiado grandes, para comprobar que el método gestiona correctamente estas situaciones (por ejemplo, lanzando una excepción).
## 🧩 Explicaciones y comentarios
- He querido inyectar Objects O en mis objetos para poder lanzar el InvalidTipeNif en vez del InputMismatchException, y así tener el mensaje que quiero dentro de la excepción.
- 