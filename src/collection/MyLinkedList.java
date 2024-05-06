package collection;

import java.util.Iterator;
import java.util.LinkedList;

public class MyLinkedList {
    public static void main(String[] args) {
        LinkedList<Object> ll = new LinkedList<Object>();
        ll.add(1);
        ll.add("Hem");
        ll.add(null);
        ll.add(null);

        Iterator<Object> it = ll.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
    }
}

/*
- Heterogeneous
- Insertion order
- Null elements
- Duplicate elements
 */