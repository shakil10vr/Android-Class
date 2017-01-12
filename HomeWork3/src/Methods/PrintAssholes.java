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
public class PrintAssholes {

    /**
     * @param args the command line arguments
     */
    public static void Assholes(String X,String Y, String Z){
        System.out.println("Assholes are: "+X+", "+Y+" & "+Z);
    }
    public static void main(String[] args) {
        String names[]= new String[4];
        Scanner input = new Scanner(System.in);
        for(int i=1;i<=3;i++){
            System.out.println("Enter name of Friend "+i+":");
            names[i]=input.next();
        }
        Assholes(names[1],names[2],names[3]);
    }
    
}
