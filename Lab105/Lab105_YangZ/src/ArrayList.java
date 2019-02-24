/**
 * Data Structure & Algorithms 6th Edition
 * Goodrick, Tamassia, GoldWasser
 * Code Fragments 7.2, 7.3, 7.4 and 7.5
 * 
 * An implementation of a generic ArrayList class.
 */
public class ArrayList<E> implements List<E> {
    // instance variables
    public static final int CAPACITY = 16;      // default array capacity
    private E[] data;                           // generic array used for storage
    private int size = 0;                       // current number of elements
    // constructors
    public ArrayList(){ this(CAPACITY);}        // constructs list with default capacity
    public ArrayList(int capacity){             // constructs list with given capacity
        data = (E[]) new Object[capacity];      // safe cast; compiler may give warning
    }
    // public methods
    /** Returns the number of elements in the array list. */
    public int size(){ return size; }
    /** Returns whether the array list is empty. */
    public boolean isEmpty(){ return size == 0; }
    /** Returns(but do not remove)the element at index i */
    public E get(int i) throws IndexOutOfBoundsException{
        checkIndex(i, size);
        return data[i];
    }
    /** Replaces the element at index i with e, and returns the replaced element. */
    public E set(int i, E e) throws IndexOutOfBoundsException{
        checkIndex(i, size);
        E temp = data[i];
        data[i] = e;
        return temp;
    }
    /** Inserts the element at index i with e, shifting all subsequent elements later.. */
    public void add(int i, E e) throws IndexOutOfBoundsException{
        checkIndex(i, size + 1);
        if(size == data.length)             // not enough capacity
            resize(2 * data.length);
        for(int k = size - 1; k >= i; k--)  // start by shifting rightmost
            data[k + 1] = data[k];
        data[i] = e;                        // ready to place the new element
        size++;
    }
    /** Remove / returns the element at index i, shifting subsequent elements earlier. */
    public E remove(int i) throws IndexOutOfBoundsException {
        checkIndex(i, size);
        E temp = data[i];
        for( int k = i; k < size - 1; k++ ) //shift elements to fill holl
            data[k] = data[k+1];
        data[size - 1] = null;              // help garbage collection
        size --;
        return temp;
    }
    // utility method
    /** Checks whether the given index is in the range[0, n-1]. */
    protected void checkIndex(int i, int n) throws IndexOutOfBoundsException {
        if(i < 0 || i >= n)
            throw new IndexOutOfBoundsException("Illegal Index: " + i);
    }
    
    /** Resizes internal array to have given capacity >= size. */
    protected void resize(int capacity){
        E[] temp = (E[]) new Object[capacity];
        for( int k = 0; k < size; k++)
            temp[k] = data[k];
        data = temp;
    }
    
    /** toString method */
    public String toString(){
        String str = "";
        for( int i = 0; i < size; i++ ){
            if(i<size-1)
                str += data[i] + ",";
            else
                str += data[i];
        }
        return "(" + str + ")";
    }
    
}
