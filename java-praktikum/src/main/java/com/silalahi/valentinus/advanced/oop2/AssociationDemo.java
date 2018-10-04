package com.silalahi.valentinus.advanced.oop2;

/*
 * Association is relation between two separate classes which establishes through their Objects. 
 * Association can be one-to-one, one-to-many, many-to-one, many-to-many.
 * 
 * In Object-Oriented programming, an Object communicates to other Object to use 
 * functionality and services provided by that object. 
 * Composition and Aggregation are the two forms of association.
*/

public class AssociationDemo {
	public static void main(String[] args) {
		Bank bank = new Bank("BCA");
		Employee emp = new Employee("Silalahi Partao");

		System.out.println(emp.getEmployeeName() + " adalah Karyawan " + bank.getBankname());
	}
}
