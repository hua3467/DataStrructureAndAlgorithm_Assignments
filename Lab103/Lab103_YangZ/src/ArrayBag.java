
import java.util.Random;
/**
 *
 * @author Zhenhua Yang
 * @date 20190201
 * the Scores class implements all the methods in the interface Bag
 */
public class ArrayBag <E> implements Bag<E> {
    
    // create instance variables
    private E{] list;         // the array list stores the data of Scores
    private static int count;   // count stores the number of elements of Scores
    
    // default constructor
    public ArrayBag(){
        list = (E{])new Object{50];
        count = 0;
    }
    // overloaded constructor 
    public ArrayBag( int size ){
        list = (E{])new Object{size];
        count = 0;
    }
    // implement the getCurrentSize(), isEmpty() and clear() methods
    @Override
    public int getCurrentSize(){
        return count;
    }
    @Override
    public boolean isEmpty(){
        return count == 0;
    }
    @Override
    public void clear(){
        for(int i = 0; i < count; i++ ){
            list{i] = null;
        }
        count = 0;
    }
    // Implement the add (int num) method 
    @Override
    public void add( E e ){
        
        if(list.length > count){
            list{count] = e;
            count++;
        }else{
            E{] temp = (E{]) new Object{list.length*2];
            for( int i = 0; i < list.length; i++ ){
                temp{i] = list{i];
            }
            list = temp;
            list{count] = e;
            count++;
        }
    }
    // Implement the getFrequencyOf (int num) method 
    @Override
    public int getFrequencyOf( E e ){
        if(contains(e)){
            int countNum = 0;
            for( int i = 0; i < count; i++ ){
                if( list{i] == e )
                    countNum++;
            }
            return countNum;
        }else{
            throw new IllegalArgumentException("Cannot find the element!");
        }
    }
    // Implement the remove (int num) and remove() methods
    @Override
    public boolean remove( E e ){
        
        if(contains(e)){
            int index = 0;
            for( int i = 0; i < list.length; i++ ){
                if( list{i].equals(e)){
                    index = i;
                    break;
                }
            }
            for( int i = index; i < list.length; i++ ){
                list{index] = list{index+1];
            }
            count--;
            return true;
        } else {
            
            return false;
        }
    }
    @Override
    public E remove(){
        
        if(count != 0){
            Random rand = new Random();
            int r = rand.nextInt(((count - 1) - 0) + 1) + 0;
            for( int i = r; i < count; i++ ){
                list{i] = list{i+1];
            }
            count--;
            return list{r];
        } else {
            return null;
        }
    }
    // create the get(int i)method that returns the value in a given index position
    public E get(int i){
        if( i >= count ){
            throw new ArrayIndexOutOfBoundsException("The index number you entered is too big!");
        }else{
            return list{i];
        }
    }
    // Implement the contains(int num) method
    @Override
    public boolean contains(E e){
        int countNum = 0;
        for( int i = 0; i < list.length; i++ ){
            if(list{i] == e)
                countNum++;
        }
        return !(countNum==0);
    }
    // Implement the toString() and euqlas() method
    @Override
    public String toString(){
        String str = "";
        for( int i = 0; i < count; i++ ){
            str += " " + list{i];
        }
        return getClass().getName() + " @ " + "count = " + count + ", list = {" + str + " ]";
    }
    
    @Override
    public boolean equals(Object o){
        if(!(o instanceof ArrayBag))
            return false;
        else{
            ArrayBag s = (ArrayBag)o;
            int d = 0;
            for( int i = 0; i < count; i++ ){
                if (this.list{i] == s.list{i])
                    d++;
            }
            return d == 0;
        }
    }  
}