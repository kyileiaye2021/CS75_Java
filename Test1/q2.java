// // Write a  Java program that asks the student user to enter the monthly costs for the following expenses incurred from : Phone Bill, Car insurance, Car Gas, Food and Entertainment.

// //  The program should then display the total monthly cost of these expenses, and the total annual cost of these expenses.

// // Note:

// // [ Write  separate methods   to calculate and  to display  these values to demonstrate your knowledge of method writing.]

// // Proper Input validation : Do not accept negative values .
package Test1;
// import java.util.Scanner;
// public class q2 {
//     public static double calculate(double phone_bill, double car_insurance, double car_gas, double food, double entertainment, int num_of_months){

//         // get the yearly cost for each bill
//         double yearly_phone_bill = phone_bill * num_of_months;
//         double yearly_car_insurance = car_insurance * num_of_months;
//         double yearly_car_gas = car_gas * num_of_months;
//         double yearly_food = food * num_of_months;
//         double yearly_entertainment = entertainment * num_of_months;
//         return (yearly_phone_bill + yearly_car_insurance + yearly_car_gas + yearly_food + yearly_entertainment);
//     }

//     public static void display(double total_monthly_cost, double total_yearly_cost){
//         System.out.printf("Total Monthy Cost : %.2f\n", total_monthly_cost);
//         System.out.printf("Total Annual Cost : %.2f\n", total_yearly_cost);
//     }

//     public static void main(String[] args) {
//         Scanner s = new Scanner(System.in);

//         // ask the costs for that month
//         double phone_bill = 0;
//         do{
//             System.out.print("Phone bill: ");
//             phone_bill = s.nextDouble();
//         }while(phone_bill < 0);

//         double car_insurance = 0;
//         do{
//             System.out.print("Car insurance: ");
//             car_insurance = s.nextDouble();
//         }while(car_insurance < 0);

//         double car_gas = 0;
//         do{
//             System.out.print("Car gas: ");
//             car_gas = s.nextDouble();
//         }while(car_gas< 0);

//         double food = 0;
//         do{
//             System.out.print("Food: ");
//             food = s.nextDouble();
//         }while(food < 0);

//         double entertainment = 0;
//         do{
//             System.out.print("Entertainment: ");
//             entertainment = s.nextDouble();
//         }while(entertainment < 0);

//         double total_monthly_cost = calculate(phone_bill, car_insurance, car_gas, food, entertainment, 1);
//         double total_yearly_cost = calculate(phone_bill, car_insurance, car_gas, food, entertainment, 12);
//         display(total_monthly_cost, total_yearly_cost);

//     }
    
// }








import java.util.Scanner;
public class q2 {
public static double calculate(double phone_bill, double car_insurance, double car_gas, double food, double entertainment, int num_of_months){


// get the yearly cost for each bill
double yearly_phone_bill = phone_bill * num_of_months;
double yearly_car_insurance = car_insurance * num_of_months;
double yearly_car_gas = car_gas * num_of_months;
double yearly_food = food * num_of_months;
double yearly_entertainment = entertainment * num_of_months;
return (yearly_phone_bill + yearly_car_insurance + yearly_car_gas + yearly_food + yearly_entertainment);
}


public static void display(double total_monthly_cost, double total_yearly_cost){
System.out.printf("Total Monthy Cost : %.2f\n", total_monthly_cost);
System.out.printf("Total Annual Cost : %.2f\n", total_yearly_cost);
}


public static void main(String[] args) {
Scanner s = new Scanner(System.in);


// ask the costs for that month
double phone_bill = 0;
do{
System.out.print("Phone bill: ");
phone_bill = s.nextDouble();
}while(phone_bill < 0);


double car_insurance = 0;
do{
System.out.print("Car insurance: ");
car_insurance = s.nextDouble();
}while(car_insurance < 0);


double car_gas = 0;
do{
System.out.print("Car gas: ");
car_gas = s.nextDouble();
}while(car_gas< 0);


double food = 0;
do{
System.out.print("Food: ");
food = s.nextDouble();
}while(food < 0);


double entertainment = 0;
do{
System.out.print("Entertainment: ");
entertainment = s.nextDouble();
}while(entertainment < 0);


double total_monthly_cost = calculate(phone_bill, car_insurance, car_gas, food, entertainment, 1);
double total_yearly_cost = calculate(phone_bill, car_insurance, car_gas, food, entertainment, 12);
display(total_monthly_cost, total_yearly_cost);


}
}

