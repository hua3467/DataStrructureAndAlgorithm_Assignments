/**
 *
 * @author Zhenhua Yang
 * @date 20190120
 * this class tests the methods in the Scores Object
 */
import java.util.Random;
import java.util.Scanner;
import java.util.InputMismatchException;

public class Client {
    public static void main(String[] args) {
        // Create an object of ArrayBag called footballTeam 
        ArrayBag footballTeam = new ArrayBag(2);
        
        
        String playerName = null;
        String position = null;
        int jerseyNum = 0;
        
        
        int addNum = 1;
         
        // create Player objects and add them to footballTeam;
        for( int i = 0; i < addNum; i++ ){
            
            Scanner scan = new Scanner(System.in);
            System.out.println("Player's name: ");
            playerName = scan.next();
            while(!(playerName.matches("^[a-zA-Z]*$"))){
                System.out.println("That doesn't look like a name, try again");
                playerName = scan.next();
            }
            
            System.out.println("Player's position: ");
            position = scan.next();
            while(!(position.matches("^[a-zA-Z]*$"))){
                System.out.println("That doesn't look like a position, try again");
                position = scan.next();
            }
            
            String garbage;
            System.out.println("Jersey Number:");
            while(!scan.hasNextInt())
            {  
                garbage = scan.nextLine();
                System.out.println("Try again:");
            }
            jerseyNum = scan.nextInt();
            
            footballTeam.add(new Player(playerName, position, jerseyNum));
        }
        // 2.display the contens of the Bag.
        System.out.println("The contents of the Bag: \n" + footballTeam.toString());
        System.out.println("");
        
        // 3.Remove a random player from the team.
        footballTeam.remove();
        System.out.println("The contents of the Bag after removement: \n" + footballTeam.toString());
        System.out.println("");
        
        //5.Add a new Player with some made up information.
        Player j = new Player("Juan", "QB", 23);
        footballTeam.add(j);
        System.out.println("Add a new player: \n" + footballTeam.toString());
        System.out.println("");
        
        // 7.Remove the Player that you just added earlier. 
        // Return the status if the this player is removed successfully. 
        boolean removed = footballTeam.remove(j);
        if(removed == true){
            System.out.println("Juan was removed!");
        }else{
            System.out.println("Didn't find the object!");
        }
        System.out.println("Now the bag is: \n" + footballTeam.toString());
        System.out.println("");
        
        
        /**
         * Demonstrate that the generic class can support objects of different types
         */
        //Create an instance of a Bag called courses to store the course ids 
        
        ArrayBag courses = new ArrayBag();
        
        // add all my courses:
        courses.add("CSCI-161");
        courses.add("CSCI-313");
        courses.add("CSCI-716");
        courses.add("CSCI-718");
        courses.add("CSCI-846");
          
        // Display the contents of the Bag.
        System.out.println("All the courses: " + courses.toString());
        
        // Remove a random course id from the Bag.
        courses.remove();
        // Display the contents of the Bag.
        System.out.println("Remove a random course: " + courses.toString());
        
        // basketballTeam
        LinkedBag basketballTeam = new LinkedBag();
        
        // add Players
        basketballTeam.add(new Player("Rylee Nudell", "Position 1", 21));
        basketballTeam.add(new Player("Emily Dietz", "Position 2", 34));
        basketballTeam.add(new Player("Michelle Gaislerova", "Position 3", 22));
        basketballTeam.add(new Player("Tyrah Spencer", "Position 1", 24));
        basketballTeam.add(new Player("Marina Fernandez", "Position 3", 31));
        basketballTeam.add(new Player("Sofija Zivaljevic", "Position 2", 4));
        basketballTeam.add(new Player("Cirkeline Rimdal", "Position 1", 13));
        basketballTeam.add(new Player("Danneka Voegeli", "Position 1", 44));
        
        // Display the contents of the Bag.
        System.out.println("All the Players: " + basketballTeam.toString());
        
        // Remove a random course id from the Bag.
        basketballTeam.remove();
        // Display the contents of the Bag.
        System.out.println("Remove a random player: " + basketballTeam.toString());

        
    }
}  