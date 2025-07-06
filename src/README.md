# 🌳 Estructuras de Árboles Binarios - Práctica de Programación

Este proyecto contiene la implementación de cuatro ejercicios relacionados con árboles binarios, desarrollados en Java. Cada ejercicio está encapsulado en su propia clase y puede ejecutarse directamente desde `App.java` mediante un método `ejecutar()`.

---

## 👤 Estudiante

- **Nombre:** Erick Yunga
- **Correo:** eyunga@est.ups.edu.ec

---


---

##  Ejercicios y cómo funciona cada uno

### 📌 Ejercicio 1: Insertar en un Árbol Binario de Búsqueda (BST)

- **Clase:** `InsertBSTTest.java`
- **Qué hace:** Inserta una secuencia de valores en un árbol binario de búsqueda.
- **Cómo funciona:**
    - Se recorre el árbol recursivamente.
    - Si el valor es menor que el nodo actual, se inserta a la izquierda.
    - Si es mayor, se inserta a la derecha.
- **Resultado:** Se construye un BST con los valores `[5, 3, 7, 2, 4, 6, 8]` y se imprime su recorrido preorden:  
  `5 3 2 4 7 6 8`

---

### 📌 Ejercicio 2: Invertir un Árbol Binario

- **Clase:** `InvertBinaryTree.java`
- **Qué hace:** Invierte un árbol binario, intercambiando los hijos izquierdo y derecho de cada nodo.
- **Cómo funciona:**
    - Se aplica recursión postorden.
    - En cada nodo, se invierten los subárboles izquierdo y derecho.
- **Resultado:** Se imprime el recorrido preorden del árbol original y del árbol invertido.  
  Ejemplo:  
  Árbol original: `4 2 1 3 7 6 9`  
  Árbol invertido: `4 7 9 6 2 3 1`

---

### 📌 Ejercicio 3: Listar Niveles del Árbol

- **Clase:** `ListLevels.java`
- **Qué hace:** Agrupa los nodos del árbol por niveles y los imprime.
- **Cómo funciona:**
    - Se utiliza una cola (BFS) para recorrer el árbol nivel por nivel.
    - Cada nivel se guarda como una lista de nodos.
- **Resultado:** Se imprime cada nivel del árbol original.  
  Ejemplo: 
- `Nivel 0: 4` 
- `Nivel 1: 2 7`
- `Nivel 2: 1 3 6 9`

---

### 📌 Ejercicio 4: Calcular la Profundidad Máxima

- **Clase:** `Depth.java`
- **Qué hace:** Calcula la profundidad máxima (altura) de un árbol binario.
- **Cómo funciona:**
- Se aplica recursión.
- En cada nodo, se calcula la profundidad del subárbol izquierdo y derecho.
- Se retorna el máximo de ambos más uno.
- **Resultado:** Se imprime la profundidad del árbol.  
  Ejemplo: `Profundidad: 4`

 
