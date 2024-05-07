package exceptionhandling.examplethrows;

public class MyThrowsClient {
    public static void main(String[] args) throws InterruptedException {
        MyThrowsClient c = new MyThrowsClient();
        c.methodOne();
        throw new InterruptedException();
    }

    void methodOne() throws InterruptedException {
        System.out.println("1");
        this.methodTwo();
    }

    void methodTwo() throws InterruptedException {
        System.out.println("2");
        try {
            this.methodThree();
        } catch (ArithmeticException e) {
            e.printStackTrace();
        }

    }

    void methodThree() throws InterruptedException, ArithmeticException {
        System.out.println("3");
        this.methodFour();
    }

    void methodFour() throws InterruptedException, ArithmeticException {
		Thread.sleep(1000);
        System.out.println("4");
        int a = 3 / 0;
    }
}
