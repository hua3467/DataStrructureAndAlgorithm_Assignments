
public interface IntToGenericInterfaceGen<Q> {
  
    public int getCount( );
    
    // no setCount method, count is controlled by class
    
    // no getList method, user cannot get entire array
    
    // no setList method, user cannot set the entire array
    
    public int getCapacity( );
        
    public void add( Q newInt ) throws IllegalArgumentException;
    
    public Q get( int index ) throws IllegalArgumentException, IndexOutOfBoundsException;
       
    public String toString( );

    public boolean equals( Object o );
   
    
    
}
