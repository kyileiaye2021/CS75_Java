// Kyi Lei Aye
package Lab14;
import java.util.Scanner;

abstract class Shape{
    abstract double area();
    abstract double perimeter();
}

class Circle extends Shape{
    double radius;
    double PI = 3.14;

    Circle(double x){
        this.radius = x;
    }
    @Override
    double area(){
        return (PI * radius * radius);
    }
    double perimeter(){
        return (2 * PI * radius);
    }
}

class Square extends Shape{
    double x = 0.0;
    Square(double x){
        this.x = x;
    }
    double area(){
        return x * x;
    }
    double perimeter(){
        return 4 * x;
    }
}
public class Lab14KLA {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Shape Areas and Perimeters");
        System.out.println("============================");
        
        System.out.print("Enter radius for circle: ");
        Double x = scan.nextDouble();
        Shape c = new Circle(x);
        double circle_a = c.area();
        double circle_p = c.perimeter();
        System.out.printf("Circle Area: %.2f, Perimeter: %.2f%n", circle_a, circle_p);

        System.out.println("----------------------------");
        
        System.out.print("Enter length for square: ");
        Double y = scan.nextDouble();
        Shape s = new Square(y);
        double square_a = s.area();
        double square_p = s.perimeter();
        System.out.printf("Square Area: %.2f, Perimeter: %.2f%n", square_a, square_p);
         System.out.println();
    }
}
