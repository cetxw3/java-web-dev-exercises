package Practice;

import java.util.Scanner;

public class AreaRectangle {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double length;
        double width;
        double area;
        System.out.println("Length:");
        length = input.nextDouble();
        System.out.println("Width:");
        width = input.nextDouble();
        input.close();
        area = length * width;
        System.out.println("A rectangle with a length of " + length + " and a width of " + width + " has an area of " + area + ".");
    }

}
