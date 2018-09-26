package com.company;
import java.util.*;
public class Main {
    static Scanner sc = new Scanner(System.in);
    private static Exam exam = new Exam();

    public static void main(String[] args) {
        boolean menuLoop = true;
        while (menuLoop) {
        Exam.displayMenu();
        int choice = sc.nextInt();


            switch (choice) {
                case 1:
                    exam.addStudents();
                    break;
                case 2:  exam.getgrade();
                    break;
                case 3:
                    exam.displayStudents();
                    break;
                case 4:
                    System.exit(0);

            }
        }
    }
}