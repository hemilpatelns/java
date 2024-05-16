package multithreading.interthreadcommunication.evenodd;

public class EvenOdd {

    int start;
    int max;

    public EvenOdd(int start, int max) {
        super();
        this.start = start;
        this.max = max;
    }

    public synchronized void odd() {
//		for (int i = 1; i <= 20; i++) {
//
//			System.out.println(Thread.currentThread().getName() + " " + (i));
//			i++;
//			notify();
//			try {
//				wait();
//			} catch (InterruptedException e) {
//				e.printStackTrace();
//			}
//		}
        while (this.start < this.max) {
            if (this.start % 2 != 0) {
                System.out.println(Thread.currentThread().getName() + " " + this.start);
                this.start++;
                notify();
            } else {
                try {
                    wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public synchronized void even() {
//		for (int i = 2; i <= 20; i++) {
//			System.out.println(Thread.currentThread().getName() + " " + (i));
//			i++;
//			notify();
//			try {
//				wait();
//			} catch (InterruptedException e) {
//				e.printStackTrace();
//			}
//		}
        while (this.start <= this.max) {
            if (this.start % 2 == 0) {
                System.out.println(Thread.currentThread().getName() + " " + this.start);
                this.start++;
                notify();
            } else {
                try {
                    wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
