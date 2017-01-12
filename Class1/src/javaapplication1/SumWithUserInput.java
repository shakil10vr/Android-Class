/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import java.util.Scanner;

/**
 *
 * @author shakil10vr
 */
public class SumWithUserInput {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input=new Scanner(System.in);
        
        double number1,number2,sum;
        System.out.println("Enter a number:");
        number1=input.nextDouble();
        System.out.println("Enter another number:");
        number2=input.nextDouble();
        //System.out.println("Result of the Summation:"+(number1+number2));
        System.out.printf("Sum= %.2f\n",(number1+number2));
    }
    
}
