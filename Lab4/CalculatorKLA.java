//Kyi Lei Aye
package Lab4;
import java.util.Scanner;
public class CalculatorKLA {

    public static double operate_res(double first, double second, char operator ){
        double res = 0;
        switch (operator) {
            case '+':
                res = first + second;
                break;
            
            case '-':
                res = first - second;
                break;

            case '*':
                res = first * second;
                break;

            case '/':
                if (second != 0){
                    res = first / second;
                }
                else{
                    System.out.println("Divison by zero situation.");
                }
                break;

            default:
                break;
        }
        return res;
    }

    public static void generate_input(){
        
        Scanner s = new Scanner(System.in);

        System.out.print("Enter your first number: ");
        double first = s.nextDouble();

        System.out.print("Enter your second number: ");
        double second = s.nextDouble();

        System.out.print("Enter your operator: ");
        char operator = s.next().charAt(0);

        double res = operate_res(first, second, operator);
        System.out.printf("Your result is %.2f", res);

    }
    public static void main(String[] args) {
        
        generate_input();
    }
    
}
