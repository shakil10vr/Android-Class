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
public class CircleClass {
    double PI=3.14;
    double radius;
    public void setRadius(double r){
        radius=r;
    }
    public double getRadius(){
        return radius;
    }
    public double getDiameter(){
        return radius*2;
    }
    public double getCircumference(){
        return 2*PI*radius;
    }
    public double getArea(){
        return PI*radius*radius;
    }
    
}
