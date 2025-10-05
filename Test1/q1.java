package Test1;
import java.util.Scanner;

public class q1 {
    public static void operate(int num1, int num2, int num3){
        if((num1 == num2) && (num2 == num3)){
            System.out.println("All numbers are equal.");
        }
        else if ((num1 != num2) && (num1 != num3) && (num2 != num3)){
            System.out.println("All numbers are different.");
        }
        else{
            System.out.println("Neither all are equal or different.");
        }

    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int num1 = 0;
        int num2 = 0;
        int num3 = 0;

        do{
            System.out.print("Input first number: ");
            num1 = s.nextInt();
        }while(num1 < 0);

        do{
            System.out.print("Input second number: ");
            num2 = s.nextInt();
        }while(num2 < 0);

        do{
            System.out.print("Input third number: ");
            num3 = s.nextInt();
        }while(num3 < 0);

        operate(num1, num2, num3);
    }
}
