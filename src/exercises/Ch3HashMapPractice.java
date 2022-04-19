package exercises;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Ch3HashMapPractice {

    public static void main(String[] args) {

        HashMap<String, Integer> students = new HashMap<>();
        Scanner input = new Scanner(System.in);
        String newStudent;

        System.out.println("Enter your students (or ENTER to finish):");

        //get student names and grades:
        do {

            System.out.print("Student: ");
            newStudent = input.nextLine();

            if(!newStudent.equals("")) {
                System.out.print("ID Number: ");
                Integer newID = input.nextInt();
                students.put(newStudent, newID);

                input.nextLine(); //read in the newline before looping back - this is what keeps the code going?
            }

        } while (!newStudent.equals(""));

        //print class roster using HashMap loop
        System.out.println("\nClass Roster:");
        for(HashMap.Entry<String, Integer> student : students.entrySet()) {
            System.out.println(student.getKey() + ", ID: " + student.getValue());
        }
    }

}
