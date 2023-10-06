package datastructures.Queue;

// node class
class Node{
    int data;
    Node next;
}
public class LinkedQueue {
    private Node front;
    private Node rear;
    private int queueSize;

    public LinkedQueue(){
        front = null;
        rear = null;
        queueSize = 0;
    }

    // check if queue is empty
    public boolean isQueueEmpty(){
        return (queueSize == 0);
    }

    // return and element from the front of the queue
    public int serve(){
        if (isQueueEmpty()){
            System.out.println("Queue is empty");
            return 0;
        } else {
            int data = front.data;
            front = front.next;
            queueSize--;
            return data;
        }
    }

    // append an element to end of the queue
    public void append(int element){
        Node oldRear = rear;
        rear = new Node();
        rear.data = element;
        rear.next = null;

        if (isQueueEmpty()){
            front = rear;
        } else {
            oldRear.next = rear;
        }
        queueSize++;
    }
}
