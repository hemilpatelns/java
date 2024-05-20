package multithreading.classlevellock;

public class MethodClassLevel implements Runnable {
    @Override
    public void run() {
        MethodClassLevel.lockClassLevel();
    }

    public static synchronized void lockClassLevel() {
        for (int i = 0; i < 5; i++) {
            System.out.println(Thread.currentThread().getName());
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public static void main(String[] args) {
        MethodClassLevel mOne = new MethodClassLevel();
        MethodClassLevel mTwo = new MethodClassLevel();
        Thread threadOne = new Thread(mOne);
        Thread threadTwo = new Thread(mOne);
        Thread threadThree = new Thread(mTwo);
        Thread threadFour = new Thread(mTwo);
        threadOne.start();
        threadTwo.start();
        threadThree.start();
        threadFour.start();
    }
}
