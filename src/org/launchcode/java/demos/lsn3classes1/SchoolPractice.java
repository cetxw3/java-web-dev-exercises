package org.launchcode.java.demos.lsn3classes1;

import java.util.ArrayList;

public class SchoolPractice {
    public static void main(String[] args) {
        // Instantiate your Student class for part 2 here!

        Student cera = new Student();
        Student joe = new Student();
        Student blow = new Student();
        Student schmoe = new Student();
        Teacher williams = new Teacher();
        Course chemistry = new Course();
        ArrayList<Student> enrolledChemistryStudents = new ArrayList<>();


        cera.setName("Cera");
        cera.setStudentId(1);
        cera.setNumberOfCredits(13);
        cera.setGpa(4.0);

        joe.setName("Joe");
        joe.setStudentId(2);
        joe.setNumberOfCredits(12);
        joe.setGpa(2.9);

        blow.setName("Blow");
        blow.setStudentId(3);
        blow.setNumberOfCredits(14);
        blow.setGpa(3.7);

        schmoe.setName("Schmoe");
        schmoe.setStudentId(4);
        schmoe.setNumberOfCredits(10);
        schmoe.setGpa(1.8);

        williams.setFirstName("Harold");
        williams.setLastName("Williams");
        williams.setSubject("Chemistry");
        williams.setYearsTeaching(10);

        enrolledChemistryStudents.add(cera);
        enrolledChemistryStudents.add(joe);
        enrolledChemistryStudents.add(blow);
        enrolledChemistryStudents.add(schmoe);

        chemistry.setCourseTitle("Chemistry");
        chemistry.setTeacher(williams);
        chemistry.setEnrolledStudents(enrolledChemistryStudents);

        System.out.println(chemistry.getCourseTitle());

        System.out.println(chemistry.getTeacher().getFirstName());
        System.out.println(chemistry.getTeacher().getLastName());
        System.out.println(chemistry.getTeacher().getSubject());
        System.out.println(chemistry.getTeacher().getYearsTeaching());

        System.out.println(chemistry.getEnrolledStudents().get(0).getName());
        System.out.println(chemistry.getEnrolledStudents().get(0).getStudentId());
        System.out.println(chemistry.getEnrolledStudents().get(0).getNumberOfCredits());
        System.out.println(chemistry.getEnrolledStudents().get(0).getGpa());

        System.out.println(chemistry.getEnrolledStudents().get(1).getName());
        System.out.println(chemistry.getEnrolledStudents().get(1).getStudentId());
        System.out.println(chemistry.getEnrolledStudents().get(1).getNumberOfCredits());
        System.out.println(chemistry.getEnrolledStudents().get(1).getGpa());

        System.out.println(chemistry.getEnrolledStudents().get(2).getName());
        System.out.println(chemistry.getEnrolledStudents().get(2).getStudentId());
        System.out.println(chemistry.getEnrolledStudents().get(2).getNumberOfCredits());
        System.out.println(chemistry.getEnrolledStudents().get(2).getGpa());

        System.out.println(chemistry.getEnrolledStudents().get(3).getName());
        System.out.println(chemistry.getEnrolledStudents().get(3).getStudentId());
        System.out.println(chemistry.getEnrolledStudents().get(3).getNumberOfCredits());
        System.out.println(chemistry.getEnrolledStudents().get(3).getGpa());


    }
}
