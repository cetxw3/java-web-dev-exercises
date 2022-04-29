package Practice;

import java.util.Scanner;

public class AreaCircle {


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double radius;
        double area;
        System.out.println("Area:");
        radius = input.nextDouble();
        input.close();
        area = 3.14 * radius * radius;
        System.out.println("The area of a circle with a radius of " + radius + " is " + area + ".");
    }
}