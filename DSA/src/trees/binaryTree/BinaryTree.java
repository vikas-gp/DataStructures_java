package trees.binaryTree;
// Node class for Binary Tree
class Node {
    int data;
    Node left, right;

    public Node(int item) {
        data = item;
        left = right = null;
    }
}

// Binary Tree class
public class BinaryTree {
    Node root;

    public BinaryTree() {
        root = null;
    }

    // Insert method (example: insert in level order)
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

    // Inorder traversal
    public void inorder() {
        inorder(root);
        System.out.println();
    }

    private void inorder(Node node) {
        if (node != null) {
            inorder(node.left);
            System.out.print(node.data + " ");
            inorder(node.right);
        }
    }

    // Preorder traversal
    public void preorder() {
        preorder(root);
        System.out.println();
    }

    private void preorder(Node node) {
        if (node != null) {
            System.out.print(node.data + " ");
            preorder(node.left);
            preorder(node.right);
        }
    }

    // Postorder traversal
    public void postorder() {
        postorder(root);
        System.out.println();
    }

    private void postorder(Node node) {
        if (node != null) {
            postorder(node.left);
            postorder(node.right);
            System.out.print(node.data + " ");
        }
    }

    // Main method to run example
    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();

        /* Example insertion */
        tree.insert(5);
        tree.insert(2);
        tree.insert(6);
        tree.insert(4);
        tree.insert(1);
        tree.insert(3);
        tree.insert(7);
        tree.insert(10);
        tree.insert(9);
        tree.insert(8);

        System.out.print("Inorder traversal: ");
        tree.inorder();

        System.out.print("Preorder traversal: ");
        tree.preorder();

        System.out.print("Postorder traversal: ");
        tree.postorder();
    }
}