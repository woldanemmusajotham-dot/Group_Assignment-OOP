package fisrtjava;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        ArrayList<User> users = new ArrayList<>();
        users.add(new Student("S001", "Alice", "alice@student.com", 2));
        users.add(new Instructor("I001", "Bob", "bob@uni.com", "Computer Science"));
        users.add(new Admin("A001", "Charlie", "charlie@uni.com"));

        System.out.println("===== University System =====");

        while (true) {
            System.out.println("\n1. Login");
            System.out.println("2. Exit");
            System.out.print("Choose an option: ");
            int choice = sc.nextInt();
            sc.nextLine(); 

            if (choice == 2) {
                System.out.println("Exiting…");
                break;
            } else if (choice == 1) {
                System.out.print("Enter user ID: ");
                String id = sc.nextLine();

                User loggedIn = null;
                for (User u : users) {
                    if (u.getId().equalsIgnoreCase(id)) {
                        loggedIn = u;
                        break;
                    }
                }

                if (loggedIn != null) {
                    System.out.println("\nLogin successful!\n");
                    loggedIn.displayInfo();

                   
                    if (loggedIn instanceof Student) {
                        System.out.println("\n[Student Menu]");
                        System.out.println("1. View Courses");
                        System.out.println("2. View Grades");
                    } else if (loggedIn instanceof Instructor) {
                        System.out.println("\n[Instructor Menu]");
                        System.out.println("1. View My Courses");
                        System.out.println("2. Assign Grades");
                    } else if (loggedIn instanceof Admin) {
                        System.out.println("\n[Admin Menu]");
                        System.out.println("1. Manage Users");
                        System.out.println("2. Manage Courses");
                    }

                } else {
                    System.out.println("User not found!");
                }

            } else {
                System.out.println("Invalid option!");
            }
        }

        sc.close();
    }
}
