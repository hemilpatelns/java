package innerclass.anonymousinnerclass;

abstract class Bank {
    public abstract void loan();
}

public class Client {
    Bank b = new Bank() {
        public void loan() {
            System.out.println("Loan");
        }
    };
    public static void main(String[] args) {
        Client c = new Client();
        c.b.loan();
    }
}
