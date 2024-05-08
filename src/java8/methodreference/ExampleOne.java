package java8.methodreference;

interface  Bank{
    public void loan();
}

class Axis{
    public static void display(){
        System.out.println("I am display");
    }

    public void nonStatic(){
        System.out.println("I am non static");
    }

    public Axis(){
        System.out.println("I am constructor");
    }
}
public class ExampleOne {
    public static void main(String[] args) {
        Bank a = Axis::display;
        a.loan();

        Axis aa = new Axis();
        Bank b = aa::nonStatic;
        b.loan();

        Bank bb = Axis::new;
        bb.loan();
    }
}
