package string;

import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input String: ");
        String s1 = sc.nextLine();
        StringBuilder sb = new StringBuilder();
        sb.append(s1);
        sb.reverse();
        System.out.println("Reversed String is: " + sb);
        sc.close();
    }
}
