package accessmodifiers.packagetwo;
import accessmodifiers.packageone.*;

// Different package non subclass
public class Relatives {
    public static void main(String[] args) {
        Parent p = new Parent();
        System.out.println(p.income);
//        System.out.println(p.income1);  protected data members can be accessed in same class, same package subclass,
//                                        same package non-subclass and different package subclass

//        System.out.println(p.income2);  private data members can only be accessed in the same class

//        System.out.println(p.income3);  default data members can be accessed in same class, same package subclass and
//                                        same package non-subclass only
    }
}
