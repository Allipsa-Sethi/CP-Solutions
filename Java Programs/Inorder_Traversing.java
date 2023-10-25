// Define a class for the nodes of the binary tree
class Node {
    int data; // The value stored in the node
    Node left, right; // The references to the left and right child nodes

    // A constructor to create a new node with the given data
    public Node(int data) {
        this.data = data;
        this.left = null;
        this.right = null;
    }
}

// Define a class for the binary tree
class BinaryTree {
    Node root; // The reference to the root node of the tree

    // A constructor to create an empty tree
    public BinaryTree() {
        this.root = null;
    }

    // A method to perform inorder traversal of the tree using recursion
    public void inorder(Node node) {
        // Base case: if the node is null, return
        if (node == null) {
            return;
        }

        // Recursively traverse the left subtree
        inorder(node.left);

        // Visit the node and print its data
        System.out.print(node.data + " ");

        // Recursively traverse the right subtree
        inorder(node.right);
    }
}

// A class to test the code
class Inorder_Traversing {
    public static void main(String[] args) {
        // Create a binary tree object
        BinaryTree tree = new BinaryTree();

        // Create the nodes of the tree
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);
        tree.root.right.right = new Node(6);

        // Perform inorder traversal of the tree and print the result
        System.out.println("Inorder traversal of the binary tree is:");
        tree.inorder(tree.root);
    }
}
