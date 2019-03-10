
import java.util.NoSuchElementException;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author aaronyang
 */
public class LuckyNumberList {
    private LinkedPositionalList<LuckyNumber> list = null;
    
    public LuckyNumberList(){
        list = new LinkedPositionalList();
    }
    
    public void addLuckyNumber(LuckyNumber lucky){
        list.addLast(lucky);
    }
    
    public boolean isEven(int n){
        return n%2 == 0;
    }
    
    //----- nested PositionIterator class -----
    private class PositionIterator implements Iterator<Position<LuckyNumber>>{
        private Position<LuckyNumber> cursor = list.first();   // position of the next element to report
        private Position<LuckyNumber> recent = null;               // position of last reported element
        /** Tests whether the iterator has a next object. */
        @Override
        public boolean hasNext( ) { return ( cursor != null ); }
        /** Returns the next position in the iterator. */
        @Override
        public Position<LuckyNumber> next( ) throws NoSuchElementException {
            if ( cursor == null ) throw new NoSuchElementException( "nothing left " );
            recent = cursor;
            cursor = list.after( cursor );
            return recent;
        }
        /** Removes the element returned by most recent call to next. */
        @Override
        public void remove( ) throws IllegalStateException {
            if ( recent == null ) throw new IllegalStateException( "nothing to remove" );
            list.remove( recent );         // remove from outer list
            recent = null;              // do not allow remove again until next is called
        }
    } //----- end of nested PositionIterator class -----
    
    //----- nested PositionIterable class -----
    private class PositionIterable implements Iterable<Position<LuckyNumber>>{
        @Override
        public Iterator<Position<LuckyNumber>> iterator( ) { return new PositionIterator( ); }        
    } //----- end of nested PositionIterable class -----
    
    /** Returns an iterable representation of the list's positions.
     * @return  */
    public Iterable<Position<LuckyNumber>> positions( ) {
        return new PositionIterable( );  // create a new instace of the inner class
    }
    
    //----- nested PositionIterator class -----
    private class EvenPositionIterator implements Iterator<Position<LuckyNumber>>{
        private Position<LuckyNumber> cursor = list.first();   // position of the next element to report
        private Position<LuckyNumber> recent = null;               // position of last reported element
        /** Tests whether the iterator has a next object. */
        @Override
        public boolean hasNext( ) { return ( cursor != null ); }
        /** Returns the next position in the iterator. */
        @Override
        public Position<LuckyNumber> next( ) throws NoSuchElementException {
            // On the first call to next (i.e. when recent == null) you need to      //<<< new code
            // advance recent until it is pointing to a vowel element.                //<<< new code
            if ( recent == null )                                                    //<<< new code 
            {                                                                        //<<< new code
                while ( cursor != null && !isEven( cursor.getElement().getLuckyNumber()) )    //<<< new code
                    cursor = list.after( cursor );                               //<<< new code
            }                                                                        //<<< new code
                
            if ( cursor == null ) throw new NoSuchElementException( "nothing left " );
            recent = cursor;
            cursor = list.after( cursor );
            
            // advance cursor to the next vowel
            
            while ( cursor != null && !isEven( cursor.getElement().getLuckyNumber()) )
                cursor = list.after( cursor );
            
            return recent;
        }
        /** Removes the element returned by most recent call to next. */
        @Override
        public void remove( ) throws IllegalStateException {
            if ( recent == null ) throw new IllegalStateException( "nothing to remove" );
            list.remove( recent );         // remove from outer list
            recent = null;              // do not allow remove again until next is called
        }
    } //----- end of nested PositionIterator class -----
    
    //----- nested PositionIterable class -----
    private class VowelPositionIterable implements Iterable<Position<LuckyNumber>>{
        @Override
        public Iterator<Position<LuckyNumber>> iterator( ) { return new EvenPositionIterator( ); }        
    } //----- end of nested PositionIterable class -----
    
    /** Returns an iterable representation of the list's positions.
     * @return  */
    public Iterable<Position<LuckyNumber>> vowelPositions( ) {
        return new VowelPositionIterable( );  // create a new instace of the inner class
    }
    
}


