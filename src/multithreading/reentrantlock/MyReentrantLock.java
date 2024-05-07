package multithreading.reentrantlock;

import java.util.concurrent.locks.ReentrantLock;

public class MyReentrantLock {
    ReentrantLock reentrantLock = new ReentrantLock();
    public void syncUsingReentrantClass(){
        this.reentrantLock.lock();
        for (int i = 0; i < 5; i++){
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName());
        }
        this.reentrantLock.unlock();
    }
}
