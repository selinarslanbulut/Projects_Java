package Projects_Java.Day_3.Homework2;

public class Student extends User {
    private String courseStudent;

    public Student(int id, String username, String password, String firstName, String lastName, String java) {
        super(id, username, password, firstName, lastName);
        this.courseStudent = courseStudent;
    }

    public String getCourseStudent() {
        return courseStudent;
    }

    public void setCourseStudent(String courseStudent) {
        this.courseStudent = courseStudent;
    }
}
