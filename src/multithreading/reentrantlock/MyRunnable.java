package multithreading.reentrantlock;

public class MyRunnable implements Runnable {
    MyReentrantLock myReentrantLock;
    Thread thread;

    public MyRunnable(MyReentrantLock myReentrantLock) {
        this.myReentrantLock = myReentrantLock;
        this.thread = new Thread(this);
        this.thread.start();
    }

    @Override
    public void run() {
        this.myReentrantLock.syncUsingReentrantClass();
    }
}
