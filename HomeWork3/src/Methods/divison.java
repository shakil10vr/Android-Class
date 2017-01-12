/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Methods;

import java.util.Scanner;

/**
 *
 * @author shakil10vr
 */
public class divison {

    /**
     * @param args the command line arguments
     */
    public static double division(double x, double y)
    {
        return x/y;
    }
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the Dividend:");
        double dividend =input.nextDouble();
        System.out.println("Enter the Divisor:");
        double divisor =input.nextDouble();
        System.out.println("The divison result:"+division(dividend,divisor));
    }
    
}
