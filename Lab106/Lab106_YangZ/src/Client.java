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
        
        Iterator<LuckyNumber> iter = luckyList.iterator();
    }
    
    
    
}
