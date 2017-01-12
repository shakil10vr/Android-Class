/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OOP;

/**
 *
 * @author shakil10vr
 */
public class OverloadingTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        MethodOverloading obj = new MethodOverloading();
        
        System.out.println("Sum = "+obj.sum(10,5));
        System.out.println("Sum = "+obj.sum(5.5, 10.5));
    }
    
}
