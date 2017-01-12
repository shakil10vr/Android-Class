/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Array;

import static java.util.Arrays.sort;
import java.util.Scanner;

/**
 *
 * @author shakil10vr
 */
public class ArrayIO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input= new Scanner(System.in);
        
        int number;
        System.out.println("How many numbers:");
        number = input.nextInt();
        int values[]=new int[number];
        
        System.out.println("Input your number:");
        for(int i=0;i<number;i++)
        {
            values[i]=input.nextInt();
        }
        sort(values);
        System.out.println("Output:");
        for(int i=0;i<number;i++)
        {
            System.out.println(values[i]);
        }
           
        
    }
    
}
