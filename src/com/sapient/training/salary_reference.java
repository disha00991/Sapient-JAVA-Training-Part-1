/*
 * Day 2
 * Exercise - Salary Increment(Pass reference)
 * */
package com.sapient.training;
import com.sapient.training.Employee;
import java.util.Scanner;
/*
 * @author Disha Singh
 * */
public class salary_reference {
	private static Scanner in;
	
	public static void newsalary(Employee obj, double increment) {
		obj.salary = obj.salary*(1+ (increment/100));
	}
	
	public static void main(String[] args) {
		in = new Scanner(System.in);
		Employee obj = new Employee();
		
		System.out.println("Enter current Salary");
		 obj.salary = in.nextDouble();
		
		System.out.println("Enter increment %");
		double increment = in.nextDouble();
		
		newsalary(obj, increment);
		
		//int revised_salary_rounded = (int)obj;
		
		System.out.println("Revised Salary is: "+obj.salary);
	}

}
