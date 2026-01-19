package com.enrollment;

import java.util.ArrayList;
import java.util.List;

public class Enrollment {
    private List<EnrollmentRecord> enrollments;

    public Enrollment() {
        enrollments = new ArrayList<>();
    }

    public void enroll(Student student, Course course) {
        if (course.enrollStudent(student)) {
            enrollments.add(new EnrollmentRecord(student, course));
            System.out.println(student.getUsername() + " enrolled in " + course.getName() + ".");
        } else {
            System.out.println("Could not enroll " + student.getUsername() + " in " + course.getName() + ".");
        }
    }

    public void drop(Student student, Course course) {
        if (course.dropStudent(student)) {
            enrollments.removeIf(record -> record.getStudent().equals(student) && record.getCourse().equals(course));
            System.out.println(student.getUsername() + " dropped from " + course.getName() + ".");
        } else {
            System.out.println(student.getUsername() + " is not enrolled in " + course.getName() + ".");
        }
    }

    private class EnrollmentRecord {
        private Student student;
        private Course course;

        public EnrollmentRecord(Student student, Course course) {
            this.student = student;
            this.course = course;
        }

        public Student getStudent() {
            return student;
        }

        public Course getCourse() {
            return course;
        }
    }
}