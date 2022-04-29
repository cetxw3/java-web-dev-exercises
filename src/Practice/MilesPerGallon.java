package Practice;

import java.util.Scanner;

public class MilesPerGallon {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        double miles;
        double gallons;
        double mpg;
        System.out.println("Miles:");
        miles = input.nextDouble();
        System.out.println("Gallons:");
        gallons = input.nextDouble();
        input.close();
        mpg = miles / gallons;
        System.out.println("Miles per gallon = " + mpg + "mpg");

    }

}
