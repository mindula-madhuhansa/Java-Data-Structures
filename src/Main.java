import binary_search_tree.BinarySearchTree;
import binary_search_tree.Node;
import datastructures.List.ContiguousList;

public class Main {
    public static void main(String[] args) {
        BinarySearchTree tree = new BinarySearchTree();

        tree.insert(new Node(45));
        tree.insert(new Node(15));
        tree.insert(new Node(79));
        tree.insert(new Node(90));
        tree.insert(new Node(10));
        tree.insert(new Node(55));
        tree.insert(new Node(12));
        tree.insert(new Node(20));
        tree.insert(new Node(50));

        tree.preorder();
        System.out.println();
        tree.inorder();
        System.out.println();
        tree.postorder();
        System.out.println();
    }
}
