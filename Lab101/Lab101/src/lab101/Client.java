
package lab101;
import java.util.Scanner;
/**
 *
 * @author Zhenhua (Aaron) Yang
 * @version 20180829
 */
public class Client {
    
    public static void main(String[] args){
        
        Employee[] employeeList = new Employee[10]; //Create an array called "employeeList" with the length of 10.
        
        Scanner inputInfo = new Scanner(System.in);  //Create an Scanner object "inputInfo".
        
        String name;
        String typeOfEmployment;
        String title;
        String position;
        int salary;
        double hourlyRate;
        
        for( int i = 0; i < 3; i++){   //Create a loop to ask user enter employee information from keyboard.
            
            Salaried newPerson = new Salaried();
              
            System.out.print("Please enter the employee's name: ");
            name = inputInfo.next();
        
            System.out.print("Salaried(please enter \"S\") or Hourly(please enter \"H\")? ");
            typeOfEmployment = inputInfo.next() ;
        
            if(typeOfEmployment.equals("S")){   //chack if the employee type is Salaried or HourlyRated. 
        
                System.out.print("Please enter the employee's title: ");
                title = inputInfo.next();
        
                System.out.print("Please enter the salary of the employee: ");
                salary = inputInfo.nextInt();
            
                employeeList[i] = new Salaried(name, title, salary );     // if letter "S" was entered, create an array element of salaried employee. 
        
            }else{
            
                System.out.print("Please enter the employee's position: ");
                position = inputInfo.next();
        
                System.out.print("Please enter the hourlyRate of the employee: ");
                hourlyRate = inputInfo.nextDouble();
            
                employeeList[i] = new Hourly(name, position, hourlyRate );   // if letter "H" was entered, create an array element of hourly rated employee.
            
            }
       
        }
        
        System.out.println("\n");
        

        for ( Object element: employeeList ){             //print out the element of the array "employeeList". 
            
            System.out.println(element);
            
        }
        
    }
    
}
