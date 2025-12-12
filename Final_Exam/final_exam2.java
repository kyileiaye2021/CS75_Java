package Final_Exam;

import java.util.Scanner;

class Account{
    double balance = 2000;
    void deposit(double x){
        balance += x;
        System.out.println("Your balance amount is now "  + balance);
    }
    void withdraw(double x){
        if(x > balance){
            System.out.println("Insufficient Balance");
        }
        else{
            balance -= x;
        }
    }
    double check_balance(){
        return balance;
    }

}
public class final_exam2 {

    public static void main(String[] args) {
        Scanner s  = new Scanner(System.in);
        System.out.print("""
                Welcome To ATM\n
                Select option 1 to Withdraw\n
                Select option 2 to Deposit\n
                Select option 3 to Check Balance\n
                Select option 4 to Exit\n
                Select the operation you want to perform:""");

        int option = s.nextInt();
        Account acc = new Account();
        if(option == 1){
            System.out.print("Enter money to be withdrawn: ");
            double withdraw_amount = s.nextDouble();
            acc.withdraw(withdraw_amount);
        }
        else if(option == 2){
            System.out.println("Enter money to deposit: ");
            double deposit_amount = s.nextDouble();
            acc.deposit(deposit_amount);
        }
        else if(option == 3){
            System.out.println("Your current balance is " + acc.check_balance());
        }
        else{
            s.close();
            System.exit(0);
        }
    }
    
}
