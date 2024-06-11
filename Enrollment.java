package University;

public class Enrollment {
    // class fields - variables
    Student student;
    Course course;

    //constructor
    public Enrollment(Student student, Course course){
        this.student = student;
        this.course = course;
    }
    public String toString(){
        return student +  " " + course;
    }
}
