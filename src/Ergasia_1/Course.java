
package Ergasia_1;

import static Ergasia_1.Ergasia_1.courseList;
import static Ergasia_1.Ergasia_1.returnValidNumber;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Course {
    
    private String title;
    private String stream;
    private String type;
    private int start_date;
    private int end_date;

    
    /**
     * CONSTRUCTORS
     * @param title
     * @param stream 
     */
    
    
    public Course() {
    }

    public Course(String title) {
        this.title = title;
    }
    
    

    public Course(String title, String stream) {
        this.title = title;
        this.stream = stream;
    }

    
    
    public Course(String title, String stream, String type, int start_date, int end_date) {
        this.title = title;
        this.stream = stream;
        this.type = type;
        this.start_date = start_date;
        this.end_date = end_date;
    }
    
    
    
    
    /*
    Course Title
    */
    public void setTitle(String title){
        this.title = title;        
    }
    
    public String getTitle(){
        return title;
    }
    
    /*
    Course Stream
    */
    public void setStream(String stream){
        this.stream = stream;        
    }
    
    public String getStream(){
        return stream;
    }
    
    /*
    Course Type
    */
    public void setType(String type){
        this.type = type;        
    }
    
    public String getType(){
        return type;
    }
    
    /*
    Course Start Date
    */
    
    public void setStart_date(int start_date){
        this.start_date = start_date;
    }
    
    public int getStart_date(){
        return start_date;
    }
    
    /*
    Course End Date
    */
    
    public void setEnd_date(int end_date){
        this.end_date = end_date;
    }
    
    public int getEnd_date(){
        return end_date;
    }

    @Override
    public String toString() {
        return "{" + "title: " + title + ", stream: " + stream + ", type: " + type + ", start: " + start_date + ", end: " + end_date + '}';
    }
    /**
     * COURSE IMPORT FUNCTION
     * @param input
     */
    public static void courseImport(Scanner input) {
        System.out.println("\n\nNumber of courses to import: ");
        int nCourses = returnValidNumber(input);
        System.out.println("Importing " + nCourses + " courses...... \n");
        for (int i = 1; i <= nCourses; i++) {
            System.out.println("Title of course " + i + ": ");
            String title = input.next();
            Course c = new Course(title);
            courseList.add(c);
            //String listName = "studentsIn_"+c.getTitle()+"_"+c.getStream;
           // List<Student> listName = new ArrayList();
            
        }
    }
    
     /**
     * PRINT COURSE LIST
     */
    public static void printCourseList() {
        System.out.println("\n-- LIST OF COURSES --\n");
        for (Course c : courseList) {
            System.out.println(c);
        }
    }
}
