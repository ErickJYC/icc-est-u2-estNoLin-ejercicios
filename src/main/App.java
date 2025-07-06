package main;

import main.Ejercicio_01_insert.InsertBST;
import utils.StudentValidator;
import main.Materia.Models.Node;

public class App {
    public static void main(String[] args) throws Exception {
        // NO MODIFICAR ESTE CÓDIGO
        var estudiante = StudentValidator.validarDatos();
        System.out.println("👤 Estudiante: " + estudiante.nombre());
        System.out.println("✉️  Correo: " + estudiante.correo());
        // NO MODIFICAR HASTA AQUÍ

        InsertBST bst = new InsertBST();
        int[] values = {5, 3, 7, 2, 4, 6, 8};
        Node root = null;
        for (int val : values) {
            root = bst.insert(root, val);
        }

        System.out.println("Recorrido preorden del árbol BST:");
        bst.preOrder(root);
    }
}

