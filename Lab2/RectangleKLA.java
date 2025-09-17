package Lab2;
// Kyi Lei Aye

import java.util.Scanner;

public class RectangleKLA {
    public static void main(String[] args){
        System.out.println("Find the Area and Perimeter of a Rectangle \n");
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the length of the rectangle : ");
        int len = scan.nextInt();

        System.out.print("Enter the width of the rectangle : ");
        int width = scan.nextInt();

        int area = len * width;
        System.out.printf("Area of the rectangle is: %d\n", area);

        int perimeter = (2 * len) + (2 * width);
        System.out.printf("Perimeter of the rectangle is: %d\n", perimeter);



    }
}
