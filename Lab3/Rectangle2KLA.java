//Kyi Lei Aye
package Lab3;

import java.util.Scanner;

public class Rectangle2KLA {
    public static double getLength(){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the length of the rectangle : ");
        double len = scan.nextDouble();
        return len;

    }
    public static double getWidth(){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the width of the rectangle : ");
        double width = scan.nextDouble();
        return width;
    }

    public static double getArea(double len, double width){
        return len * width;
    }

    public static void displayArea(double len, double width, double area){
        System.out.printf("Area of the rectangle is : %.2f. \n", area);
    }

    public static void main(String[] args){
        double len = getLength();
        double width = getWidth();
        double area =  getArea(len, width);
        displayArea(len, width, area);
    }
    
}

