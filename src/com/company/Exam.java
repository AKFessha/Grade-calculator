package com.company;
import java.util.*;

public class Exam {
    private  List<Student> students ;
     static Scanner sc = new Scanner(System.in);

    public Exam (){
      this.students = new ArrayList<>()  ;
    }
    public  void addStudents(){
        System.out.println("Please the name of the student:");
        String name = sc.nextLine();
        System.out.println("Please enter the studentId:");
        int studentId = sc.nextInt();
        sc.nextLine();
        System.out.println("Please enter student's title:");
        String title = sc.nextLine();
        System.out.println("Please enter student's mark:");
        int mark = sc.nextInt();
        sc.nextLine();

        String grade = calculateGrade(mark);

        Student newStudent = new Student(studentId, name, title, grade, mark);
         try{
             students.add(newStudent);
             System.out.println("you have added a student successfully");

         }catch (NullPointerException e){
             System.out.println("something went wrong");
         }


    }
    public void getgrade(){
        System.out.println("please enter the studentId of the student: ");
        int studentId = sc.nextInt();
        sc.nextLine();

        for(int i=0; i< students.size(); i++){
            Student existingStudent = this.students.get(i);
            if (existingStudent.getStudentId() == studentId){
                System.out.println("The grade for this specific student is :  " + existingStudent.getGrade());
                return;
            }
        }
        System.out.println("Student with this studentId doesn't exist");

    }
    public void displayStudents(){
        for(int i=0; i< students.size(); i++){
            Student existingStudent = this.students.get(i);

            System.out.println(existingStudent.getTitle() + " " + existingStudent.getName());
        }
    }
    public static void displayMenu(){
        System.out.println("============================================");
        System.out.println("                 Menu                       ");
        System.out.println("1. Enter Students");
        System.out.println("2. Get Grade for specific student");
        System.out.println("3. Display students");
        System.out.println("4. Exit");
        System.out.println("============================================");
        System.out.println("Please select from the Menu:");
    }
    public  String calculateGrade(int mark){
        if(mark >= 80){
            return "A";
        }
        else if(mark >= 60){
            return "B";
        }
        else if(mark >= 50){
            return "C";
        }
        else{
            return "F";
        }
    }
}

