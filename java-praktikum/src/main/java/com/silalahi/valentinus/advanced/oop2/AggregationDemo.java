package com.silalahi.valentinus.advanced.oop2;

import java.util.ArrayList;
import java.util.List;

/*
 * It is a special form of Association where:
 * 
 * It represents Has-A relationship.
 * 
 * It is a unidirectional association i.e. a one way relationship. 
 * For example, department can have students but vice versa is not possible and thus unidirectional in nature.
 * 
 * In Aggregation, both the entries can survive individually which means ending one entity will not effect 
 * the other entity
*/

public class AggregationDemo {
	public static void main(String[] args) {
		Student s1 = new Student("VS", 001, "IT");
		Student s2 = new Student("SP", 002, "IT");
		Student s3 = new Student("SS", 003, "SH");
		Student s4 = new Student("Vale", 003, "SH");

		List<Student> listStudentTeknik = new ArrayList<Student>();
		listStudentTeknik.add(s1);
		listStudentTeknik.add(s2);

		List<Student> listStudentSosial = new ArrayList<Student>();
		listStudentSosial.add(s3);
		listStudentSosial.add(s4);

		Department dept = new Department("IT", listStudentTeknik);
		Department dept1 = new Department("SH", listStudentSosial);

		List<Department> departments = new ArrayList<Department>();
		departments.add(dept);
		departments.add(dept1);

		Institute institute = new Institute("UNI", departments);
		System.out.println("Total students in institute : ");
		System.out.println(institute.getTotalStudentsInInstitute());
	}
}
