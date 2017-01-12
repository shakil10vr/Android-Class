/*
 Write a java program to find the value of  F(x)=x9+5x3+2x-5  where x=4.
 */
package homework1;

import static java.lang.Math.*;

/**
 *
 * @author shakil10vr
 */
public class ValueOfFunction {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int x=4;
        System.out.println("When x=4\nThe value of F(x),   [where F(x)=x^9+5x^9+2x-5]\nis:"+(pow(x,9)+5*pow(x,3)+2*x-5));
    }
    
}
