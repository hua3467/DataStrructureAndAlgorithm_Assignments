
public class Client {

    public static void main(String[] args) {
 
        System.out.println("\n==========\n");
        System.out.println("Using the non-generic Class");        
        
        IntArray array = new IntArray();
        array.add( 55 );
        array.add( 37 );
        System.out.println( array );
        
        System.out.println("\n==========\n");
        System.out.println("Using the Generic Class and ");
        System.out.println("setting the Class for the generic placeholder.");
        
        GenArray<Employee> employeeArray = new GenArray<>();
                
        employeeArray.add( new Employee( 111, "Sue" ) );
        
        employeeArray.add( new Employee( 222, "Bob") );
        
        System.out.println( employeeArray );                
    }
    
}
