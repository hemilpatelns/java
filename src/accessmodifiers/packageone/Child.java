package accessmodifiers.packageone;

// Same package subclass
public class Child extends Parent {
    public static void main(String[] args) {
        Child c = new Child();
        System.out.println(c.income);
        System.out.println(c.income1);
//        System.out.println(c.income2); private data members can only be accessed in the same class
        System.out.println(c.income3);
    }
}

// Same package non-subclass
class Cousin{
    Parent p = new Parent();
    int num = p.income;
    int num1 = p.income1;
//    int num2 = p.income2;  private data members can only be accessed in the same class
    int num3 = p.income3;
}
