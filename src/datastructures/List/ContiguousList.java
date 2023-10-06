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
            System.out.println("List is empty. Can't replace an element from a empty list.");
        } else if (index < 0 || index >= listSize()){
            System.out.println("Invalid index. Can't replace the element at given index.");
        } else {
            list[index] = value;
        }
    }

    // print all elements in the list
    public void traversalList(){
        int i;
        for (i = 0; i < position - 1 ; i++) {
            System.out.println(list[i]);
        }
    }
}
