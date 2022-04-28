import java.util.*;

class Node {
    int data;
    Node left = null;
    Node right = null;

    Node(int data) { 
        this.data = data; 
    }
}

class BinaryTree {
    public Node root;

    BinaryTree(Node root) {
        this.root = root;
    }

    public void printInOrder(Node node) {
        if(node != null) {
            printInOrder(node.left);

            System.out.print("" + node.data + " ");

            printInOrder(node.right);
        }
    }

    public void insert(Node node, int valueToFind, int leftValue, int rightValue) {
        if(node != null) {
            if(node.data == valueToFind) {
                if(leftValue != -1)
                    node.left = new Node(leftValue);
                
                if(rightValue != -1)
                    node.right = new Node(rightValue);
            } else {
                insert(node.left, valueToFind, leftValue, rightValue);
                insert(node.right, valueToFind, leftValue, rightValue);
            }
        }
    }

    public void swap(Node node, int depth, int depthToSwap) {
        if(node != null) {
            if(depth % depthToSwap == 0) {
                Node nodeLeaftTemp = node.left;
                node.left = node.right;
                node.right = nodeLeaftTemp;
            }
            
            swap(node.left, depth + 1, depthToSwap);
            swap(node.right, depth + 1, depthToSwap);
        }
    }
}

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int qtdGroupValues = scanner.nextInt();

        BinaryTree binaryTree = new BinaryTree(new Node(1));

        for(int i = 1; i <= qtdGroupValues; i++) {
            int leaftValue = scanner.nextInt();
            int rightValue = scanner.nextInt();
            
            binaryTree.insert(binaryTree.root, i, leaftValue, rightValue);
        }

        int qtdSwap = scanner.nextInt();
        
        for (int i = 0; i < qtdSwap; i++) {
            int deaphToSwap = scanner.nextInt();

            binaryTree.swap(binaryTree.root, 1, deaphToSwap);
            
            binaryTree.printInOrder(binaryTree.root);

            System.out.println("");
        }
    }
}