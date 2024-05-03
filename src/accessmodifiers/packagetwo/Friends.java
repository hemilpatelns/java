package accessmodifiers.packagetwo;
import accessmodifiers.packageone.*;

// Different subclass
public class Friends extends Parent{
    public static void main(String[] args) {
        Friends f = new Friends();
        System.out.println(f.income);
        System.out.println(f.income1);
//        System.out.println(f.income2);  private data members can only be accessed in the same class

//        System.out.println(f.income3);  default data members can be accessed in same class, same package subclass and
//                                        same package non-subclass only
    }
}
