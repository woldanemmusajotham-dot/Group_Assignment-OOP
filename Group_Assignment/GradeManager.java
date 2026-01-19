import java.util.ArrayList;

public class GradeManager {
    private ArrayList<Double> grades;

    public GradeManager() {
        this.grades = new ArrayList<>();
    }

    public void addGrade(double grade) {
        grades.add(grade);
    }

    public void displayGrades() {
        if (grades.isEmpty()) {
            System.out.println("Aucune note enregistrée.");
        } else {
            System.out.print("Liste des notes : " + grades);
        }
    }

    public void calculateAverage() {
        if (grades.isEmpty()) {
            System.out.println(" | Moyenne : 0.0");
            return;
        }
        double sum = 0;
        for (double g : grades) {
            sum += g;
        }
        System.out.printf(" | Moyenne : %.2f%n", (sum / grades.size()));
    }
}