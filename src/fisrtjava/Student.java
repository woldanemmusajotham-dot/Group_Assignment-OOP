package fisrtjava;

public class Student extends User {
    private int year;      
    private double gpa;    

    public Student(String id, String name, String email, int year) {
        super(id, name, email);
        this.year = year;
        this.gpa = 0.0;   // GPA 
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    @Override
    public void displayInfo() {
        System.out.println("Student ID: " + getId());
        System.out.println("Name: " + getName());
        System.out.println("Email: " + getEmail());
        System.out.println("Year: " + year);
        System.out.println("GPA: " + gpa);
    }
}
