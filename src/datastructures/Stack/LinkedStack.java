package datastructures.Stack;

// node class
class Node {
    int value;
    Node next;
}
public class LinkedStack {
    private Node top;
    private int size;

    public LinkedStack(){
        this.top = null;
        this.size = 0;
    }

    // check if stack is empty
    public boolean isStackEmpty(){
        return (top == null);
    }

    // print the top element of the stack
    public int peak(){
        if (isStackEmpty()){
            System.out.println("Stack is empty");
        }
        return top.value;
    }

    // remove the top element of the stack
    public int pop(){
        if (top == null) {
            System.out.println("Stack is empty");
            return 0;
        } else {
            int element = top.value;
            this.size -= 1;
            this.top = this.top.next;
            return element;
        }
    }

    // add an element to the top of the stack
    public void push(int element){
        Node node = new Node();
        if (node == null){
            System.out.println("Heap overflow");
            System.exit(1);
        } else {
            node.value = element;
            node.next = top;
            top = node;
            this.size += 1;
        }
    }
}
