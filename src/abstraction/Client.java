package abstraction;

interface A{
    void display();
    void show();
    void bottle();
    static void stream(){

    }

    private void data(){

    }

    default void unchangeable(){

    }
}


public abstract class Client{

    public Client(int n) {

    }

    //    Main method will run because it is a static method
    public static void main(String[] args) {

        Client c = new Client(2){

        };
//        Client c = new Client() {
//            @Override
//            public void display() {
//
//            }
//
//            @Override
//            public void show() {
//
//            }
//
//            @Override
//            public void bottle() {
//
//            }
//        };
        System.out.println("Hello");
    }
}
