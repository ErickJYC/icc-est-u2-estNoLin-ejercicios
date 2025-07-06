package main.Ejercicio_01_insert;
import main.Materia.Models.Node;

public class InsertBSTTest {
    public Node insert(Node root, int value) {
        if (root == null) {
            return new Node(value);
        }
        if (value < root.getValue()) {
            root.setLeft(insert(root.getLeft(), value));
        } else if (value > root.getValue()) {
            root.setRight(insert(root.getRight(), value));
        }
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
        int[] values = {5, 3, 7, 2, 4, 6, 8};
        Node root = null;
        for (int val : values) {
            root = insert(root, val);
        }
        System.out.println("Recorrido preorden del árbol BST:");
        preOrder(root);
        System.out.println();
    }

}

