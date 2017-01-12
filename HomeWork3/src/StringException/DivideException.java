/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package StringException;

import java.util.Scanner;

/**
 *
 * @author shakil10vr
 */
public class DivideException {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Dividend:");
        double a = input.nextDouble();
        System.out.println("Enter Divisor:");
        double b = input.nextDouble();
        try{
             System.out.println("Result:"+a/b);     
        }
        catch(Exception e)
        {
            System.out.println("Exeption:"+e);
        }
    }
    
}
