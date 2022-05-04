package org.launchcode.java.studios.funwithquizzes;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class TrueFalse extends Question {

    @Override
    public void getChoicesFromUser() {
        HashMap<Integer, String> userChoices = new HashMap<>();

        userChoices.put(1, "True");
        userChoices.put(2, "False");

        setChoices(userChoices);
    }

}
