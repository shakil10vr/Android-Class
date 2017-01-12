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
public class PrintOdds {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double a;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number to find the odd numbers in between:");
        a = input.nextDouble();
        for(int i=0;i<=a;i++)
            if(i%2==1)
                System.out.println(i);
    }
    
}
