package multithreading.interthreadcommunication.evenodd;

public class MyThread extends Thread {

    EvenOdd evenOdd;

    public MyThread(EvenOdd evenOdd) {
        this.evenOdd = evenOdd;
    }

    @Override
    public void run() {
        this.evenOdd.odd();
    }
}
