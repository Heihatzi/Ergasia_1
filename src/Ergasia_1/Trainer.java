
package Ergasia_1;

public class Trainer {
    
    private String firstName;
    private String lastName;
    private String subject;

    
    /**
     * CONSTRUCTORS
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
    
    public void setFirstName(String firstName){
        this.firstName = firstName;
    }
    
    public String getFirstName(){
        return firstName;
    }
    
    /*
    Last name
    */
    
    public void setLastName(String lastName){
        this.lastName = lastName;
    }
    
    public String getLastName(){
        return lastName;
    }
    
    /*
    Subject
    */
    
    public void setSubject(String subject){
        this.subject = subject;
    }
    
    public String getSubject(){
        return subject;
    }
}
