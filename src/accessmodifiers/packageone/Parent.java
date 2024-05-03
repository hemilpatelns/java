package accessmodifiers.packageone;

// Same class
public class Parent {
    public int income = 5000000;
    protected int income1 = 4300000;
    private int income2 = 4500000;
    int income3 = 6500000;

    public static void main(String[] args) {
        Parent p = new Parent();
        System.out.println(p.income);
        System.out.println(p.income1);
        System.out.println(p.income2);
        System.out.println(p.income3);
    }
}
