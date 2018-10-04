package com.silalahi.valentinus.advanced.oop2;

import java.util.List;

import javax.management.NotificationFilterSupport;

public class Institute {
	String instituteName;
	private List<Department> departments;

	public Institute(String instituteName, List<Department> departments) {
		super();
		this.instituteName = instituteName;
		this.departments = departments;
	}

	public int getTotalStudentsInInstitute() {
		int noOfStudents = 0;
		List<Student> students;
		for (Department dept : departments) {
			students = dept.getStudents();
			for (Student student : students) {
				noOfStudents++;
			}
		}
		return noOfStudents;
	}
}
