package multithreading.threadjoin;

public class Client {
    public static void main(String[] args) {
        MyJoinThread myJoinThread = new MyJoinThread();
        myJoinThread.start();

        try {
            myJoinThread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        MyJoinRunnable myJoinRunnable = new MyJoinRunnable();
        Thread thread = new Thread(myJoinRunnable);
        thread.start();

        try {
            thread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        for (int i = 0; i < 5; i++) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName());
        }
    }
}
