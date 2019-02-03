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
        
        E element = null;
        for(int i = 0; i < count; i++){
            element = (E) list.removeFirst();
            if(element.equals(e)){
                return true;
            } else {
                list.addLast(element);
            }
        }
        return false;
        
    }

    @Override
    public E remove() {
        
        if(list.isEmpty()) return null;
        
        Random rand = new Random();
        int r = rand.nextInt(count);
        
        E pointer = null;
        
        for( int i = 0; i < count; i++ ){
            
            E e = (E) list.removeFirst();
            if( i == r ){
                pointer = e;
            } else {
                list.addLast(e);
            }
        }
        
        return pointer; 
    }

    @Override
    public void clear() {
        
    }

    @Override
    public int getFrequencyOf(E e) {
        
        E pointer = null;
        int countF = 0;
        
        for( int i = 0; i < count; i++ ){
            
            pointer = (E) list.removeFirst();
            if( e.equals(pointer) ){
                countF++;
                list.addLast(pointer);
            } else {
                list.addLast(pointer);
            }
        }
        
        return countF;
    }

    @Override
    public boolean contains(E e) {
            
        return this.getFrequencyOf(e) == 0;
        
    }
    
    public String toString(){
        return list.toString();
    }
    
}
