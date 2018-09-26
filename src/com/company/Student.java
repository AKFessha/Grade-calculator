package com.company;

public class Student {
    private int studentId;
    private String name;
    private String title;
    private String grade;
    private int mark;

    public Student(int studentId, String name, String title, String grade, int mark) {
        this.studentId = studentId;
        this.name = name;
        this.title = title;
        this.grade = grade;
        this.mark = mark;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public int getMark() {
        return mark;
    }

    public void setMark(int mark) {
        this.mark = mark;
    }

}
