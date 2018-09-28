package com.company;
import java.util.*;
public class Main {
    static Scanner sc = new Scanner(System.in);
    private static Exam exam = new Exam();

    public static void main(String[] args) {

            boolean menuLoop = true;
            while (menuLoop) {

                try {
                    Exam.displayMenu();
                    int choice = Integer.parseInt(sc.nextLine());


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
                catch(NumberFormatException e){
                    System.out.println("The value you entered is invalid, please enter a value between 1 and 5");
                }
                catch(InputMismatchException e){
                    System.out.println("The value you entered doesn't match, please enter a value between 1 and 5");
                }
        }

    }
}