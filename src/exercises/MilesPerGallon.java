package exercises;

import java.util.Scanner;

public class MilesPerGallon {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("How many miles have you driven?");
        float miles = input.nextFloat();
        System.out.println("How many gallons of gas has your car consumed?");
        float gallons = input.nextFloat();
        input.close();
        float milesPerGallon = miles/gallons;
        System.out.println("Miles per gallon: " + milesPerGallon + " mpg");
    }

}
