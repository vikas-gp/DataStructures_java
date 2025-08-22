package trees.binaryTree;
import java.util.LinkedList;
import java.util.Queue;

class Node{
    int data;
    Node left;
    Node right;

    Node(int data){
        this.data = data;
        this.left = null;
        this.right = null;
    }
}

public class BreadthFirstSearch {
// Binary Tree with BFS
    Node root;
    
    // BFS (Level Order Traversal)
    public void bfs() {
        if (root == null) return;

        Queue<Node> queue = new LinkedList<>();
        queue.add(root);

        while (!queue.isEmpty()) {
            Node current = queue.poll();
            System.out.print(current.data + " ");

            if (current.left != null) queue.offer(current.left);
            if (current.right != null) queue.offer(current.right);
        }
        System.out.println();
        
    }
        public void insert(int data) {
        root = insert(root, data);
    }

    // Recursive insert method (simple BST insertion)
    private Node insert(Node node, int data) {
        if (node == null) {
            node = new Node(data);
            return node;
        }
        if (data < node.data) {
            node.left = insert(node.left, data);
        } else if (data > node.data) {
            node.right = insert(node.right, data);
        }
        return node;
    }

    // Main method to test BFS
    public static void main(String[] args) {
        BreadthFirstSearch tree = new BreadthFirstSearch();

        // Build tree manually
        tree.insert(5);
        tree.insert(2);
        tree.insert(6);
        tree.insert(4);
        tree.insert(1);
        tree.insert(3);
        tree.insert(7);
        tree.insert(10);

        System.out.print("BFS (Level Order): ");
        tree.bfs();
    }
}
