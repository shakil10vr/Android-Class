/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package homework2;

import java.util.Scanner;

/**
 *
 * @author shakil10vr
 */
public class evenOdd {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number:");
        double a = input.nextDouble();
        if (a%2==0)
            System.out.println(a+" is even number.");
        else
            System.out.println(a+" is odd number.");
        
    }
    
}
