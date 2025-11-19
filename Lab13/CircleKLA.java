package Lab13;

import java.util.Scanner;

public class CircleKLA {
    double radius;
    double pi = 3.14159;

    CircleKLA(){
        radius = 0.0;
    }

    CircleKLA(double radius){
        this.radius = radius;
    }

    public void setRadius(double radius){
        this.radius = radius;
    }
    public double getRadius(){
        return radius;
    }

    public double getArea(){
        return (pi * (radius * radius));
    }

    public double getDiameter(){
        return (radius * 2);
    }

    public double getCircumference(){
        return (2 * pi * radius);
    }
    
}
class Main{

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter a radius: ");
        double r = s.nextDouble();
        
        // creating a circle object
        CircleKLA c = new CircleKLA();

        // setting the radius
        c.setRadius(r); 

        // reporting the circle
        System.out.printf("Area: %.2f",c.getArea());
        System.out.println();
        System.out.printf("Diameter: %.2f", c.getDiameter());
        System.out.println();
        System.out.printf("Circumference: %.2f", c.getCircumference());
        System.out.println();
    }

}