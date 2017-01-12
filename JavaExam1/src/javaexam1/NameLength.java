/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaexam1;

import java.util.Scanner;

/**
 *
 * @author shakil10vr
 */
public class NameLength {

    /**
     * @param args the command line arguments
     */
    public static int theLargest(int a, int b, int c){
        int res;
        if (a>b && (b>c || b==c))
            res = a;
        else if(b>a && (a>c || a==c))
            res = b;
        else if(c>a && (a>b || a==b))
            res= c;
        else
            res = 0;
        return res;
    }
    public static void main(String[] args) {
        // TODO code application logic here
        String name[]=new String[3];
        Scanner input = new Scanner(System.in);
        for(int i=1;i<=3;i++)
        {
            System.out.println("Enter name "+i+" :");
            name[i-1] = input.nextLine();
        }
        int a= name[0].length();
        int b= name[1].length();
        int c= name[2].length();
        
        int res = theLargest(a,b,c);
        if (res==a)
            System.out.println("The largest name is:"+name[0]);
        if (res==b)
            System.out.println("The largest name is:"+name[1]);
        if (res==c)
            System.out.println("The largest name is:"+name[2]);
    }
    
}
