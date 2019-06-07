package Ergasia_1;

import static Ergasia_1.Ergasia_1.assignmentList;
import static Ergasia_1.Ergasia_1.returnValidNumber;
import java.util.Scanner;

public class Assignment {

    private String title;
    private String description;
    private int subDateTime;
    private int oralMark;
    private int totalMark;

    /**
     * CONSTRUCTORS
     */
    public Assignment() {
    }

    public Assignment(String title) {
        this.title = title;
    }

    public Assignment(String title, String description, int subDateTime) {
        this.title = title;
        this.description = description;
        this.subDateTime = subDateTime;
    }

    /*
    Title
     */
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    /*
    Description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    /*
    Submission date time
     */
    public int getSubDateTime() {
        return subDateTime;
    }

    public void setSubDateTime(int subDateTime) {
        this.subDateTime = subDateTime;
    }

    /*
    Oral mark
     */
    public int getOralMark() {
        return oralMark;
    }

    public void setOralMark(int oralMark) {
        this.oralMark = oralMark;
    }

    /*
    Total mark
     */
    public int getTotalMark() {
        return totalMark;
    }

    public void setTotalMark(int totalMark) {
        this.totalMark = totalMark;
    }

    @Override
    public String toString() {
        return "{" + "title: " + title + ", descr: " + description + ", subDateTime: " + subDateTime + ", oral mark: " + oralMark + ", totalMark=" + totalMark + '}';
    }
/**
     * ASSIGNMENT IMPORT FUNCTION
     * @param input
     */
    public static void assignmentImport(Scanner input) {
        System.out.println("\n\nNumber of assignments to import: ");
        int nAssignments = returnValidNumber(input);
        System.out.println("Importing" + nAssignments + " assignments...... \n");

        for (int i = 1; i <= nAssignments; i++) {
            System.out.println("Title of assignment " + i + ": ");
            String title = input.next();
            Assignment a = new Assignment(title);
            assignmentList.add(a);
        }
    }
    
     /**
     * PRINT ASSIGNMENT LIST
     */
    public static void printAssignmentList() {
        System.out.println("\n-- LIST OF ASSIGNMENTS --\n");
        for (Assignment a : assignmentList) {
            System.out.println(a);
        }
    }
}
