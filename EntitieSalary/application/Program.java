package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Salary;

public class Program{
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);

        Salary x;

        x = new Salary();

        System.out.println("Enter employee data:");
        x.name = scan.nextLine();
        x.grossSalary = scan.nextDouble();
        x.tax = scan.nextDouble();
    
        System.out.println("Name = " + x.name);
        System.out.println("Gross Salary = " + x.grossSalary);
        System.out.println("Tax = " + x.tax);

        double employeeData = x.netSalary();
        System.out.println("Employee: "+x.name+", $"+employeeData);

        x.increaseSalary();

        scan.close();
    }

}