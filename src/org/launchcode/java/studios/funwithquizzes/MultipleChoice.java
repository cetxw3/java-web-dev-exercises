package org.launchcode.java.studios.funwithquizzes;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MultipleChoice extends Question {

    @Override
    public void getChoicesFromUser() {
        Scanner input = new Scanner(System.in);
        HashMap<Integer, String> userChoices = new HashMap<>();
        String userChoice;
        int integer = 1;

        System.out.println("Enter the options for your multiple choice question (press ENTER once all options have been entered):");

        do {
            System.out.println("Option:");
            userChoice = input.nextLine();

            if (!userChoice.equals("")) {
                userChoices.put(integer, userChoice);
                integer ++;
            }

        } while (!userChoice.equals(""));

        input.close();
    }

}
