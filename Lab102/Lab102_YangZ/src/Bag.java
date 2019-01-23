/**
 *
 * @author aaronyang
 */
public interface Bag {
    
    public int getCurrentSize();
    public boolean isEmpty();
    public void add( int num );
    public void remove( int num );
    public void remove();
    public void clear();
    public int getFrequencyOf( int num );
    public boolean contains(int num);
    @Override
    public String toString();
    @Override
    public boolean equals(Object o);  
    
}
