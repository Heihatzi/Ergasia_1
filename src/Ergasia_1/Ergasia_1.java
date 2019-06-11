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

        input.close();
    }
//--------------------------------------- MAIN -----------------------------------------
//--------------------------------------------------------------------------------------

//    
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
