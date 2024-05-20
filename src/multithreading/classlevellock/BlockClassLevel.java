package multithreading.classlevellock;

public class BlockClassLevel implements Runnable {
    @Override
    public void run() {
        BlockClassLevel.containsSyncBlock();
    }

    public static void containsSyncBlock() {
        synchronized (BlockClassLevel.class) {
            for (int i = 0; i < 5; i++) {
                System.out.println(Thread.currentThread().getName());
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }

    public static void main(String[] args) {
        BlockClassLevel bOne = new BlockClassLevel();
        BlockClassLevel bTwo = new BlockClassLevel();
        Thread threadOne = new Thread(bOne);
        Thread threadTwo = new Thread(bOne);
        Thread threadThree = new Thread(bTwo);
        Thread threadFour = new Thread(bTwo);
        threadOne.start();
        threadTwo.start();
        threadThree.start();
        threadFour.start();
    }
}
