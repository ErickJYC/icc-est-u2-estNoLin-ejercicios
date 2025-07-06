package main.Ejercicio_02_invert;

import main.Materia.Models.Node;

public class InvertBinaryTree {
    public Node invertTree(Node root) {
        if (root == null) return null;

        Node temp = root.getLeft();
        root.setLeft(invertTree(root.getRight()));
        root.setRight(invertTree(temp));

        return root;
    }

    public void preOrder(Node root) {
        if (root != null) {
            System.out.print(root.getValue() + " ");
            preOrder(root.getLeft());
            preOrder(root.getRight());
        }
    }
    public void ejecutar() {
        Node root = construirArbol();
        System.out.println("Árbol original (preorden):");
        preOrder(root);
        System.out.println();

        Node inverted = invertTree(root);
        System.out.println("Árbol invertido (preorden):");
        preOrder(inverted);
        System.out.println();
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
