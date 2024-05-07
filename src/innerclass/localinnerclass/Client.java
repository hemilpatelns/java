package innerclass.localinnerclass;

class Bank{

}
public class Client {
    public void display() {

        System.out.println("I am Outer display");

        class LocalInner extends Bank implements Runnable {
            static int a = 10;

            public void localDisplay() {
                System.out.println("I am Local display");
            }

            public void run() {

            }
        }
        LocalInner inner = new LocalInner();
        inner.localDisplay();
        System.out.println(LocalInner.a);
    }

    public static void main(String[] args) {
        Client c = new Client();
        c.display();
    }
}
