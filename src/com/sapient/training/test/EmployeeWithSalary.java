/*
 * Day 3
 * Exercise 1
 * Demonstration of access modifiers and getters/setters
 * */
package com.sapient.training.test;
import com.sapient.training.Employee_2;
/*
 * @author Disha Singh
 * */
public class EmployeeWithSalary {
	public static void main(String[] args) {
		Employee_2 obj = new Employee_2();
		
		//setters
		obj.setname("Disha");
		obj.setproject("PlexiApp");
		obj.setsalary(10000);
		
		//getters
		String name = obj.getname();
		String project = obj.getproject();
		double salary = obj.getsalary();
		
		System.out.println("Name: "+name+", Project: "+project+" ,Salary :"+salary);
	}
	
}
