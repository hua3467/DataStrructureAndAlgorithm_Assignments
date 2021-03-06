
import java.util.Random;
/**
 *
 * @author Zhenhua Yang
 * @date 20190120
 * the Scores class implements all the methods in the interface Bag
 */
public class Scores implements Bag {
    
    // create instance variables
    private int[] list;         // the array list stores the data of Scores
    private static int count;   // count stores the number of elements of Scores
    
    // default constructor
    public Scores(){
        list = new int[50];
        count = 0;
    }
    // overloaded constructor 
    public Scores( int size ){
        list = new int[size];
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
            list[i] = 0;
        }
        count = 0;
    }
    // Implement the add (int num) method 
    @Override
    public void add( int num ){
        
        if(list.length > count){
            list[count] = num;
            count++;
        }else{
            int[] temp = new int[list.length*2];
            for( int i = 0; i < list.length; i++ ){
                temp[i] = list[i];
            }
            list = temp;
            list[count] = num;
            count++;
        }
    }
    // Implement the getFrequencyOf (int num) method 
    @Override
    public int getFrequencyOf( int num ){
        if(contains(num)){
            int countNum = 0;
            for( int i = 0; i < count; i++ ){
                if( list[i] == num )
                    countNum++;
            }
            return countNum;
        }else{
            throw new IllegalArgumentException("Cannot find the number!");
        }
    }
    // Implement the remove (int num) and remove() methods
    @Override
    public void remove( int num ){
        
        if(contains(num)){
            int index = 0;
            for( int i = 0; i < list.length; i++ ){
                if( list[i] == num ){
                    index = i;
                    break;
                }
            }
            for( int i = index; i < list.length; i++ ){
                list[index] = list[index+1];
            }
            count--;
        } else {
            throw new IllegalArgumentException("Cannot find the number!");
        }
    }
    @Override
    public void remove(){
        
        if(count != 0){
        Random rand = new Random();
        int r = rand.nextInt(((count - 1) - 0) + 1) + 0;
        for( int i = r; i < count; i++ ){
            list[i] = list[i+1];
        }
        count--;
        } else {
            throw new ArrayIndexOutOfBoundsException("the bag is empty and nothing can be removed!");
        }
    }
    // create the get(int i)method that returns the value in a given index position
    public int get(int i){
        if( i >= count ){
            throw new ArrayIndexOutOfBoundsException("The index number you entered is too big!");
        }else{
            return list[i];
        }
    }
    // Implement the contains(int num) method
    @Override
    public boolean contains(int num){
        int countNum = 0;
        for( int i = 0; i < list.length; i++ ){
            if( list[i] == num)
                countNum++;
        }
        return !(countNum==0);
    }
    // Implement the toString() and euqlas() method
    @Override
    public String toString(){
        String str = "";
        for( int i = 0; i < count; i++ ){
            str += " " + list[i];
        }
        return getClass().getName() + " @ " + "count = " + count + ", list = [" + str + " ]";
    }
    
    @Override
    public boolean equals(Object o){
        if(!(o instanceof Scores))
            return false;
        else{
            Scores s = (Scores)o;
            int d = 0;
            for( int i = 0; i < count; i++ ){
                d += (this.list[i] - s.list[i]);
            }
            return d == 0;
        }
    }  
}