package com.enrolment;

import java.util.arraylist;
import java.util.List;

public class Course {
	private string courseId;
	private sting name;
	private int capacity;
	private list<student> enrolledStudents;
	private List<sting> prerequisistes;
	
	public Course(String courseId, String name, int capacity, List<String> prerequisites) {
		this.courseId = courseId;
		this.name = name;
		this.capacity = capacity;
		this.enrolledStudents = new ArrayList<>();
		this.prerequisites = prerequisistes != null? prerequisites : new ArrayList<>();
		
	}
public boolean isFull() {
	return enrolledStudents.size() >= capacity;
}

public boolean enrolledStudent(Student student) {
	if (!isFull() && checkPrerequisistes(student)) {
		enrolledStudents.add(student);
		return true;
	}
	return false;
}

private boolean checkPrerequisites(Student) {
	return enrolledStudents.remove(student);
}

public String getName() {
	return name;
}
public Sting getCourseId() {
