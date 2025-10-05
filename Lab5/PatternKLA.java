// Kyi Lei Aye
package Lab5;

import java.util.Scanner;

public class PatternKLA {
    
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Enter number of rows: ");
        int ans = s.nextInt();

        System.out.printf("%-20s %s%n", "Pattern A", "Pattern B");
        System.out.println("_________________________________");
        for(int i = 1; i <= ans; i++){
            String ch_a = "*".repeat(i);
            String ch_b = "*".repeat(ans + 1 - i);
            System.out.printf("%-20s %-20s%n", ch_a, ch_b);
        }
    }
    
}

