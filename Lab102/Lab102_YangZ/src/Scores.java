
import java.util.Random;
/**
 *
 * @author aaronyang
 */
public class Scores implements Bag {
    
    private int[] list;
    private static int count;
    
    public Scores(){
        list = new int[50];
        count = 0;
    }
    public Scores( int size ){
        list = new int[size];
        count = 0;
    }
    
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
    
    public int get(int i){
        if( i >= count ){
            throw new ArrayIndexOutOfBoundsException("The index number you entered is too big!");
        }else{
            return list[i];
        }
    }
    
    @Override
    public boolean contains(int num){
        int countNum = 0;
        for( int i = 0; i < list.length; i++ ){
            if( list[i] == num)
                countNum++;
        }
        return !(countNum==0);
    }
    
    @Override
    public String toString(){
        String str = "";
        for( int i = 0; i < count; i++ ){
            str += " " + list[i];
        }
        return getClass().getName() + "@{" + str + " }";
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