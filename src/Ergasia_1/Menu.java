/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ergasia_1;

import static Ergasia_1.Ergasia_1.returnValidNumber;
import static java.lang.System.exit;
import java.util.Scanner;

/**
 *
 * @author dimit
 */
public class Menu {

    /**
     * EMFANISH KYRIWS MENOY
     *
     * @param input
     */
    public static void mainMenu(Scanner input) {
        System.out.println("\n\nPlease type the number of the action you want to perform:  ");
        System.out.println("1.  Print all students");
        System.out.println("2.  Print all trainers");
        System.out.println("3.  Print all assignments");
        System.out.println("4.  Print all courses");
        System.out.println("5.  Print all students per course");
        System.out.println("6.  Print all trainers per course");
        System.out.println("7.  Print all assignments per course");
        System.out.println("8.  Print all assignments per student");
        System.out.println("9.  Print all students that belong to more than one courses");
        System.out.println("0.  Exit program");

        int menuChoice = returnValidNumber(input);

        /**
         * DIAXEIRHSH EPILOGHS KYRIWS MENOU
         */
        switch (menuChoice) {
            case 1:
                Student.printStudentList();
                anotherList(input);
            case 2:
                Trainer.printTrainerList();
                anotherList(input);
            case 3:
                Assignment.printAssignmentList();
                anotherList(input);
            case 4:
                Course.printCourseList();
                anotherList(input);
                
                //PROSTHESE CASES GIA UPOLOIPA ERWTHMATA-------------------------
                
            case 0:
                exit(0);
            default:
                System.out.println("\nPlease enter a valid number... ");
                mainMenu(input);
        }
    }

    /**
     * ERWTHSH EPITHIMIAS XRHSTH GIA EKTYPWSH EPOMENHS LISTAS
     *
     * @param input
     */
    public static void anotherList(Scanner input) {
        System.out.println("\nDo you want to prin another list? y/n");
        String ch1 = input.next();
        while (!ch1.equals("y") && !ch1.equals("n")) {
            System.out.println("You must type \"y\" or \"n\"");
            ch1 = input.next();
        }
        if (ch1.equals("y")) {
            mainMenu(input);
        } else {
            exit(0);
        }

    }
}
