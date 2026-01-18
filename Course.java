import java.util.ArrayList;

public class Course {
    private String courseCode;
    private String title;
    private ArrayList<Student> enrolledStudents;

    public Course(String courseCode, String title) {
        this.courseCode = courseCode;
        this.title = title;
        this.enrolledStudents = new ArrayList<>();
    }

    public void enroll(Student s) {
        enrolledStudents.add(s);
        System.out.println(s.getName() + " enrolled in " + title);
    }

    public void displayInfo() {
        System.out.println("\nCourse: " + title + " (" + courseCode + ")");
        System.out.println("Enrolled Students:");
        for (Student s : enrolledStudents) {
            System.out.println(" - " + s.getName());
        }
    }


public String getCourseCode() {
    return courseCode;
}

public void setTitle(String title) {
    this.title = title;
}
}