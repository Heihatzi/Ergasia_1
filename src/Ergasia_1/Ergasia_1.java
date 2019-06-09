package Ergasia_1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ergasia_1 {

    /**
     * LISTS CREATE
     */
    static List<Student> studentList = new ArrayList();
    static List<Trainer> trainerList = new ArrayList();
    static List<Course> courseList = new ArrayList();
    static List<Assignment> assignmentList = new ArrayList();

    public static void main(String[] args) {

        /**
         * OPEN SCANNER
         */
        Scanner input = new Scanner(System.in);

        System.out.println("\nWelcome! \nTo import data manually, type \"1\",\nTo work with a prefixed set of data, type \"2\"    ");
        int choice1 = returnValidNumber(input);

        while (choice1 != 1 && choice1 != 2) {
            System.out.println("\nPlease type \"1\" to import data, \nor \"2\" to work with a prefixed set of data....    ");
            choice1 = returnValidNumber(input);
        }

        switch (choice1) {
            case 1:                                   //EISAGWGH DEDOMENWN
                System.out.println("----------------------");
                System.out.println("| MANUAL DATA IMPORT |");
                System.out.println("----------------------");

                Student.studentImport(input);
                Trainer.trainerImport(input);
                Course.courseImport(input);
                Assignment.assignmentImport(input);

                break;
            case 2:                                    //ETOIMES LISTES
                System.out.println("LOADING PREFIXED DATA......");
                etoimesListes.autoDataEntry();
            //System.out.println("DATA READY");
        }

        Menu.mainMenu(input);

//        switch (menuChoice) {
//            case 1:
//                Student.printStudentList();
//                break;
//            case 2:
//                Trainer.printTrainerList();
//                break;
//            case 3:
//                Assignment.printAssignmentList();
//                break;
//            case 4:
//                Course.printCourseList();
//                break;
//        }

//        Student.printStudentList();
//        Trainer.printTrainerList();
//        Course.printCourseList();
//        Assignment.printAssignmentList();
        input.close();
    }
//--------------------------------------- MAIN -----------------------------------------
//--------------------------------------------------------------------------------------

//    /**
//     * STUDENT IMPORT FUNCTION
//     */
//    public static void studentImport(Scanner input) {
//        System.out.println("\nNumber of students to import: ");
//        int nStudents = returnValidNumber(input);
//        System.out.println("Importing " + nStudents + " students...... \n");
//
//        for (int i = 1; i <= nStudents; i++) {
//            System.out.println("Last name of student " + i + ": ");
//            String lastName = input.next();
//            System.out.println("First name of student " + i + ": ");
//            String firstName = input.next();
//            Student s = new Student(firstName, lastName);
//            studentList.add(s);
//        }
//    }
//    /**
//     * TRAINER IMPORT FUNCTION
//     */
//    public static void trainerImport(Scanner input) {
//        System.out.println("\n\nNumber of trainers to import: ");
//        int nTrainers = returnValidNumber(input);
//        System.out.println("Importing" + nTrainers + " trainers...... \n");
//        for (int i = 1; i <= nTrainers; i++) {
//            System.out.println("Last name of trainer " + i + ": ");
//            String lastName = input.next();
//            System.out.println("First name of trainer " + i + ": ");
//            String firstName = input.next();
//            Trainer t = new Trainer(firstName, lastName);
//            trainerList.add(t);
//        }
//    }
//    /**
//     * COURSE IMPORT FUNCTION
//     */
//    public static void courseImport(Scanner input) {
//        System.out.println("\n\nNumber of courses to import: ");
//        int nCourses = returnValidNumber(input);
//        System.out.println("Importing " + nCourses + "courses...... \n");
//        for (int i = 1; i <= nCourses; i++) {
//            System.out.println("Title of course " + i + ": ");
//            String title = input.next();
//            Course c = new Course(title);
//            courseList.add(c);
//        }
//    }
//    /**
//     * ASSIGNMENT IMPORT FUNCTION
//     */
//    public static void assignmentImport(Scanner input) {
//        System.out.println("\n\nNumber of assignments to import: ");
//        int nAssignments = returnValidNumber(input);
//        System.out.println("Importing" + nAssignments + " assignments...... \n");
//
//        for (int i = 1; i <= nAssignments; i++) {
//            System.out.println("Title of assignment " + i + ": ");
//            String title = input.next();
//            Assignment a = new Assignment(title);
//            assignmentList.add(a);
//        }
//    }
    /**
     * EISAGWGH ETOIMWN DEDOMENWN SE LISTES
     */
//    public static void autoDataEntry() {
//        studentList.add(new Student("dimitris1", "xatzhgeorgiou1"));
//        studentList.add(new Student("dimitris2", "xatzhgeorgiou2"));
//        studentList.add(new Student("dimitris3", "xatzhgeorgiou3"));
//        studentList.add(new Student("dimitris4", "xatzhgeorgiou4"));
//        studentList.add(new Student("dimitris5", "xatzhgeorgiou5"));
//
//        trainerList.add(new Trainer("tasos1", "lelakis1"));
//        trainerList.add(new Trainer("tasos2", "lelakis2"));
//        trainerList.add(new Trainer("tasos3", "lelakis3"));
//        trainerList.add(new Trainer("tasos4", "lelakis4"));
//        trainerList.add(new Trainer("tasos5", "lelakis5"));
//
//        courseList.add(new Course("CTitle1"));
//        courseList.add(new Course("cTitle2"));
//        courseList.add(new Course("cTitle3"));
//        courseList.add(new Course("cTitle4"));
//        courseList.add(new Course("cTitle5"));
//
//        assignmentList.add(new Assignment("aTitle1"));
//        assignmentList.add(new Assignment("aTitle2"));
//        assignmentList.add(new Assignment("aTitle3"));
//        assignmentList.add(new Assignment("aTitle4"));
//        assignmentList.add(new Assignment("aTitle5"));
//    }
//    /**
//     * PRINT STUDENT LIST
//     */
//    public static void printStudentList() {
//        System.out.println("\n-- LIST OF STUDENTS --\n");
//        for (Student s : studentList) {
//            System.out.println(s);
//        }
//    }
//    /**
//     * PRINT TRAINER LIST
//     */
//    public static void printTrainerList() {
//        System.out.println("\n-- LIST OF TRAINERS --\n");
//        for (Trainer t : trainerList) {
//            System.out.println(t);
//        }
//    }
//    /**
//     * PRINT COURSE LIST
//     */
//    public static void printCourseList() {
//        System.out.println("\n-- LIST OF COURSES --\n");
//        for (Course c : courseList) {
//            System.out.println(c);
//        }
//    }
//    /**
//     * PRINT ASSIGNMENT LIST
//     */
//    public static void printAssignmentList() {
//        System.out.println("\n-- LIST OF ASSIGNMENTS --\n");
//        for (Assignment a : assignmentList) {
//            System.out.println(a);
//        }
//    }
    /**
     *
     * VALIDATE NUMBER INPUT (NATURAL NUMBER >0)
     *
     * @param scanner
     * @return
     */
    public static int returnValidNumber(Scanner scanner) {
        int num;
        boolean isFirstTime = true;
        do {
            if (isFirstTime) {
                isFirstTime = false;
            } else {
                System.out.println("Please enter a natural number ");
            }
            while (!scanner.hasNextInt()) {
                System.out.println("You must enter a number");
                scanner.next();
            }
            num = scanner.nextInt();
        } while (num < 0);
        return num;
    }
}
