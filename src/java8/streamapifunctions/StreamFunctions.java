package java8.streamapifunctions;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class StreamFunctions {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(5, 9, 3, 2, 23, 3, 43, 10);
        list.stream()
                .filter(x -> x % 2 == 1)
                .distinct()
                .sorted(Comparator.comparingInt(x -> x))
                .map(x -> "Sam")
                .forEach(System.out::println);
    }
}
