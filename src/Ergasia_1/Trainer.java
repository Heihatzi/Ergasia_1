package Ergasia_1;

import static Ergasia_1.Ergasia_1.returnValidNumber;
import static Ergasia_1.Ergasia_1.trainerList;
import java.util.Scanner;

public class Trainer {

    private String firstName;
    private String lastName;
    private String subject;

    /**
     * CONSTRUCTORS
     *
     * @param firstName
     * @param lastName
     * @param subject
     */
    public Trainer() {
    }

    public Trainer(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public Trainer(String firstName, String lastName, String subject) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.subject = subject;
    }

    /*
    First name
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getFirstName() {
        return firstName;
    }

    /*
    Last name
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getLastName() {
        return lastName;
    }

    /*
    Subject
     */
    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getSubject() {
        return subject;
    }

    @Override
    public String toString() {
        return "{" + firstName + " " + lastName + ", subject: " + subject + '}';
    }
/**
     * TRAINER IMPORT FUNCTION
     * @param input
     */
    public static void trainerImport(Scanner input) {
        System.out.println("\n\nNumber of trainers to import: ");
        int nTrainers = returnValidNumber(input);
        System.out.println("Importing " + nTrainers + " trainers...... \n");
        for (int i = 1; i <= nTrainers; i++) {
            System.out.println("Last name of trainer " + i + ": ");
            String lastName = input.next();
            System.out.println("First name of trainer " + i + ": ");
            String firstName = input.next();
            Trainer t = new Trainer(firstName, lastName);
            trainerList.add(t);
        }
    }
    
     /**
     * PRINT TRAINER LIST
     */
    public static void printTrainerList() {
        System.out.println("\n-- LIST OF TRAINERS --\n");
        for (Trainer t : trainerList) {
            System.out.println(t);
        }
    }
}
