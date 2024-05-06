package collection;

import java.util.ArrayList;
import java.util.ListIterator;

public class MyArrayList {
    public static void main(String[] args) {
        ArrayList<Object> al = new ArrayList<Object>();
        al.add("Hem");
        al.add(1);
        al.add(2.3);
        al.add(null);
        al.add(1);

        for (Object o : al) {
            System.out.println(o);
        }
    }
}

/*
- Heterogeneous
- Insertion order
- Null elements
- Duplicate elements
 */