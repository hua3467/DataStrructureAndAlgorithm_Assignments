/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author aaronyang
 */
public class Client {
    
    public static void main(String[] args) {
        LuckyNumberList luckyList = new LuckyNumberList();
        
        String[] nameArr = { "Aaron", "Blake","Olivia","Kang", "Jake", "Alisa", "Mike", "Jhon", "Dan", "Amy"};
        
        for(int i = 0; i < nameArr.length; i++){
            luckyList.addLuckyNumber(new LuckyNumber(nameArr[i]));
        }
       
        System.out.println( "Using toString() luckyList = " + luckyList.toString() );
        System.out.print("\n");
        
        Iterator<Position<LuckyNumber>> luckyListIterator = luckyList.positions().iterator();
        
        System.out.print("Using luckyListIterator LuckyNumberList = ");
        while ( luckyListIterator.hasNext() )
            System.out.print( luckyListIterator.next().getElement().toString() + " " );
        System.out.print( "\n\n" );
        
        
        Iterator<Position<LuckyNumber>> evenListIterator = luckyList.evenPositions().iterator();
        
        System.out.println("Using evenListIterator luckyList:  ");
        while( evenListIterator.hasNext())
            System.out.print( evenListIterator.next().getElement().toString() + "\n" );
        System.out.print("\n\n");
        
        Iterator<Position<LuckyNumber>> primeListIterator = luckyList.PrimePositions().iterator();
        
        System.out.println("Using primeListIterator luckyList: ");
        LuckyNumber num = null;
        while( primeListIterator.hasNext())
            System.out.println( primeListIterator.next().getElement().toString());
        System.out.println("");

               
    }
    public String evenOrOdd(int n){
        if(n % 2 == 0)
            return "Even";
        else{

            return "Odd";
        }
    } 
    public String primeOrNot(int n){
        boolean flag = false;
        for(int i = 2; i <= n/2; ++i)
        {
            // condition for nonprime number
            if(n % i == 0)
            {
                flag = true;
                break;
            }
        }
        if(!flag)
            return "Prime";
        else
            return "Not Prime";
    }
    
}
