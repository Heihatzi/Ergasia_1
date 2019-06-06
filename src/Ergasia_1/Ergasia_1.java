package Ergasia_1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ergasia_1 {

    public static void main(String[] args) {

        /**
         * LISTS CREATE
         */
        List<Student> studentList = new ArrayList();
        List<Trainer> trainerList = new ArrayList();
        List<Course> courseList = new ArrayList();
        List<Assignment> assignmentList = new ArrayList();

        /**
         * OPEN SCANNER
         */
        Scanner input = new Scanner(System.in);

        System.out.println("\nWelcome! \nTo import data manually, type \"1\",\nTo work with a prefixed set of data, type \"2\"    ");
        int choice1 = input.nextInt();

        while (choice1 != 1 && choice1 != 2) {
            System.out.println("\nPlease type \"1\" to import data, \nor \"2\" to work with a prefixed set of data....    ");
            choice1 = input.nextInt();
        }

        switch (choice1) {
            case 1:
                System.out.println("----------------------");
                System.out.println("| MANUAL DATA IMPORT |");
                System.out.println("----------------------");

                /**
                 * STUDENT IMPORT
                 */
                System.out.println("\nNumber of students to import: ");
                int nStudents = input.nextInt();
                System.out.println("Importing " + nStudents + " students...... \n");

                for (int i = 1; i <= nStudents; i++) {
                    System.out.println("Last name of student " + i + ": ");
                    String lastName = input.next();
                    System.out.println("First name of student " + i + ": ");
                    String firstName = input.next();
                    Student s = new Student(firstName, lastName);
                    studentList.add(s);
                }

                /**
                 * TRAINER IMPORT
                 */
                System.out.println("\n\nNumber of trainers to import: ");
                int nTrainers = input.nextInt();
                System.out.println("Importing trainers...... \n");

                for (int i = 1; i <= nTrainers; i++) {
                    System.out.println("Last name of trainer " + i + ": ");
                    String lastName = input.next();
                    System.out.println("First name of trainer " + i + ": ");
                    String firstName = input.next();
                    Trainer t = new Trainer(firstName, lastName);
                    trainerList.add(t);
                }

                /**
                 * COURSE IMPORT
                 */
                System.out.println("\n\nNumber of courses to import: ");
                int nCourses = input.nextInt();
                System.out.println("Importing courses...... \n");

                for (int i = 1; i <= nCourses; i++) {
                    System.out.println("Title of course " + i + ": ");
                    String title = input.next();
                    Course c = new Course(title);
                    courseList.add(c);
                }

                /**
                 * ASSIGNMENT IMPORT
                 */
                System.out.println("\n\nNumber of assignments to import: ");
                int nAssignments = input.nextInt();
                System.out.println("Importing assignments...... \n");

                for (int i = 1; i <= nAssignments; i++) {
                    System.out.println("Title of assignment " + i + ": ");
                    String title = input.next();
                    Assignment a = new Assignment(title);
                    assignmentList.add(a);
                }
                break;
            case 2:
                System.out.println("LOADING PREFIXED DATA......");
                //BALE EDW ETOIMES LISTES
                studentList.add(new Student("dimitris1","xatzhgeorgiou1"));
                studentList.add(new Student("dimitris2","xatzhgeorgiou2"));
                studentList.add(new Student("dimitris3","xatzhgeorgiou3"));
                studentList.add(new Student("dimitris4","xatzhgeorgiou4"));
                studentList.add(new Student("dimitris5","xatzhgeorgiou5"));
                
                trainerList.add(new Trainer("tasos1","lelakis1"));
                trainerList.add(new Trainer("tasos2","lelakis2"));
                trainerList.add(new Trainer("tasos3","lelakis3"));
                trainerList.add(new Trainer("tasos4","lelakis4"));
                trainerList.add(new Trainer("tasos5","lelakis5"));
                
                courseList.add(new Course("title1"));
                courseList.add(new Course("title2"));
                courseList.add(new Course("title3"));
                courseList.add(new Course("title4"));
                courseList.add(new Course("title5"));
                
                assignmentList.add(new Assignment("atitle1"));
                assignmentList.add(new Assignment("atitle2"));
                assignmentList.add(new Assignment("atitle3"));
                assignmentList.add(new Assignment("atitle4"));
                assignmentList.add(new Assignment("atitle5"));
                
                
                System.out.println("DATA READY");
        }

        /**
         * PRINT STUDENT LIST
         */
        System.out.println("\nLIST OF STUDENTS\n");

        for (Student s : studentList) {
            System.out.println(s);
        }

        /**
         * PRINT TRAINER LIST
         */
        System.out.println("\nLIST OF TRAINERS\n");

        for (Trainer t : trainerList) {
            System.out.println(t);
        }

        /**
         * PRINT COURSE LIST
         */
        System.out.println("\nLIST OF COURSES\n");

        for (Course c : courseList) {
            System.out.println(c);
        }

        /**
         * PRINT ASSIGNMENT LIST
         */
        System.out.println("\nLIST OF ASSIGNMENTS\n");

        for (Assignment a : assignmentList) {
            System.out.println(a);
        }


    }
//--------------------------------------- MAIN -----------------------------------------
//--------------------------------------------------------------------------------------
}
