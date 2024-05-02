package inheritance;

import java.util.Scanner;

public class Axis extends Bank {
    public static void main(String[] args) {
        Axis axis = new Axis();
        Scanner sc = new Scanner(System.in);
        System.out.println("Your balance is: " + axis.balance);

        while (true) {
            System.out.println("\n1. Deposit\n2. Withdraw\n3. Exit");
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.print("Enter the deposit amount: ");
                    axis.amount = sc.nextInt();
                    axis.deposit();
                    System.out.print("Balance after deposit: " + axis.balance);
                    break;

                case 2:
                    System.out.print("Enter the withdrawal amount: ");
                    axis.amount = sc.nextInt();
                    if (axis.amount > axis.balance) {
                        System.out.println("Insufficient balance");
                        break;
                    } else {
                        axis.withdraw();
                        System.out.print("Balance after withdrawal: " + axis.balance);
                    }
                    break;

                case 3:
                    System.out.println("Thank You for banking with Axis!");
                    sc.close();
                    System.exit(0);
            }
        }
    }
}
