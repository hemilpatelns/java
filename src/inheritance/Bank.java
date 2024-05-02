package inheritance;

public class Bank {
    int balance = 10000;
    int amount;

    public void withdraw() {
        this.balance = this.balance - this.amount;
    }

    public void deposit() {
        this.balance = this.balance + this.amount;
    }
}
