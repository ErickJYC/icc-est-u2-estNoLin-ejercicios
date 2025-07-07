package main.Ejercicio_01_insert;
import main.Materia.Models.Node;

public class InsertBSTTest {
    public Node insert(Node root, int value) {
        if (root == null) return new Node(value);
        if (value < root.getValue()) root.setLeft(insert(root.getLeft(), value));
        else if (value > root.getValue()) root.setRight(insert(root.getRight(), value));
        return root;
    }

    public void ejecutar() {
        int[] values = {5, 3, 7, 2, 4, 6, 8};
        Node root = null;
        for (int val : values) {
            root = insert(root, val);
        }

        System.out.println("Raiz: " + root.getValue());
        System.out.println("Hijo izquierda de la raíz: " + root.getLeft().getValue());
        System.out.println("Hijo derecho de la raíz: " + root.getRight().getValue());
        System.out.println("Hijo izquierda del hijo izquierda: " + root.getLeft().getLeft().getValue());
        System.out.println("Hijo derecho del hijo izquierda: " + root.getLeft().getRight().getValue());
        System.out.println("Hijo izquierda del hijo derecho: " + root.getRight().getLeft().getValue());
        System.out.println("Hijo derecho del hijo derecho: " + root.getRight().getRight().getValue());
    }

}

