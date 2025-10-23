// Kyi Lei Aye
package Lab8;

import java.util.ArrayList;
import java.util.Scanner;

public class StepsKLA {

    public static int max_step(int[][] steps){
        int max_steps = steps[0][0];
        for(int i = 0; i < steps.length; i++){
            for(int j = 0; j < steps[0].length; j++){
                if(steps[i][j] > max_steps){
                    max_steps = steps[i][j];
                }
            }
        }
        return max_steps;
    }

    public static int min_step(int[][] steps){
        int min_steps = steps[0][0];
        for(int i = 0; i < steps.length; i++){
            for(int j = 0; j < steps[0].length; j++){
                if(steps[i][j] < min_steps){
                    min_steps = steps[i][j];
                }
            }
        }
        return min_steps;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        // 2d array to get the input from the user
        int[][] steps = new int[2][7];
        int total_steps = 0;
        ArrayList<Integer> weekly_steps = new ArrayList<>();

        for(int i = 0; i < steps.length; i++){
            System.out.printf("Week %d:\n", i + 1);
            int curr_week_steps = 0;

            for(int j = 0; j < steps[0].length; j++){
                System.out.printf("Enter steps for Day %d: ", j + 1);
                steps[i][j] = s.nextInt();
                total_steps += steps[i][j];
                curr_week_steps += steps[i][j];
            }
            weekly_steps.add(curr_week_steps);
            
        }
        System.out.printf("Total steps for Two weeks: %d\n", total_steps);

        int max_steps = max_step(steps);
        int min_steps = min_step(steps);

        System.out.printf("Minimum steps in Two weeks: %d\n", min_steps);
        System.out.printf("Maximum steps in Two weeks: %d\n", max_steps);

        System.out.println("Average steps in each week:");

        for(int i = 0; i < weekly_steps.size(); i++){
            System.out.printf("Week %d: %d\n", (i + 1), (weekly_steps.get(i) / 7));
        }
    }
    
}
