package lab101;

/**
 *
 * @author Zhenhua (Aaron) Yang
 * @version 20180829
 */
public class Salaried extends Employee {

    private String title;
    private int salary;
    private int salariedNum;
    
    //Constructors:
    public Salaried(){
        super();
        title = null;
        salary = 0;
        salariedNum ++;
    }
    
    public Salaried( String newName, String newTitle, int newSalary ){
        
        super( newName );
        title = newTitle;
        salary = newSalary;
        salariedNum ++;
    }
    
    //getters and setters
    public String getTitle(){
        return title;
    }
    public int getSalary(){
        return salary;
    }
    public int countSalaried(){
        return salariedNum;
    }
    
    public void setTitle(String newTitle){
        title = newTitle;
    }
    public void setSalary(int newSalary){
        salary = newSalary;
    }
    
    //the "toString" mathod to print the attributes of a instance. 
    @Override
    public String toString(){
        return getClass().getName() + ": " + ( super.getId() + 1 ) + ". " + super.getName() + ": " + 
                getTitle() + ", $" + getSalary() + "/year.";
    }
    
}
