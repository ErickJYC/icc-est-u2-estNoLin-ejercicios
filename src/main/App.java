package main;

import main.Ejercicio_01_insert.InsertBSTTest;
import main.Ejercicio_02_invert.InvertBinaryTree;
import main.Ejercicio_03_listLeves.ListLevels;
import main.Ejercicio_04_depth.Depth;
import main.Materia.Models.Node;
import utils.StudentValidator;

import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {
        // NO MODIFICAR ESTE CÓDIGO
        var estudiante = StudentValidator.validarDatos();
        System.out.println("👤 Estudiante: " + estudiante.nombre());
        System.out.println("✉️  Correo: " + estudiante.correo());
        // NO MODIFICAR HASTA AQUÍ

        System.out.println("----------Ejercicio 1----------\n");
        //Ejercicio 1

        System.out.println("Ejercicio 1: Insertar en BST");
        InsertBSTTest ejercicio1 = new InsertBSTTest();
        ejercicio1.ejecutar();


        System.out.println("\n");

        // Ejercicio 2
        System.out.println("----------Ejercicio 2----------\n");

        System.out.println("\nEjercicio 2: Invertir árbol binario");
        new InvertBinaryTree().ejecutar();

        System.out.println("\n");



        //Ejercicio 3
        System.out.println("----------Ejercicio 3----------\n");

        System.out.println("\nEjercicio 3: Listar niveles del árbol original");
        new ListLevels().ejecutar();

        System.out.println("\n");

        //Ejercicio 4
        System.out.println("----------Ejercicio 4----------\n");
        System.out.println("\nEjercicio 4: Profundidad máxima del árbol");
        new Depth().ejecutar();

    }

}

