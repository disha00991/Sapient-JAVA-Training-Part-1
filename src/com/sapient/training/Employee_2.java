/*
 * Day 3
 * Employee_2 is exact copy of previous employee class
 * including new changes
 * */
package com.sapient.training;
import com.sapient.training.Address;
/*
 * @author Disha Singh
 * */
public class Employee_2 {
	private String empname, project;
	private double salary;//added after salary increment exercise
	public Address obj;
	
	//constructor
	public Employee_2() {
		//empty
	}
	/*public Employee_2(String name, String project) {
		this.empname = name;
		this.project = project;
	}*/ //constructor not needed if setter method is used for initialization
	
	//methods
	public String getname() {//getter
		return empname;
	}
	
	public String getproject() {//getter
		return project;
	}
	
	public double getsalary() {//getter
		return salary;
	}
	
	public void setname(String name) {//setter
		if(name != "" && name != " ")
			empname = name;
		else
			System.out.println("ERROR: Name can not be null or blank");
	}
	
	public void setproject(String proj) {//setter
			project = proj;
	}
	
	public void setsalary(double sal) {//setter
		if(sal > 0)
			salary = sal;
		else
			System.out.println("ERROR: Salary can not be 0 or negative");
	}
	
	//overridden if employee is a contractor
	public void print_bonus() {
		System.out.println("10-15% of Salary");
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
