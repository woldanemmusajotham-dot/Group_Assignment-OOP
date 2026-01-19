package com.enrollment;

import java.util.ArrayList;
import java.util.List;

public class Student {
    private String username;
    private List<String> completedCourses;

    public Student(String username) {
        this.username = username;
        this.completedCourses = new ArrayList<>();
    }

    public String getUsername() {
        return username;
    }

    public List<String> getCompletedCourses() {
        return completedCourses;
    }

    public void completeCourse(String course) {
        completedCourses.add(course);
    }
}