package Assgn.second;

import java.util.Scanner;


class Employee {
    private int emp_id;
    private String emp_name;
    private double basic_salary;
    private double gross_salary;

    public void acceptDetails() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Employee ID: ");
        emp_id = scanner.nextInt();
        System.out.print("Enter Employee Name: ");
        emp_name = scanner.next();
        System.out.print("Enter Basic Salary: ");
        basic_salary = scanner.nextDouble();
    }

    public void calculateGrossSalary() {
        double hra = 0.20 * basic_salary; // House Rent Allowance: 20% of basic salary
        double da = 0.10 * basic_salary; // Dearness Allowance: 10% of basic salary
        gross_salary = basic_salary + hra + da;
    }

    public void displayDetails() {
        System.out.println("Employee ID: " + emp_id);
        System.out.println("Employee Name: " + emp_name);
        System.out.println("Basic Salary: " + basic_salary);
        System.out.println("Gross Salary: " + gross_salary);
    }
}

public class asgn14 {
    public static void main(String[] args) {
        Employee employee = new Employee();
        employee.acceptDetails();
        employee.calculateGrossSalary();
        employee.displayDetails();
    }
}

