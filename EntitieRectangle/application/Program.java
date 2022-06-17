package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Rectangle;

public class Program{
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);

        Rectangle x;

        x = new Rectangle();

        System.out.println("Enter rectangle width and height:");
        x.width = scan.nextDouble();
        x.height = scan.nextDouble();

        double areaX = x.area();
        double perimeterX = x.perimeter();
        double diagonalX = x.diagonal();
    
        System.out.println("AREA = " + areaX);
        System.out.println("PERIMETER = " + perimeterX);
        System.out.println("DIAGONAL = " + diagonalX);

        scan.close();
    }

}