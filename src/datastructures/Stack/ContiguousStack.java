package datastructures.Stack;

public class ContiguousStack {
    private int top;
    private int maxSize;
    private int[] stack;

    public ContiguousStack(int size){
        maxSize = size;
        stack = new int[maxSize];
        top = -1;
    }

    // check if stack is empty
    public boolean isStackEmpty(){
        return (top == -1);
    }

    // check if stack is full
    public boolean isStackFull(){
        return (top == maxSize - 1);
    }

    // push an element to top of the stack
    public void push(int element){
        if (isStackFull()){
            System.out.println("Stack is full.");
            System.exit(1);
        } else {
            stack[++top] = element;
        }
    }

    // pop last element from the stack
    public int pop(){
        if (isStackEmpty()) {
            System.out.println("Stack is empty");
            System.exit(1);
        }
        return (stack[top--]);
    }
}
