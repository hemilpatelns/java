package multithreading.interthreadcommunication.evenodd;

public class RunIt {
    public static void main(String[] args) {
        EvenOdd evenOdd = new EvenOdd(1, 20);

//		MyThread myThread = new MyThread(evenOdd);
//		myThread.start();

        new MyThread(evenOdd).start();
        new MyRunnable(evenOdd).start();

    }
}
