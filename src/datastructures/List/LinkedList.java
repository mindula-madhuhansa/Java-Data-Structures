package datastructures.List;

// node class
class Node {
    int data;
    Node next;
}

public class LinkedList {
    private Node head;
    private int count;

    public LinkedList(){
        head = null;
        count = 0;
    }

    // check if list is empty
    public boolean isListEmpty(){
        return (head == null);
    }

    // return the list size at that moment
    public int listSize(){
        return count;
    }

    // insert an element at the end of the list
    public void insertLast(int value){
        Node node = new Node();
        node.data = value;
        node.next = null;
        if (head == null) {
            head = node;
        } else {
            Node n = head;
            while (n.next != null) {
                n = n.next;
            }
            n.next = node;
        }
        count++;
    }

    // insert an element to the list for a given index;
    public void insertList(int index, int value){
        Node node = new Node();
        node.data = value;
        node.next = null;

        if (index < 0 || index > listSize()){
            System.out.println("Invalid index.");
        } else {
            Node n = head;
            for (int i = 0; i < index - 1; i++){
                n = n.next;
            }
            node.next = n.next;
            n.next = node;
            count++;
        }
    }

    // delete an element from the given index
    public void deleteList(int index){
        if (isListEmpty()){
            System.out.println("List is empty.");
        } else {
            if (index < 0 || index > listSize()) {
                System.out.println("Invalid index.");
            } else if (index == 0) {
                head = head.next;
            } else {
                Node n1 = head;
                Node n2 = null;
                for (int i = 0; i < index - 1; i++){
                    n1 = n1.next;
                }
                n2 = n1.next;
                n1.next = n2.next;
                n2 = null;
            }
            count--;
        }
    }

    // print all elements in the list
    public void traversalList(){
        Node node = head;
        while (node.next != null){
            System.out.println(node.data);
            node = node.next;
        }
        System.out.println(node.data);
    }
}
