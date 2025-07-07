# 🌲 Práctica de Árboles Binarios

Este proyecto contiene la solución a cuatro ejercicios fundamentales sobre árboles binarios, desarrollados en Java. Cada ejercicio está implementado en su propia clase y puede ejecutarse de forma independiente. El objetivo es comprender la estructura, manipulación y recorrido de árboles binarios mediante ejemplos prácticos.

---

## 👨‍💻 Datos del Estudiante

- **Nombre:** Erick Yunga
- **Correo institucional:** eyunga@est.ups.edu.ec
- **Carrera:** Computación
- **Asignatura:** Estructura de Datos
- **Fecha:** 07/06/2025

---

## 📚 Ejercicios Desarrollados

### 1️ Inserción en Árbol Binario de Búsqueda

- **Clase:** `InsertBSTTest`
- **Descripción:** Se insertan nodos en un árbol binario de búsqueda (BST) respetando su propiedad: los valores menores van a la izquierda y los mayores a la derecha.
- **Implementación:** Se utiliza un método recursivo para ubicar cada nuevo nodo en su posición correcta.
- **Salida esperada:**

# ------EJERCICIO 1------
- Raiz: 5
- Hijo izquierda de la raíz: 3
- Hijo derecha de la raíz: 7
- Hijo izquierda del hijo izquierda: 2
- Hijo derecha del hijo izquierda: 4
- Hijo izquierda del hijo derecha: 6
- Hijo derecha del hijo derecha: 8


---

### 2️ Inversión de Árbol Binario

- **Clase:** `InvertBinaryTree`
- **Descripción:** Se invierte un árbol binario, intercambiando los subárboles izquierdo y derecho de cada nodo.
- **Implementación:** Se aplica recursión para recorrer el árbol y realizar los intercambios desde las hojas hacia la raíz.
- **Salida esperada:**

# ------EJERCICIO 2------
-  Raiz invertida: 4
-  Hijo izq de la raíz invertida: 7
-  Hijo der de la raíz invertida: 2
-  Hijo izq del hijo izq invertido: 9
-  Hijo der del hijo izq invertido: 6
-  Hijo izq del hijo der invertido: 3
-  Hijo der del hijo der invertido: 1


---

### 3️ Listado de Niveles del Árbol

- **Clase:** `ListLevels`
- **Descripción:** Se recorre el árbol por niveles (BFS) y se imprime cada nivel en orden.
- **Implementación:** Se utiliza una cola para recorrer el árbol nivel por nivel y agrupar los nodos.
- **Salida esperada:**

#  -----EJERCICIO 3------
-  Nivel 0: 4 -
-  Nivel 1: 2 - 7 -
-  Nivel 2: 1 - 3 - 6 - 9 -


---

### 4️ Cálculo de Profundidad Máxima

- **Clase:** `Depth`
- **Descripción:** Se calcula la profundidad máxima del árbol, es decir, el número de niveles desde la raíz hasta la hoja más profunda.
- **Implementación:** Se aplica recursión para obtener la profundidad de cada subárbol y se retorna el valor máximo.
- **Salida esperada:**

# -----EJERCICIO 4------
- Profundidad máxima: 3 


