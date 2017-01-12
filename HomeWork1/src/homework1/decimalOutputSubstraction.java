/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package homework1;

import java.util.Scanner;

/**
 *
 * @author shakil10vr
 */
public class decimalOutputSubstraction {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input= new Scanner(System.in);
        double num1,num2;
        System.out.print("Enter a number:");
        num1 = input.nextDouble();
        System.out.print("Enter another number:");
        num2 = input.nextDouble();
        System.out.printf("%.0f-%.0f = %.0f\n",num1,num2,(num1-num2));
    }
    
}
