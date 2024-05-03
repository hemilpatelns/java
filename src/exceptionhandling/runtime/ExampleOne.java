package exceptionhandling.runtime;

import java.util.Scanner;

public class ExampleOne {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers: ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        try{
            int result = num1/num2;
        }catch(Exception e){
            e.printStackTrace();
            System.out.println("After exception");
        }
        sc.close();
    }
}

