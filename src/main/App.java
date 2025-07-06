package main;

import main.Ejercicio_01_insert.InsertBST;
import main.Ejercicio_02_invert.InvertBinaryTree;
import main.Ejercicio_03_listLeves.ListLevels;
import main.Ejercicio_04_depth.Depth;
import utils.StudentValidator;
import main.Materia.Models.Node;

public class App {
    public static void main(String[] args) throws Exception {
        // NO MODIFICAR ESTE CÓDIGO
        var estudiante = StudentValidator.validarDatos();
        System.out.println("👤 Estudiante: " + estudiante.nombre());
        System.out.println("✉️  Correo: " + estudiante.correo());
        // NO MODIFICAR HASTA AQUÍ

        //Ejercicio 1

        InsertBST bst = new InsertBST();
        int[] values = {5, 3, 7, 2, 4, 6, 8};
        Node root = null;
        for (int val : values) {
            root = bst.insert(root, val);
        }

        System.out.println("Recorrido preorden del árbol BST:");
        bst.preOrder(root);

        // Ejercicio 2

        root.setLeft(new Node(2));
        root.setRight(new Node(7));
        root.getLeft().setLeft(new Node(1));
        root.getLeft().setRight(new Node(3));
        root.getRight().setLeft(new Node(6));
        root.getRight().setRight(new Node(9));

        InvertBinaryTree inverter = new InvertBinaryTree();

        System.out.println("Árbol original (preorden):");
        inverter.preOrder(root);

        Node inverted = inverter.invertTree(root);
        System.out.println("\nÁrbol invertido (preorden):");
        inverter.preOrder(inverted);


        //Ejercicio 3

        ListLevels listador = new ListLevels();
        var niveles = listador.listLevels(inverted);

        System.out.println("\nNiveles del árbol invertido:");
        int nivel = 0;
        for (var lista : niveles) {
            System.out.print("Nivel " + nivel++ + ": ");
            for (Node nodo : lista) {
                System.out.print(nodo.getValue() + " ");
            }
            System.out.println();
        }

        //Ejercicio 4

        Depth depthCalc = new Depth();
        int profundidad = depthCalc.maxDepth(inverted); // puedes usar root o inverted
        System.out.println("\nProfundidad máxima del árbol invertido: " + profundidad);
    }

}

