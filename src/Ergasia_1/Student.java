package Ergasia_1;

public class Student {

    private String firstName;
    private String lastName;
    private int dateOfBirth;
    private int tuitionFees;

    
    /**
     * CONSTRUCTORS
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

}
