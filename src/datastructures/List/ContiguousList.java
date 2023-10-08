package datastructures.List;

public class ContiguousList {
    private int maxSize;
    private int position;
    private int[] list;

    public ContiguousList(int size){
        maxSize = size;
        list = new int[maxSize];
        position=-1;
    }

    // check if list is empty
    public boolean isListEmpty(){
        return (position == -1);
    }

    // check if list is full
    public boolean isListFull(){
        return (position == maxSize - 1);
    }

    // return the list size at that moment
    public int listSize(){
        return (position + 1);
    }

    // insert an element at the end of the list
    public void insertLast(int value){
        if (isListFull()) {
            System.out.println("List is full.");
        } else {
            list[++position] = value;
        }
    }

    // insert an element to the list for a given index;
    public void insertList(int value, int index){
        int i;
        if (isListFull()){
            System.out.println("List is full.");
        } else if (index < 0 || index > listSize()) {
            System.out.println("Invalid index.");
        } else {
            for (i = listSize(); i > index; i--) {
                list[i] = list[i-1];
            }
            list[index] = value;
            position++;
        }
    }

    // delete an element from the given index
    public int deleteList(int index){
        int i, element;
        if (isListEmpty()){
            System.out.println("List is empty.");
        } else if (index < 0 || index >= listSize()) {
            System.out.println("Invalid index.");
        } else {
            element = list[index];
            for (i = index; i < listSize() - 1; i++) {
                list[i] = list[i+1];
            }
            position--;
            return element;
        }
        return 0;
    }

    // show an element from the given index
    public int retrieveList(int index){
        int element;
        if (isListEmpty()){
            System.out.println("List is empty.");
        } else if (index < 0 || index >= listSize()) {
            System.out.println("Invalid index.");
        } else {
            element = list[index];
            return element;
        }
        return 0;
    }

    // replace an element in the list with a given index and the value
    public void replaceList(int index, int value){
        if (isListEmpty()){
            System.out.println("List is empty.");
        } else if (index < 0 || index >= listSize()){
            System.out.println("Invalid index.");
        } else {
            list[index] = value;
        }
    }

    // print all elements in the list
    public void traversalList(){
        int i;
        for (i = 0; i < listSize() ; i++) {
            System.out.print(list[i] + " ");
        }
    }

    // insertion sort
    public void insertionSort(){
        for (int i = 1; i < listSize(); i++){
            int temp = list[i];
            int j = i - 1;

            while (j >= 0 && list[j] > temp){
                list[j + 1] = list[j];
                j--;
            }
            list[j + 1] = temp;
        }
    }

    // selection sort
    public void selectionSort(){
        for (int i = 0; i < listSize() - 1; i++) {
            int min = i;
            for (int j = i; j < listSize(); j++) {
                if (list[min] > list[j]){
                    min = j;
                }
            }
            int temp = list[i];
            list[i] = list[min];
            list[min] = temp;
        }
    }

    // bubble sort
    public void bubbleSort(){
        for (int i = 0; i < listSize() - 1; i++) {
            for (int j = 0; j < listSize() - i - 1; j++) {
                if (list[j] > list[j + 1]){
                    int temp = list[j];
                    list[j] = list[j + 1];
                    list[j + 1] = temp;
                }
            }
        }
    }

    // binary search
    public int binarySearch(int key){
        int low = 0;
        int high = listSize() - 1;

        while (low <= high){
            int middle = (low + high) / 2;
            int value = list[middle];

            System.out.println("middle: " + value);

            if (value < key){
                low = middle + 1;
            } else if (value > key){
                high = middle - 1;
            } else {
                return middle;
            }
        }
        return -1;
    }
}
