package main.Ejercicio_04_depth;

import main.Materia.Models.Node;

public class Depth {

    public int maxDepth(Node root) {
        if (root == null) return 0;
        return 1 + Math.max(maxDepth(root.getLeft()), maxDepth(root.getRight()));
    }

    public void ejecutar() {
        Node root = new Node(4);
        root.setLeft(new Node(2));
        root.setRight(new Node(7));
        root.getLeft().setLeft(new Node(1));
        root.getLeft().setRight(new Node(3));
        root.getRight().setLeft(new Node(6));
        root.getRight().setRight(new Node(8));

        int profundidad = maxDepth(root);
        System.out.println("Profundidad máxima: " + profundidad);
    }
}
