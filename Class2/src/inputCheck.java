
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
public class inputCheck {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input=new Scanner(System.in);
        System.out.println("Enter a number:");
        int num = input.nextInt();
        switch(num){
            case 1:System.out.println("1");
            break;
            case 2:System.out.println("2");
            break;
            case 3:System.out.println("3");
            break;
            default:System.out.print("WOW");
        }
            
    }
    
}
