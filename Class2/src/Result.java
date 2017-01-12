
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author shakil10vr
 */
public class Result {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input=new Scanner(System.in);
        System.out.print("Enter the mark:");
        float num=input.nextFloat();
        System.out.print("The Grade is ");
        if(num>=80)
            System.out.println("A+");
        else if(num>=75&&num<=79)
            System.out.println("A");
        else if(num>=70&&num<=74)
            System.out.println("B");
        else if(num>=65&&num<=69)
            System.out.println("C");
        else if(num>=60&&num<=64)
            System.out.println("D");
        else if(num>=0&&num<=59)
            System.out.println("F");
        else
            System.out.print("Invalid");
    }
    
}
