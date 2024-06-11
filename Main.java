package University.Main;
import University.*;
public class Main {
    public static void main(String [] args){
        Student student1 = new Student(0101011, "Melissa Doff");
        Course firstCourse = new Course(101, "Biology");
        Enrollment newEnrollment = new Enrollment(student1, firstCourse);
        System.out.println(newEnrollment);
    }
}
