package org.launchcode.java.demos.lsn3classes1;

import java.util.ArrayList;

public class Course {

    private String courseTitle;
    private Teacher teacher;
    private ArrayList<Student> enrolledStudents;


    public String getCourseTitle() {
        return courseTitle;
    }
    public void setCourseTitle(String aCourseTitle) {
        courseTitle = aCourseTitle;
    }

    public Teacher getTeacher() {
        return teacher;
    }
    public void setTeacher(Teacher aTeacher) {
        teacher = aTeacher;
    }

    public ArrayList<Student> getEnrolledStudents() {
        return enrolledStudents;
    }
    public void setEnrolledStudents(ArrayList<Student> aEnrolledStudents) {
        enrolledStudents = aEnrolledStudents;
    }



}
