
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
public class UserInputCalculation {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input=new Scanner(System.in);
        System.out.print("Enter number of inputs:");
        int n=input.nextInt();
        float sum=0;
        for(int i=1;i<=n;i++)
        {
            System.out.print("Enter number to add:");
            int k=input.nextInt();
            sum+=k;
        }
        
        System.out.println("Summation of the number:"+sum);
        System.out.println("Average of the number:"+(sum/n));
    }
    
}
