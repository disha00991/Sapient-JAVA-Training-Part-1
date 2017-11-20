/*
 * Day 2
 * Exercise 2
 * Printing employee details reusing address class
 * created in Exercise 1
 * */
package com.sapient.training;
import com.sapient.training.Address;
/*
 * @author Disha Singh
 * */
public class Employee {
	public String empname, project;
	public Address obj;
	public double salary;//added after salary increment exercise
	
	//constructor
	public Employee() {
		//empty
	}
	public Employee(String name, String project) {
		this.empname = name;
		this.project = project;
	}
	
	//methods
	public void display() {
		System.out.println("base");
	}
	public void setdetails(int houseno, int sector, String pin, String city, String country) {
		obj = new Address();
		obj = obj.setaddress(obj, houseno, sector, pin, city, country);
	}
	
	public void printdetails() {
		System.out.println("Employee Name: "+empname);
		System.out.println("Project assigned: "+project);
		System.out.println("Employee Address:");
		obj.printaddress();
	}

}
