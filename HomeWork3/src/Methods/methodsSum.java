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
public class methodsSum {

    /**
     * @param args the command line arguments
     */
    public static double Sum(double X, double Y){
        return X+Y;
    }
    public static void main(String[] args) {
        double x,y;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter two number");
        x= input.nextDouble();
        y= input.nextDouble();
        System.out.println("Sum Result:"+Sum(x,y));
    }
    
}
