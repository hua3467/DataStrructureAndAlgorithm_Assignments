/**
 *
 * @author Zhenhua Yang
 * @version Jan 10, 2019
 * 
 * The Client class tests the Employee class.
 */
public class Client {
    public static void main(String[] args) {    
      // create an instance/object of the Employee class
        Employee boss = new Employee();
        boss.setId( 1 );
        boss.setName( "Joe" );
        boss.setSalary( 120000 );
        System.out.println( "Boss ID:     " + boss.getId() );
        System.out.println( "Boss Name:   " + boss.getName() );
        System.out.println( "Boss salary: " + boss.getSalary() );
      // create an instance/object of the Employee class
        Employee worker = new Employee();
        worker.setId( 2 );
        worker.setName( "Bob" );
        worker.setHourlyRate( 15.00 );
        System.out.println( "Worker ID:   " + worker.getId() );
        System.out.println( "Worker Name: " + worker.getName() );
        System.out.println( "Worker rate: " + worker.getHourlyRate() );  
    }
}

