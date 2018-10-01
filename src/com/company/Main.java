package com.company;
import java.util.*;
public class Main {
    static Scanner sc = new Scanner(System.in);
    private static Exam exam = new Exam();

    public static void main(String[] args) {

            boolean menuLoop = true;
            while (menuLoop) {

                int choice = 0;


            while(true) {
                try {
                    Exam.displayMenu();
                    choice = Integer.parseInt(sc.nextLine());
                    break;

                }
                catch(NumberFormatException e){
                    System.out.println("The value you entered is invalid, please enter a value between 1 and 5");
                }
            }
                switch (choice) {
                    case 1:
                        exam.addStudents();
                        break;
                    case 2:
                        exam.getgrade();
                        break;
                    case 3:
                        exam.displayStudentInfo();
                        break;
                    case 4:
                        exam.displayStudents();
                        break;
                    case 5:
                        System.exit(0);

                }
            }

    }
}