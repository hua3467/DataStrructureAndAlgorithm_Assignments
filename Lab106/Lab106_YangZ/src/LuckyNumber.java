
import java.util.Random;

/**
 *
 * @author aaronyang
 */
public class LuckyNumber {
    private String name;
    int luckyNumber;
    
    /** overload constructor */
    public LuckyNumber( String n ){
        name = n;
        Random rand = new Random();
        luckyNumber = rand.nextInt(9);
    }
    
    public String getName(){
        return name;
    }
    public int getLuckyNumber(){
        return luckyNumber;
    }
   
    
    public String toString(){
        return getClass().getName() + "@{ " + name + " : " + luckyNumber + "}";
    }
}
