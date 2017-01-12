/*
 Write a java program to print your three favorites hobby. File name is myHobby.java.
 */
package homework1;

/**
 *
 * @author shakil10vr
 */
public class myHobby {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String[] hobbies={"Gossiping","Browsing Internet","Working with hardwares"};
        System.out.println("My hobbies are:");
        int i = 0,loop=hobbies.length;
        while(i<loop)
        {
            System.out.println((i+1)+": "+hobbies[i]);
            i++;
        }
    }
    
}
