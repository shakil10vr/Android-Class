package homework2;


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
public class WhoIsSmallest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        System.out.println("Enter any 3 different number:");
        double a = input.nextDouble(),b = input.nextDouble(),c = input.nextDouble();
        if(a<b && a<c)
            System.out.println(a+" is the smallest");
        else if(b<a && b<c)
            System.out.println(b+" is the smallest");
        else if(c<b && c<a)
            System.out.println(c+" is the smallest");
        else
            System.out.println("Some of the numbers are same");
    }
    
}
