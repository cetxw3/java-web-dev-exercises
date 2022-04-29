package org.launchcode.java.demos.lsn4classes2;

public class SchoolPractice {

    public static void main(String[] args) {
        Student cera = new Student("cera", 1, 85, 3.8);
        System.out.println(cera.getGpa());
        System.out.println(cera.getNumberOfCredits());
        System.out.println(cera.getGradeLevel());
        cera.addGrade(3, 1.1);
        System.out.println(cera.getGpa());
        System.out.println(cera.getNumberOfCredits());
        System.out.println(cera.getGradeLevel());
        cera.addGrade(4, 3.4);
        System.out.println(cera.getGpa());
        System.out.println(cera.getNumberOfCredits());
        System.out.println(cera.getGradeLevel());
    }

}
