import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    private static ArrayList<Student> studentList = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        // Données de test initiales
        studentList.add(new Student("S01", "Alice"));
        studentList.add(new Student("S02", "Bob"));

        while (true) {
            System.out.println("\n--- GESTION DES NOTES ET ÉTUDIANTS ---");
            System.out.println("1. Afficher tous les étudiants et leurs notes");
            System.out.println("2. Ajouter une note à un étudiant");
            System.out.println("3. Ajouter un nouvel étudiant");
            System.out.println("4. Quitter");
            System.out.print("Sélectionnez une option : ");
            
            int choice = scanner.nextInt();
            scanner.nextLine(); // Nettoyer le buffer

            switch (choice) {
                case 1 -> showAll();
                case 2 -> addGradeToStudent();
                case 3 -> createStudent();
                case 4 -> {
                    System.out.println("Fin du programme.");
                    return;
                }
                default -> System.out.println("Option invalide.");
            }
        }
    }

    private static void showAll() {
        System.out.println("\n--- RAPPORTS ACADÉMIQUES ---");
        for (Student s : studentList) {
            s.showAcademicReport();
        }
    }

    private static void addGradeToStudent() {
        System.out.print("Entrez le nom de l'étudiant (ex: Alice) : ");
        String name = scanner.nextLine();
        for (Student s : studentList) {
            if (s.getName().equalsIgnoreCase(name)) {
                System.out.print("Entrez la note (utilisez le point pour les décimales) : ");
                double note = scanner.nextDouble();
                s.addGrade(note);
                System.out.println("Note ajoutée avec succès !");
                return;
            }
        }
        System.out.println("Étudiant non trouvé.");
    }

    private static void createStudent() {
        System.out.print("ID de l'étudiant : ");
        String id = scanner.nextLine();
        System.out.print("Nom de l'étudiant : ");
        String name = scanner.nextLine();
        studentList.add(new Student(id, name));
        System.out.println("Nouvel étudiant ajouté.");
    }
}