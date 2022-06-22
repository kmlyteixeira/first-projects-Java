package entities;

import java.util.Scanner;

public class Salary {
    public String name;
    public double grossSalary;
    public double tax;

    public double netSalary(){
        return grossSalary-tax;
    }

    public void increaseSalary(){
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Which percentage to increase salary?");
        double valueIncrease = sc.nextDouble();

        valueIncrease = valueIncrease/100;

        double newSalary = ((grossSalary * valueIncrease) + grossSalary)-tax;

        System.out.println("Update data: "+name+", $"+newSalary);

        sc.close();
    }
}
