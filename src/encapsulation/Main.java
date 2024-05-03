package encapsulation;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Employee employee = new Employee();
        System.out.print("Enter Employee Id: ");
        employee.setEmployeeId(sc.nextInt());
        sc.nextLine();
        System.out.print("Enter Employee Name: ");
        employee.setEmployeeName(sc.nextLine());
        System.out.print("Enter Employee Department: ");
        employee.setEmployeeDepartment(sc.nextLine());
        System.out.print("Enter Employee Salary: ");
        employee.setEmployeeSalary(sc.nextDouble());

        System.out.println("Employee Id: " + employee.getEmployeeId() + "\n" +
                "Employee Name: " + employee.getEmployeeName() + "\n" +
                "Employee Department: " + employee.getEmployeeDepartment() + "\n" +
                "Employee Salary: " + employee.getEmployeeSalary());
    }
}
