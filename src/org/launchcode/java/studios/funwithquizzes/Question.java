package org.launchcode.java.studios.funwithquizzes;

import java.util.HashMap;
import java.util.Scanner;

public class Question {

    private String question;
    private HashMap<Integer, String> choices = new HashMap<>();
    private String answer;
    int numberOfCorrectAnswers = 1;

    public void getQuestionFromUser() {
        Scanner input = new Scanner(System.in);
        String userQuestion;
        System.out.println("Enter your multiple choice question:");
        userQuestion = input.nextLine();
        input.close();
        setQuestion(userQuestion);
    };

    public void getChoicesFromUser() {};

    public void getAnswerFromUser() {
        if (numberOfCorrectAnswers != 1) {
            Scanner input = new Scanner(System.in);
            String userAnswer;
            HashMap<Integer, String> userAnswers = new HashMap<>();
            int integer = 1;

            System.out.println("Enter the correct answers (press ENTER once all answers have been entered):");

            do {
                System.out.println("Answer:");
                userAnswer = input.nextLine();

                if (!userAnswer.equals("")) {
                    userAnswers.put(integer, userAnswer);
                    integer++;
                }

            } while (!userAnswer.equals(""));

            input.close();
        } else {
            Scanner input = new Scanner(System.in);
            String userAnswer;
            System.out.println("What is the correct answer?");
            userAnswer = input.nextLine();
            input.close();
            setAnswer(userAnswer);
        }

    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public HashMap<Integer, String> getChoices() {
        return choices;
    }

    public void setChoices(HashMap<Integer, String> choices) {
        this.choices = choices;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    public int getNumberOfCorrectAnswers() {
        return numberOfCorrectAnswers;
    }

    public void getNumberOfCorrectChoicesFromUser() {
        Scanner input = new Scanner(System.in);
        System.out.println("How many correct answers does this question have?");
        numberOfCorrectAnswers = input.nextInt();
        input.close();
    }
}
