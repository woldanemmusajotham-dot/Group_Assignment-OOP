import java.util.ArrayList;

public class Student {
    private String id;
    private String name;
    private GradeManager gradeManager; // Lien vers le gestionnaire de notes

    // Constructeur
    public Student(String id, String name) {
        this.id = id;
        this.name = name;
        this.gradeManager = new GradeManager(); // Initialise le calculateur pour cet étudiant
    }

    // Méthode pour ajouter une note à cet étudiant
    public void addGrade(double grade) {
        gradeManager.addGrade(grade);
    }

    // Méthode pour afficher les résultats de l'étudiant
    public void showAcademicReport() {
        System.out.println("----------------------------------");
        System.out.println("Rapport Académique pour : " + name + " (ID: " + id + ")");
        gradeManager.displayGrades();
        gradeManager.calculateAverage();
        System.out.println("----------------------------------");
    }

    // Getters
    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "ID: " + id + " | Nom: " + name;
    }
}