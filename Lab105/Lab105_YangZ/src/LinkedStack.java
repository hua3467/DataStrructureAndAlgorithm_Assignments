public class LinkedStack<E> implements Stack<E> {
    private SinglyLinkedList<E> list = new SinglyLinkedList<>();    // an empty list
    public LinkedStack(){}                  // new stack relies on the initially empty list
    public int size(){ return list.size(); }
    public boolean isEmpty(){ return list.isEmpty();}
    public void push(E elemtn){list.addFirst(elemtn);}
    public E top(){ return list.first(); }
    public E pop(){ return list.removeFirst(); }
}
