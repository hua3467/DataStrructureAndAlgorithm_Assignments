import java.util.Iterator;

/**
 *
 * @author aaronyang
 */
public class List<T> implements Iterable<T> {
    Node<T> head, tail;
    
    //add new Element at tail of the linked list in O(1)
    public void add(T data){
        Node<T> node = new Node<>(data, null);
        if( head == null )
            tail = head = node;
        else{
            tail.setNext(node);
            tail = node;
        }
    }
        
        
   // return head
    public Node<T> getHead(){
        return head;
    }
    
    public Node<T> getTail(){
        return tail;
    }
    
    public Iterator<T> iterator(){
        return new ListIterator<T>(this);
    }
}

class ListIterator<T> implements Iterator<T>{ 
    Node<T> current;
    
    public ListIterator(List<T> list){
        current = list.getHead();
    }
    
    // returns false if next element does not exist
    public boolean hasNext(){
        return current != null;
    }
    
    // return current data and update pointer
    public T next(){
        T data = current.getData();
        current = current.getNext();
        return data;
    }
    
    public void remove(){
        throw new UnsupportedOperationException();
    }
    
}

class Node<T> {
    T data;
    Node<T> next;
    public Node(T data, Node<T> next){
        this.data = data;
        this.next = next;
    }
    
    public void setData(T data){
        this.data = data;
    }
    public void setNext(Node<T> next){
        this.next = next;
    }
    
    public T getData(){
        return data;
    }
    public Node<T> getNext(){
        return next;
    }  
    
}

class Main{
    public static void main(String[] args) {
        List<String> myList = new List<>();
        
        myList.add("abc");
        myList.add("mno");
        myList.add("pqr");
        myList.add("xyz");
        
        for(String string: myList)
            System.out.println(string);
    }
}
