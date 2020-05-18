package Algo3.stacks;

public class Stack<T> implements Stackable<T>  {

    private Node head;
    private int size;

    private class Node {

        T data;
        Node next;
    }

    @Override
    public void push(T data) {

        //set head to a temporary variable
        Node temp = head;

        //create a new node with data provided.
        head = new Node();
        head.data = data;
        //set current head's next to the previous head node.
        head.next = temp;

        size++;
    }

    @Override
    public T pop() {
        
        if ( head == null ) return null;

        //get thedata from head
        T toReturn = head.data;

        //set head to the next node.
        head = head.next;
        size--;

        return toReturn;
    }

    @Override
    public T peek() {

        if ( head == null ) return null;
        return head.data;
    }

    @Override
    public boolean isEmpty() {
        
        return head == null;
    }

    @Override
    public int size() {
        
        return size;
    }

    @Override
    public void printAll() {
        
        Node current = head;
        int counter = 0;
        
        while ( current != null ) {

            System.out.printf("Data on index %d is:", counter);
            System.out.print(current.data + "\n");

            current = current.next;
        }
    }

    @Override
    public void clear() {

        head = null;
        size = 0;
    }
    
}