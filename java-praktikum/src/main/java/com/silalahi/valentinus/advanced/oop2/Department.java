package com.silalahi.valentinus.advanced.oop2;

import java.util.List;

public class Department {
	String name;
	private List<Student> students;

	public Department(String name, List<Student> students) {
		super();
		this.name = name;
		this.students = students;
	}

	public List<Student> getStudents() {
		return students;
	}
}
