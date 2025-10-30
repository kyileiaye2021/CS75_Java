// Kyi Lei Aye
package Lab10;
import java.util.Scanner;

public class exceptionKLA {

    public static int check(int n){
        if ((n % 2) == 0){
            throw new IllegalArgumentException("Even number is entered.");
        }
        return n;
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        try{
            System.out.print("Enter an odd number: ");
            int n = s.nextInt();
            check(n);
            System.out.println("Yes, you entered a odd number.");
        }
        catch(IllegalArgumentException e){
            System.out.println("Error: " + e.getMessage());
        }
        finally{
            System.out.println("This is the end of program!");
            s.close();
        }
    }
    
}
