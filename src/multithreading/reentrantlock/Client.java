package multithreading.reentrantlock;

public class Client {


    public static void main(String[] args) {
        MyReentrantLock myReentrantLock = new MyReentrantLock();
        MyThread myThread = new MyThread(myReentrantLock);
        myThread.start();

        MyRunnable myRunnable = new MyRunnable(myReentrantLock);
    }
}
