package multithreading.interthreadcommunication;

public class HusbandThread implements Runnable {

    Bank bank;
    Thread thread;

    public HusbandThread(Bank bank) {
        this.bank = bank;
        this.thread = new Thread(this);
        this.thread.start();
    }

    @Override
    public void run() {
        this.bank.deposit();
    }
}
