//Kyi Lei Aye
package Lab7;

import java.util.Scanner;

public class RainfallKLA {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        double[] rainfall_arr = new double[6];
        double total_rainfall = 0.0;

        for(int i = 0; i < rainfall_arr.length; i++){
            System.out.printf("Enter the rainfall (in inches) for month %d: ", i + 1);
            rainfall_arr[i] = s.nextDouble();
            total_rainfall += rainfall_arr[i];
        }
        System.out.printf("The total rainfall for half year is %.2f inches.\n", total_rainfall);
        System.out.printf("The average rainfall half year is %.2f inches.\n", (total_rainfall / rainfall_arr.length));
    }
}
