package multithreading.objectlevellock;

public class BlockObjectLevel implements Runnable{
    @Override
    public void run() {
        this.containsSyncBlock();
    }

    public void containsSyncBlock(){
        synchronized (this){
            for(int i = 0;i<5;i++){
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
        BlockObjectLevel oOne = new BlockObjectLevel();
        BlockObjectLevel oTwo = new BlockObjectLevel();
        Thread threadOne = new Thread(oOne);
        Thread threadTwo = new Thread(oOne);
        Thread threadThree = new Thread(oTwo);
        Thread threadFour = new Thread(oTwo);
        threadOne.start();
        threadTwo.start();
        threadThree.start();
        threadFour.start();
    }
}
