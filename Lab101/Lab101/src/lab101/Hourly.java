
package lab101;

/**
 *
 * @author Zhenhua (Aaron) Yang
 * @version 20180829
 */

public class Hourly extends Employee {
    
    private String position;
    private double hourlyRate;
    private int hourlyNum;
    
    //Constructors:
    public Hourly(){
        super();
        position = null;
        hourlyRate = 0;
        hourlyNum ++;
    }
    
    public Hourly ( String newName, String newPosition, double newRate ){
        super(newName);
        position = newPosition;
        hourlyRate = newRate;
        hourlyNum ++;
    }
    
    //Getter and setters. 
    public String getPosition(){
        return position;
    }
    public double getRate(){
        return hourlyRate;
    }
    
    public void setPosition(String newTitle){
        position = newTitle;
    }
    public void setRate(int newRate){
        hourlyRate = newRate;
    }
    
    public int countHourly(){
        return hourlyNum;
    }
    
        //the "toString" mathod to print the attributes of a instance. 
    @Override
    public String toString(){
        return getClass().getName() + ": " + ( super.getId() + 1 ) + ". " + super.getName() + ": " + 
                getPosition() + ", $" + getRate() + "/hour.";
    }
}
