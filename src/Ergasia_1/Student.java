package Ergasia_1;

import static Ergasia_1.Ergasia_1.returnValidNumber;
import static Ergasia_1.Ergasia_1.studentList;
import java.util.Scanner;

public class Student {

    private String firstName;
    private String lastName;
    private int dateOfBirth;
    private int tuitionFees;

    /**
     * CONSTRUCTORS
     *
     * @param firstName
     * @param lastName
     */
    public Student() {
    }

    public Student(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public Student(String firstName, String lastName, int dateOfBirth) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.dateOfBirth = dateOfBirth;
    }

    public Student(String firstName, String lastName, int dateOfBirth, int tuitionFees) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.dateOfBirth = dateOfBirth;
        this.tuitionFees = tuitionFees;
    }

    /*
    First name
     */
    public void setFirst_name(String firstName) {
        this.firstName = firstName;
    }

    public String getFirstName() {
        return firstName;
    }

    /*
    Last name
     */
    public void setLastname(String lastName) {
        this.lastName = lastName;
    }

    public String getLastName() {
        return lastName;
    }

    /*
    Date of Birth
     */
    public void setDateOfBirth(int dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public int getDateOfBirth() {
        return dateOfBirth;
    }

    /*
    Tuition Fees
     */
    public void setTuitionFees(int tuitionFees) {
        this.tuitionFees = tuitionFees;
    }

    public int getTuitionFees() {
        return tuitionFees;
    }

    @Override
    public String toString() {
        return "Student{" + lastName + " " + firstName + ", DOB: " + dateOfBirth + ", Tuition Fees: " + tuitionFees + '}';
    }

    /**
     * STUDENT IMPORT FUNCTION
     * @param input is Scanner
     */
    public static void studentImport(Scanner input) {
        System.out.println("\nNumber of students to import: ");
        int nStudents = returnValidNumber(input);
        System.out.println("Importing " + nStudents + " students...... \n");

        for (int i = 1; i <= nStudents; i++) {
            System.out.println("Last name of student " + i + ": ");
            String lastName = input.next();
            System.out.println("First name of student " + i + ": ");
            String firstName = input.next();
            Student s = new Student(firstName, lastName);
            studentList.add(s);
        }
    }
    
    /**
     * PRINT STUDENT LIST
     */
    public static void printStudentList() {
        
        System.out.println("\n-- LIST OF STUDENTS --\n");
        for (Student s : studentList) {
            System.out.println(s);
        }
    }
}
