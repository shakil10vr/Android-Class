/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package homework2;

import java.util.Scanner;

/**
 *
 * @author shakil10vr
 */
public class FindMonth {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input=new Scanner(System.in);
        System.out.println("Enter number of month:");
        int num = input.nextInt();
        switch(num){
            case 1:System.out.println("January");
            break;
            case 2:System.out.println("February");
            break;
            case 3:System.out.println("March");
            break;
            case 4:System.out.println("April");
            break;
            case 5:System.out.println("May");
            break;
            case 6:System.out.println("June");
            break;
            case 7:System.out.println("July");
            break;
            case 8:System.out.println("August");
            break;
            case 9:System.out.println("September");
            break;
            case 10:System.out.println("October");
            break;
            case 11:System.out.println("November");
            break;
            case 12:System.out.println("December");
            break;
            default:System.out.print("Invalid month number");
        }
    }
    
}
    
