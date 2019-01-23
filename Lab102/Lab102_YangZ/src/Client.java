/**
 *
 * @author aaronyang
 */
import java.util.Random;
public class Client {
    public static void main(String[] args) {
        
        // Create an Object of Type Scores with capacity of 100
        int size = 100;
        Scores s = new Scores(size);
        
        Random rand = new Random();
        
        // populate the list in Scores object with 100 random numbers between 
        // -100 and +100 inclusive
        for( int i = 0; i < size; i++ ){
            
            s.add(rand.nextInt(101 - (-101) + 1 ) - 101);
        }
        
        // print the contents of the Scores object
        System.out.println("Contents of Scores: " + s.toString());
        
        // Call the add( ) method to add the number 86 to the Bag
        // and print the current size of the list
        s.add(86);
        System.out.println("add number 86: " + s.getCurrentSize());
        
        // randomly remove a number from the Bag
        s.remove();
        
        // Get the number at the 75th index position
        int num = s.get(75);
        System.out.println("Get the number at the 75th index position: " + num);
        // Print the frequency that the number returned by the previous step occurs in the Bag
        System.out.println("The frequency of this number: " + s.getFrequencyOf(num));
        
        s.remove(num);
        // print frequency that this number now occurs in the Bag
        System.out.println("The frequency of the same number after removing the first one: " + s.getFrequencyOf(num));
        
        // Print the frequency of the number 86
        System.out.println("The frequency of this number 86: " + s.getFrequencyOf(86));
        // Check if Scores contains number 86
        System.out.println("Does if contain the number 86? " + s.contains(86));
        System.out.println("The Score now is: \n" + s.toString());
        
        // testing remove() method when the bag is empty. 
//        s.clear();
//        s.remove();
    }
}
