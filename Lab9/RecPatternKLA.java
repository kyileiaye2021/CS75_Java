// Kyi Lei Aye
package Lab9;
import java.util.Scanner;

public class RecPatternKLA {

    // recursive helper function
    public static void pattern(int num){
        // base case
        if(num == 0){
            return;
        }
        pattern(num - 1);
        System.out.println("*".repeat(num));
    }

    public static void reverse_pattern(int num){
        //base case
        if(num == 0){
            return;
        }
        System.out.println("*".repeat(num));
        reverse_pattern(num - 1);
    }
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        int ans = 0;

        do{
            System.out.print("Enter number of rows: ");
            ans = s.nextInt();
        }while(ans <= 0);

        System.out.println("Pattern A");
        System.out.println("----------");
        pattern(ans);
        
        System.out.println();

        System.out.println("Pattern B");
        System.out.println("----------");
        reverse_pattern(ans);
    }
    
}
