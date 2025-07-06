package main.Ejercicio_03_listLeves;

import main.Materia.Models.Node;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class ListLevels {
    public List<List<Node>> listLevels(Node root) {
        List<List<Node>> result = new ArrayList<>();
        if (root == null) return result;

        Queue<Node> queue = new LinkedList<>();
        queue.add(root);

        while (!queue.isEmpty()) {
            int size = queue.size();
            List<Node> level = new ArrayList<>();

            for (int i = 0; i < size; i++) {
                Node current = queue.poll();
                level.add(current);
                if (current.getLeft() != null) queue.add(current.getLeft());
                if (current.getRight() != null) queue.add(current.getRight());
            }

            result.add(level);
        }

        return result;
    }
    public void ejecutar() {
        Node root = construirArbol();
        List<List<Node>> niveles = listLevels(root);
        int nivel = 0;
        for (List<Node> lista : niveles) {
            System.out.print("Nivel " + nivel++ + ": ");
            for (Node nodo : lista) {
                System.out.print(nodo.getValue() + " ");
            }
            System.out.println();
        }
    }
    public Node construirArbol() {
        Node root = new Node(4);
        root.setLeft(new Node(2));
        root.setRight(new Node(7));
        root.getLeft().setLeft(new Node(1));
        root.getLeft().setRight(new Node(3));
        root.getRight().setLeft(new Node(6));
        root.getRight().setRight(new Node(9));
        return root;
    }
}
