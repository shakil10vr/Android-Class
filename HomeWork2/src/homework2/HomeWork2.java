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
public class HomeWork2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double a;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number to check positive or negetive:");
        a = input.nextDouble();
        if (a==0)
            System.out.println("Undefined");
        else if (a>0)
            System.out.println("Positive");
        else
            System.out.println("Negetive");
    }
    
}
