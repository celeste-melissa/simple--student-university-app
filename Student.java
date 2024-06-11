package University;

public class Student {
    // class fields - variables
    int studentId;
    String name;
    //constructor
    public Student(int studentId, String name){
        this.studentId = studentId;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student ID: " + studentId + "\n Student Name: " + name;
    }
}
