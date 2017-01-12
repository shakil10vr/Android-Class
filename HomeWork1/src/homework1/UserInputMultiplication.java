/*
Write a java program to perform multiplication operation by taking user input.
 */
package homework1;

import java.util.Scanner;

/**
 *
 * @author shakil10vr
 */
public class UserInputMultiplication {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input=new Scanner(System.in);
        double num1,num2;
        System.out.print("Enter a number:");
        num1 = input.nextDouble();
        System.out.print("Enter another number:");
        num2 = input.nextDouble();
        System.out.println(num1+" x "+num2+" = "+(num1*num2));
    }
    
}
