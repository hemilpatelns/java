package multithreading.interthreadcommunication.evenodd;

public class MyRunnable extends Thread {

    EvenOdd evenOdd;
    Thread thread;

    public MyRunnable(EvenOdd evenOdd) {
        this.evenOdd = evenOdd;
    }

    @Override
    public void run() {
        this.evenOdd.even();
    }

}
