package collection;

import java.util.Vector;

public class MyVector {
    public static void main(String[] args) {
        Vector<Object> v = new Vector<Object>();
        v.add(10);
        v.add('q');
        v.add(87.0);
        v.add("Hem");
        System.out.println(v.add(2));
        v.addElement("Hem");

        for(Object o: v){
            System.out.println(o);
        }
    }
}
/*
- Heterogeneous
- Insertion order
- Null elements
- Duplicate elements
- Synchronized
 */