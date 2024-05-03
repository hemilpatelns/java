package polymorphism;

class Bank{
    public void loan(){
        System.out.println("8.5% interest rate");
    }
}

class SBI extends Bank{
    @Override
    public void loan(){
        System.out.println("SBI provides 8.9% interest rate");
    }

}

class HDFC extends Bank{
    @Override
    public void loan(){
        System.out.println("HDFC provides 7.8% interest rate");
    }
}

public class RunTime {
    public static void main(String[] args) {
        Bank b;
        b = new SBI();
        b.loan();
        b = new HDFC();
        b.loan();
        b = new Bank();
        b.loan();
    }
}