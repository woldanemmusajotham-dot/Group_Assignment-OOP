import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    // Liste pour stocker nos cours (Simule une base de données)
    private static ArrayList<Course> courseList = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        // Données initiales (comme sur votre capture d'écran)
        courseList.add(new Course("CS101", "Java Programming"));
        courseList.add(new Course("CS102", "Web Development"));

        while (true) {
            System.out.println("\n--- SYSTÈME DE GESTION DE COURS ---");
            System.out.println("1. Ajouter un cours (Create)");
            System.out.println("2. Afficher tous les cours (Read)");
            System.out.println("3. Modifier un cours (Update)");
            System.out.println("4. Supprimer un cours (Delete)");
            System.out.println("5. Quitter");
            System.out.print("Choisissez une option : ");
            
            int choice = scanner.nextInt();
            scanner.nextLine(); // Nettoyer le buffer

            switch (choice) {
                case 1 -> createCourse();
                case 2 -> readCourses();
                case 3 -> updateCourse();
                case 4 -> deleteCourse();
                case 5 -> {
                    System.out.println("Fermeture du programme...");
                    return;
                }
                default -> System.out.println("Option invalide !");
            }
        }
    }

    // --- CREATE ---
    private static void createCourse() {
        System.out.print("Code du cours : ");
        String code = scanner.nextLine();
        System.out.print("Titre du cours : ");
        String title = scanner.nextLine();
        courseList.add(new Course(code, title));
        System.out.println("Cours ajouté !");
    }

    // --- READ ---
    private static void readCourses() {
        if (courseList.isEmpty()) {
            System.out.println("Aucun cours enregistré.");
        } else {
            for (Course c : courseList) {
                c.displayInfo(); // Utilise votre méthode existante
            }
        }
    }

    // --- UPDATE ---
    private static void updateCourse() {
        System.out.print("Entrez le code du cours à modifier : ");
        String code = scanner.nextLine();
        for (Course c : courseList) {
            if (c.getCourseCode().equals(code)) {
                System.out.print("Nouveau titre : ");
                c.setTitle(scanner.nextLine());
                System.out.println("Modification réussie !");
                return;
            }
        }
        System.out.println("Cours non trouvé.");
    }

    // --- DELETE ---
    private static void deleteCourse() {
        System.out.print("Entrez le code du cours à supprimer : ");
        String code = scanner.nextLine();
        boolean removed = courseList.removeIf(c -> c.getCourseCode().equals(code));
        if (removed) System.out.println("Cours supprimé.");
        else System.out.println("Code introuvable.");
    }
}