public class Student {
    private String id;
    private String name;

    public Student(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public String getName() { return name; }
    public String getId() { return id; }
    @Override
    public String toString() { return "ID: " + id + " | Name: " + name; }
}