package generics.basic;

public class MyGeneric <T>{
    T obj;

    public MyGeneric(T obj) {
        this.obj = obj;
    }

    public Object getObject(){
        return this.obj;
    }

    public static void main(String[] args) {
        MyGeneric<String> sGeneric = new MyGeneric<>("String Type");
        System.out.println(sGeneric.getObject());

        MyGeneric<Integer> iGeneric = new MyGeneric<>(100000);
        System.out.println(iGeneric.getObject());
    }
}