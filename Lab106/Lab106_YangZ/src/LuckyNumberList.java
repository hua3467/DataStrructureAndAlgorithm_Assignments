/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author aaronyang
 */
public class LuckyNumberList {
    private LinkedPositionalList<LuckyNumber> list = null;
    
    public LuckyNumberList(){
        list = new LinkedPositionalList();
    }
    
    public void addLuckyNumber(LuckyNumber lucky){
        list.addLast(lucky);
    }
}
