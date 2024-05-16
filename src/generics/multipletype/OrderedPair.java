package generics.multipletype;

interface Pair<K, V> {
    K getKey();

    V getValue();
}

public class OrderedPair<K, V> implements Pair<K, V> {

    private K key;
    private V value;

    public OrderedPair(K key, V value) {
        this.key = key;
        this.value = value;
    }

    @Override
    public K getKey() {
        return this.key;
    }

    @Override
    public V getValue() {
        return this.value;
    }

    public static void main(String[] args) {
        Pair<Integer, String> p1 = new OrderedPair<>(1, "apple");
        Pair<Integer, String> p2 = new OrderedPair<>(2, "orange");
        System.out.println(p1.getKey() + " " + p1.getValue());
        System.out.println(p2.getKey() + " " + p2.getValue());
    }

}
