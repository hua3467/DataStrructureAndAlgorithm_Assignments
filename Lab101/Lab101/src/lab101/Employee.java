
package lab101;

/**
 *
 * @author Zhenhua (Aaron) Yang
 * @version 20180829
 */

public class Employee {
    
    private String name;
    static int id = 0;
    static int countEmployee = 0;
    
    //constructors
    
    public Employee(){
        name = null;

    }
    
    public Employee( String newName ){
     name = newName;
     id ++;
     countEmployee ++;
    }
    
    public int getId(){
        return id;
    }
    public String getName(){
        return name;
    }
    
    public void setName(String newName){
        name = newName;
    }
    
    @Override
    public String toString(){
        return getClass().getName() + ": " + id + name;
    }
    
    @Override
    public boolean equals(Object o){
        Employee objE = (Employee) o;
        if (!(o instanceof Employee ))
            return false;
        else {
            return id == objE.id && name .equals(objE.name);
        }
    }
    
}
