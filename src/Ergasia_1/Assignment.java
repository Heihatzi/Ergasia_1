package Ergasia_1;

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
        return "Assignment{" + "title=" + title + ", description=" + description + ", subDateTime=" + subDateTime + ", oralMark=" + oralMark + ", totalMark=" + totalMark + '}';
    }

}
