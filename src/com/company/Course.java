package com.company;

public class Course {
private Student newStudents;
private String courseName;

public Course(){

}

public Course(Student newStudents, String courseName){
    this.newStudents= newStudents;
    this.courseName= courseName;
}
    public Student getNewStudents() {
        return newStudents;
    }

    public void setNewStudents(Student newStudents) {
        this.newStudents = newStudents;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }
}
