/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author shakil10vr
 */
public class forLoop {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int i;
        for(i=0;i<5;i++)
            System.out.println("For Treat"+(i+1));
        i=0;
        while(i<5)
        {
            System.out.println("While Treat"+(i+1));
            i++;
        }
        i=0;
        do
        {
            System.out.println("Do While Treat"+(i+1));
            i++;
        }while(i<5);
    }
}
    
