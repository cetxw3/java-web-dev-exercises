package org.launchcode.java.studios.funwithquizzes;

import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;
import java.util.ArrayList;

public class Quiz {

    ArrayList<Question> questions = new ArrayList<>();

    //first ask user what kind of question they would like to add: MC, TF, Cb

    public void addNewQuestion() {
        Scanner input = new Scanner(System.in);
        Question questionToBeAdded;

        HashMap<Integer, String> questionTypes = new HashMap<>();
        questionTypes.put(1, "Multiple choice");
        questionTypes.put(2, "True or false");
        questionTypes.put(3, "Checkbox / multi-select");

        //print question
        System.out.println("What type of question would you like to add?");

        //print options
        for (Map.Entry<Integer, String> x : questionTypes.entrySet()) {
            System.out.println(x.getKey() + " - " + x.getValue());
        }

        int questionTypeChoice = input.nextInt();

        if (questionTypeChoice == 1) {
            questionToBeAdded = new MultipleChoice();
            questionToBeAdded.getQuestionFromUser();
            questionToBeAdded.getChoicesFromUser();
            questionToBeAdded.getAnswerFromUser();
            questions.add(questionToBeAdded);

        } else if (questionTypeChoice == 2) {
            questionToBeAdded = new TrueFalse();
            questionToBeAdded.getQuestionFromUser();
            questionToBeAdded.getChoicesFromUser();
            questionToBeAdded.getAnswerFromUser();
            questions.add(questionToBeAdded);

        } else if (questionTypeChoice == 3) {
            questionToBeAdded = new Checkbox();
            questionToBeAdded.getQuestionFromUser();
            questionToBeAdded.getChoicesFromUser();
            questionToBeAdded.getNumberOfCorrectChoicesFromUser();
            questionToBeAdded.getAnswerFromUser();
            questions.add(questionToBeAdded);

        } else {
            System.out.println("Invalid choice try again");
        }

    }


    public ArrayList<Question> getQuestions() {
        return questions;
    }
}
