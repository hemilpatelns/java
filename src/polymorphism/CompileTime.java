package polymorphism;

import java.util.Scanner;

class Calculation {
    public int average(int a, int b) {
        return (a + b) / 2;
    }

    public String average(){
        return "hello";
    }

    public double average(double a, double b, double c) {
        return (a + b + c) / 3;
    }
}

public class CompileTime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Calculation calculation = new Calculation();
        System.out.println(calculation.average(2, 5));
        System.out.println(calculation.average(3, 5, 2));
        System.out.println(calculation.average());
    }
}
