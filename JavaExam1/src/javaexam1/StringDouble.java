package javaexam1;
import java.util.Scanner;
public class StringDouble {
public static void main(String[] args) {
        String name[]=new String[3];
        Scanner input = new Scanner(System.in);
        for(int i=1;i<=3;i++){
            System.out.println("Enter number "+i+" :");
            name[i-1] = input.next();}
        double n[] = new double[3];
        for(int i=0;i<3;i++){
            n[i] = Double.parseDouble(name[i]);
            System.out.println(n[i]);
        }      
    }  
}
