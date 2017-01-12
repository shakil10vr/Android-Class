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
public class LargestAmongThree {

    /**
     * @param args the command line arguments
     */
    public static double theLargest(double num[]){
        double b;
        if (num[0]>num[1] && num[1]>num[2] || num[1]==num[2])
            b = num[0];
        else if(num[1]>num[0] && num[0]>num[2] || num[0]==num[2])
            b = num[1];
        else if(num[2]>num[0] && num[0]>num[1] || num[0]==num[1])
            b= num[2];
        else
            b = 0;
        return b;
    }
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input=new Scanner(System.in);
        double num[]=new double[3];
        for(int i=1;i<=3;i++){
            System.out.println("Enter Number "+i+" value:");
            num[i-1] = input.nextDouble();
        }
        double result=theLargest(num);
        if (result!=0)
            System.out.println("The largest number:"+ result);
        else
            System.out.println("There are 2 large values");
    }
    
}
