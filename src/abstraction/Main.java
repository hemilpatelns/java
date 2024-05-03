package abstraction;

import java.util.Scanner;

abstract class Car {
    double highwaySpeed;
    double citySpeed;
    double distance;

    public double averageSpeed() {
        return (highwaySpeed + citySpeed) / 2;
    }

    abstract double mileage();
}

class Ferrari extends Car {

    @Override
    public double mileage() {
        return 20.55;
    }

}

class Ford extends Car {
    @Override
    public double mileage() {
        return 25.65;
    }
}

public class Main {
    public static void main(String[] args) {
        Ferrari ferrari = new Ferrari();
        Ford ford = new Ford();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.print("1. Ferrari\n2. Ford\n3. Exit\n");
            System.out.print("Select your car: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Ferrari's highway speed: ");
                    ferrari.highwaySpeed = sc.nextDouble();
                    System.out.print("Ferrari's city speed: ");
                    ferrari.citySpeed = sc.nextDouble();
                    System.out.println("Enter the distance travelled: ");
                    ferrari.distance = sc.nextDouble();
                    System.out.println("Average speed of Ferrari is: " + ferrari.averageSpeed());
                    System.out.println("Your car used " + String.format("%.2f",(ferrari.distance / ferrari.mileage())) + " litres of fuel to travel " + ferrari.distance + "kms");
                    break;

                case 2:
                    System.out.print("Ford's highway speed: ");
                    ford.highwaySpeed = sc.nextDouble();
                    System.out.print("Ford's city speed: ");
                    ford.citySpeed = sc.nextDouble();
                    System.out.println("Enter the distance travelled: ");
                    ford.distance = sc.nextDouble();
                    System.out.println("Average speed of Ford is: " + ford.averageSpeed());
                    System.out.println("Your car used " + String.format("%.2f",(ford.distance / ford.mileage())) + " litres of fuel to travel " + ford.distance + "kms");
                    break;

                case 3:
                    System.out.println("Thank you for using our portal!");
                    sc.close();
                    System.exit(0);
            }
        }
    }
}
