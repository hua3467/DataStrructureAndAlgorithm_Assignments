/**
 *
 * @author Zhenhua Yang
 * @param <T>
 * @date 20190120
 */
public interface Bag <T> {
    
    public int getCurrentSize();
    public boolean isEmpty();
    public void add( T t );
    public boolean remove( T t );
    public T remove();
    public void clear();
    public int getFrequencyOf( T t );
    public boolean contains(T t); 
    @Override
    public String toString();
    @Override
    public boolean equals(Object o);  
   
    
}
