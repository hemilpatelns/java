package multithreading.interthreadcommunication;

public class WifeThread extends Thread {

    Bank bank;

    public WifeThread(Bank bank) {
        this.bank = bank;
    }

    @Override
    public void run() {
        this.bank.withdraw();
    }
}
