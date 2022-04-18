package exercises;

import java.util.ArrayList;
import java.util.Scanner;

public class Ch3ArrayListPractice {

    public static void main(String[] args) {

        ArrayList<Integer> numArrayList = new ArrayList<>();
        numArrayList.add(1);
        numArrayList.add(2);
        numArrayList.add(3);
        numArrayList.add(4);
        numArrayList.add(5);
        numArrayList.add(6);
        numArrayList.add(7);
        numArrayList.add(8);
        numArrayList.add(9);
        numArrayList.add(10);

        Integer sum = 0;

        for(int i = 0; i < numArrayList.size(); i++) {
            if(numArrayList.get(i)%2 == 0)
            sum += numArrayList.get(i);
        }
        System.out.println(sum);



        ArrayList<String> words = new ArrayList<>();
        words.add("majority");
        words.add("roost");
        words.add("snore");
        words.add("depressed");
        words.add("wash");
        words.add("ditto");
        words.add("leader");
        words.add("pearl");
        words.add("tribute");
        words.add("dream");

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number less than 10:");
        int num = input.nextInt();
        input.close();

        for(String word : words) {
            if(word.length() == num) {
                System.out.println(word);
            }
        }

    }

}
