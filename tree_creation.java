public class TreeMain {
    static class Node {
        int value;
        Node left, right;

        Node(int val) {
            value = val;
            left = right = null;
        }
    }

    static class BinaryTree {
        Node root;

        void insert(int val) {
            root = insertRec(root, val);
        }

        Node insertRec(Node current, int val) {
            if (current == null) return new Node(val);
            if (val < current.value) current.left = insertRec(current.left, val);
            else current.right = insertRec(current.right, val);
            return current;
        }

        void inorderTraversal() {
            inorder(root);
            System.out.println();
        }

        void inorder(Node node) {
            if (node != null) {
                inorder(node.left);
                System.out.print(node.value + " ");
                inorder(node.right);
            }
        }
    }
    
    
    

    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
        int[] values = {40, 20, 60, 10, 30, 50, 70};

        for (int val : values) {
            tree.insert(val);
        }

        System.out.println("Inorder traversal:");
        tree.inorderTraversal();
    }
}
