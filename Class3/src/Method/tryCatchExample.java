/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Method;

import java.util.Scanner;

/**
 *
 * @author shakil10vr
 */
public class tryCatchExample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        
        int number = 10;
        int value, result=0;
        System.out.println("Enter Input:");
        try
        {
            value=input.nextInt();
            result=number/value;
            System.out.println("Output: "+result);
        }
        catch(Exception e)
        {
            System.out.println("Exception"+e);
        }
                
    }
    
}
