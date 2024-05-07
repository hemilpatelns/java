package multithreading.reentrantlock;

public class MyThread extends Thread{
    MyReentrantLock myReentrantLock;

    public MyThread(MyReentrantLock myReentrantLock) {
        this.myReentrantLock = myReentrantLock;
    }

    @Override
    public void run() {
        this.myReentrantLock.syncUsingReentrantClass();
    }
}
