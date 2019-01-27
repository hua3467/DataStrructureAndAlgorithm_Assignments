/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author aaronyang
 * @param <T>
 */
public interface GenInterfaceIntro <T> {
     
    public int getCount();
    
    public int getCapacity();
    
    public void add(T newInt) throws IllegalArgumentException;
    
    public T get(int index) throws IllegalArgumentException, IndexOutOfBoundsException;
}
