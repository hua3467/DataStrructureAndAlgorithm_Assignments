/**
 *
 * @author aaronyang
 */

import java.util.Random;

public class LinkedBag <E> implements Bag<E> {
    
    private SinglyLinkedList list;
    private static int count;
    
    public LinkedBag(){
        list = new SinglyLinkedList();
    }
    
    @Override
    public int getCurrentSize() {
        return count;
    }

    @Override
    public boolean isEmpty() {
        return count == 0;
    }

    @Override
    public void add(E e) {
        list.addLast(e);
    }

    @Override
    public boolean remove(E e) {
        
        
        
    }

    @Override
    public E remove() {
        
        if(list.isEmpty()) return null;
        
        Random rand = new Random();
        int r = rand.nextInt();
        list.
        
    }

    @Override
    public void clear() {
        
    }

    @Override
    public int getFrequencyOf(E e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean contains(E e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
