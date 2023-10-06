package datastructures.Queue;

public class ContiguousQueue {
    private int front;
    private int rear;
    private int maxSize;
    private int[] queue;
    private int count;

    public ContiguousQueue(int size){
        maxSize = size;
        queue = new int[maxSize];
        front = 0;
        rear = -1;
        count = 0;
    }

    // check if queue is empty
    public boolean isQueueEmpty(){
        return rear < front;

        // for circular queue
        // return (count == 0);
    }

    // check if queue is full
    public boolean isQueueFull(){
        return (rear == maxSize - 1);

        // for circular queue
        // return (count == maxSize);
    }

    // append an element to end of the queue
    public void append(int element){
        if (isQueueFull()){
            System.out.println("Queue is full");
        } else {
            queue[++rear] = element;
            count++;

            // for circular queue
            // rear = (rear + 1) % maxSize;
            // queue[rear] = item;
            // count++;
        }
    }

    // return and element from the front of the queue
    public int serve(){
        if (isQueueEmpty()){
            System.out.println("Queue is empty");
            return 0;
        } else {
            int element = queue[front++];
            count--;
            return element;

            // for circular queue
            // int element = queue[front];
            // front = (front + 1) % maxSize;
            // count--;
            // return x;
        }
    }

    // return the size of the queue
    public int queueSize(){
        return count;
    }

}
