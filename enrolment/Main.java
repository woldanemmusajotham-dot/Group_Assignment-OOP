package com.enrollment;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // Création de cours
        Course course1 = new Course("CS101", "Introduction to Computer Science", 2, null);
        Course course2 = new Course("CS102", "Data Structures", 2, Arrays.asList("CS101"));

        // Création d'étudiants
        Student student1 = new Student("Alice");
        Student student2 = new Student("Bob");

        // Ajout de cours terminés
        student1.completeCourse("CS101");

        // Gestion des inscriptions
        Enrollment enrollmentSystem = new Enrollment();
        enrollmentSystem.enroll(student1, course1); // Alice s'inscrit
        enrollmentSystem.enroll(student2, course1); // Bob s'inscrit
        enrollmentSystem.enroll(student2, course2); // Bob tente de s'inscrire à CS102 (échec)

        // Désinscription
        enrollmentSystem.drop(student1, course1); // Alice se désinscrit
    }
}