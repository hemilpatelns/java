package multithreading.threadgroup;

class MyThreadGroupThread extends Thread{
    public MyThreadGroupThread(ThreadGroup tg1, String name){
        super(tg1, name);
    }

    public void run() {
        for (int i = 0; i < 5; i++) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(">>> " + Thread.currentThread().getName());
        }
        super.run();
    }
}

class MyThreadGroupRunnable implements Runnable{

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println(Thread.currentThread().getName());
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class Client {
    public static void main(String[] args) {

        ThreadGroup tg1 = new ThreadGroup("Parent");

        ThreadGroup tg2 = new ThreadGroup(tg1, "Child");

        MyThreadGroupThread m = new MyThreadGroupThread(tg1, "Sam");
        m.start();

        MyThreadGroupRunnable mr = new MyThreadGroupRunnable();
        Thread t = new Thread(tg2, mr);
        t.start();

        for (int i = 0; i < 5; i++) {
            Thread.currentThread().setName("Pam");
            System.out.println(Thread.currentThread().getName());
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        tg1.list();
        tg2.list();
    }
}
