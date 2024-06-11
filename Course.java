package University;

public class Course {
    // class fields - variables
    int courseId;
    String courseName;

    //constructor
    public Course(int courseId, String courseName){
        this.courseId = courseId;
        this.courseName = courseName;
    }

    public String toString(){
        return "\n Course ID: " + courseId + "\n Course Name: " + courseName;
    }



}
