/*
Write a java program to print your information. File name is myInfo.java.
Your name.
Your school ,college & university.
Your location.
Your email.
 */
package homework1;

/**
 *
 * @author shakil10vr
 */
public class myInfo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String name="Tanveer Rahman";
        String school="Chittagong Collegiate School";
        String college="Chittagong Laboratory School & College";
        String uni="Internaional Islamic University Chittagong";
        String loc="30, Mehidibag, Chittagong";
        String email="shakil10vr@hotmail.com";
        System.out.println("Name: "+name+"\nSchool: "+school+"\nCollege: "+college+"\nUniversity: "+uni);
        System.out.println("Location:"+loc+"\nEmail:"+email);
    }
    
}
