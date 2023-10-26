package binary_search_tree;

public class BinarySearchTree {
    Node root;


    public void insert(Node node){
        root = insertHelper(root, node);
    }

    private Node insertHelper(Node root, Node node){
        int data = node.data;

        if (root == null){
            root = node;
            return root;
        } else if (data < root.data) {
            root.left = insertHelper(root.left, node);
        } else {
            root.right = insertHelper(root.right, node);
        }
        return root;
    }

    // VLR
    public void preorder(){
        preorderHelper(root);
    }

    private void preorderHelper(Node root){
        if (root != null) {
            System.out.print(root.data + " ");
            preorderHelper(root.left);
            preorderHelper(root.right);
        }
    }

    // LVR
    public void inorder(){
        inorderHelper(root);
    }

    private void inorderHelper(Node root){
        if (root != null) {
            inorderHelper(root.left);
            System.out.print(root.data + " ");
            inorderHelper(root.right);
        }
    }

    // LRV
    public void postorder(){
        postorderHelper(root);
    }

    private void postorderHelper(Node root){
        if (root != null) {
            postorderHelper(root.left);
            postorderHelper(root.right);
            System.out.print(root.data + " ");
        }
    }

}
