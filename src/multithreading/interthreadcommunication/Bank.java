package multithreading.interthreadcommunication;

import java.util.Scanner;
import java.util.concurrent.atomic.AtomicInteger;

public class Bank {
    AtomicInteger balance = new AtomicInteger(10000);
    volatile int withdrawAmount;
    Scanner sc = new Scanner(System.in);

    public synchronized void withdraw() {
        System.out.println("Account Balance: " + this.balance.get());
        System.out.println("Enter the amount you want to withdraw: ");
        withdrawAmount = sc.nextInt();
        if (withdrawAmount >= this.balance.get()) {
            try {
                System.out.println("Low balance. Deposit " + (withdrawAmount - this.balance.get()) + "/- or more to withdraw: ");
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        this.balance.set(this.balance.get() - withdrawAmount);
        System.out.println("Balance after withdrawal: " + this.balance.get());
        System.exit(0);
    }

    public synchronized void deposit() {
        boolean flag = true;
        while (flag) {
            int depositAmount = sc.nextInt();
            if (depositAmount <= withdrawAmount - this.balance.get()) {
                System.out.println("Not enough funds to facilitate a withdrawal try again");
            } else {
                this.balance.set(this.balance.get() + depositAmount);
                System.out.println("Account Balance: " + this.balance.get());
                flag = false;
            }
        }
        notify();
    }
}
