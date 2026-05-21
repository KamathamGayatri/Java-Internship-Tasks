import java.util.*;
public class ATMSimulation {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int balance = 1000;
        System.out.println("Simple ATM Simulation");
        System.out.println("1. Check Balance");
        System.out.println("2. Deposit");
        System.out.println("3. Withdraw");
        System.out.print("Enter your choice: ");
        int choice = sc.nextInt();
        if(choice == 1) {
            System.out.println("Balance = " + balance);
        }
        else if(choice == 2) {
            System.out.print("Enter deposit amount: ");
            int deposit = sc.nextInt();
            balance = balance + deposit;
            System.out.println("New Balance = " + balance);
        }
        else if(choice == 3) {
            System.out.print("Enter withdraw amount: ");
            int withdraw = sc.nextInt();
            if(withdraw <= balance) {
                balance = balance - withdraw;
                System.out.println("Remaining Balance = " + balance);
            }
            else {
                System.out.println("Insufficient Balnace");
            }
        }
        else {
            System.out.println("Invalid Choice");

        }
        sc.close();
    
    }
}
    

