/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package StringException;

import java.util.Scanner;

/**
 *
 * @author shakil10vr
 */
public class ConcString {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the first Sentence:");
        String a= input.nextLine();
        System.out.println("Enter the second Sentence:");
        String b= input.nextLine();
        System.out.println(a+b);
    }
    
}
