import datastructures.List.ContiguousList;

public class Main {
    public static void main(String[] args) {
        ContiguousList list = new ContiguousList(9);

        list.insertList(9, 0);
        list.insertList(1, 1);
        list.insertList(8, 2);
        list.insertList(2, 3);
        list.insertList(7, 4);
        list.insertList(3, 5);
        list.insertList(6, 6);
        list.insertList(4, 7);
        list.insertList(5, 8);
        list.traversalList();
        System.out.println();
//        list.insertionSort();
//        list.selectionSort();
        list.bubbleSort();

        int index = list.binarySearch(5);
        System.out.println("at: " + index);
        list.traversalList();

    }
}
