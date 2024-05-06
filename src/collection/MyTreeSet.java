package collection;

import java.util.TreeSet;

public class MyTreeSet {
    public static void main(String[] args) {
        TreeSet<Object> ts = new TreeSet<Object>();
        ts.add(1);
//      ts.add(2.5);  Exception: tree set only allows homogenous object
//      ts.add(1);  Output will only show the integer 1 only once
//      ts.add(null);  Exception: null elements not allowed
        ts.add(10);
        ts.add(5);
        for(Object o : ts){
            System.out.println(o);
        }
    }
}

/*
- Natural ordering
 */
