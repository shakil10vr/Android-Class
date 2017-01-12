/*
 Write a java program to print random number within range -100 to 100.
 */
package homework1;

import java.util.Random;

/**
 *
 * @author shakil10vr
 */
public class runRandomIn100 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Random rand=new Random();
        int value=(rand.nextInt(200)-100);
        System.out.println("Random value="+value);
    }
    
}
