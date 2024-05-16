package inheritance;

class Imp{
    public Imp() {
        System.out.println("Hello");
    }
}

public class Sample extends Imp{
    public static void main(String[] args) {
        Sample s = new Sample();
    }
}
