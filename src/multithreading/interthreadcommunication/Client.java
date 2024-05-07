package multithreading.interthreadcommunication;

public class Client {
    public static void main(String[] args) {
        Bank bank = new Bank();
        WifeThread wifeThread = new WifeThread(bank);
        wifeThread.start();

        HusbandThread husbandThread = new HusbandThread(bank);
    }
}
