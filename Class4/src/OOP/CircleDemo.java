/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OOP;

import java.util.Scanner;

/**
 *
 * @author shakil10vr
 */
public class CircleDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        double radius;
        System.out.println("Enter radius :");
        radius=input.nextDouble();
        
        CircleClass obj = new CircleClass();
        obj.setRadius(radius);
        
        System.out.println("Area of Circle: "+obj.getArea());
        System.out.println("Diameter of Circle: "+obj.getDiameter());
        System.out.println("Circumference of Circle: "+obj.getCircumference());
        System.out.println("Radius of Circle: "+obj.getRadius());
    }
    
}
