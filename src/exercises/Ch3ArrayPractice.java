package exercises;

import java.util.Arrays;

public class Ch3ArrayPractice {

    public static void main(String[] args) {

        int[] numArray = {1, 1, 2, 3, 5, 8};
        for(int i : numArray) {
            if(i%2 == 1) {
                System.out.println(i);
            }
        }

        String phrase = "I would not, could not, in a box. I would not, could not with a fox. I will not eat them in a house. I will not eat them with a mouse.";
        String[] phraseArray = phrase.split("\\.");
        System.out.println(Arrays.toString(phraseArray));
    }

}
