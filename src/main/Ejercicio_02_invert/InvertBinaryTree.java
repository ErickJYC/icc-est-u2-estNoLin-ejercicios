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

    public void ejecutar() {
        Node root = new Node(4);
        root.setLeft(new Node(2));
        root.setRight(new Node(7));
        root.getLeft().setLeft(new Node(1));
        root.getLeft().setRight(new Node(3));
        root.getRight().setLeft(new Node(6));
        root.getRight().setRight(new Node(9));

        Node inverted = invertTree(root);

        System.out.println("Raiz invertida: " + inverted.getValue());
        System.out.println("Hijo izquierdo de la raíz invertida: " + inverted.getLeft().getValue());
        System.out.println("Hijo derecho de la raíz invertida: " + inverted.getRight().getValue());
        System.out.println("Hijo izquierdo del hijo izquierdo invertido: " + inverted.getLeft().getLeft().getValue());
        System.out.println("Hijo derecho del hijo izquierdo invertido: " + inverted.getLeft().getRight().getValue());
        System.out.println("Hijo izquierdo del hijo derecho invertido: " + inverted.getRight().getLeft().getValue());
        System.out.println("Hijo derecho del hijo derecho invertido: " + inverted.getRight().getRight().getValue());
    }
}
