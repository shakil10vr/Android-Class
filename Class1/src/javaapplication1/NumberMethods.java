/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import static java.lang.Math.*;
import java.util.Random;

/**
 *
 * @author shakil10vr
 */
public class NumberMethods {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int number1=-35;
        int number2=32;
        double num1=3.43;
        System.out.println("Abs value="+abs(number1));
        System.out.println("Ceil value="+ceil(num1));
        System.out.println("Floor value="+floor(num1));
        System.out.println("Round value="+round(num1));
        System.out.println("Power value="+pow(number2,num1));
        System.out.println("Square root value="+sqrt(num1));
        System.out.println("Max value="+max(number2,num1));
        System.out.println("Min value="+min(number2,num1));
        Random rand=new Random();
        int value=rand.nextInt(100);
        System.out.println("Random value="+value);
    }
    
}
