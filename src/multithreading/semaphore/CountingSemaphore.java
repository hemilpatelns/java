package multithreading.semaphore;

import java.util.concurrent.Semaphore;

public class CountingSemaphore {
    Semaphore count = new Semaphore(3);

    public static void main(String[] args) {
        CountingSemaphore cs = new CountingSemaphore();
        new Thread() {
            @Override
            public void run() {
                cs.mutualExclusion();
            }
        }.start();

        new Thread() {
            @Override
            public void run() {
                cs.mutualExclusion();
            }
        }.start();
    }

    private void mutualExclusion() {
        try {
            count.acquire(3);
            System.out.println(Thread.currentThread().getName() + " inside mutual exclusion");
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        } finally {
            count.release();
            System.out.println(Thread.currentThread().getName() + " outside mutual exclusion");
            System.out.println("Threads waiting in queue: " + count.getQueueLength());
        }
    }
}
