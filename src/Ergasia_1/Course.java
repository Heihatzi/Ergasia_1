
package Ergasia_1;

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
        return "Course{" + "title=" + title + ", stream=" + stream + ", type=" + type + ", start_date=" + start_date + ", end_date=" + end_date + '}';
    }
    
}
