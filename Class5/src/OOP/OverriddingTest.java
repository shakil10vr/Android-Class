/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OOP;

/**
 *
 * @author shakil10vr
 */
public class OverriddingTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Student stud = new Student();
        Teacher teac = new Teacher();
        stud.display();
        teac.display();
    }
    
}
