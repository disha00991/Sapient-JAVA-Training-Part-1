/*
 * Day 2
 * Exercise - Salary Increment(Pass primitive)
 * */
package com.sapient.training;
import java.util.Scanner;
/*
 * @author Disha Singh
 * */
public class salary {
	private static Scanner in;
	
	public static double newsalary(double salary, double increment) {
		return salary*(1+ (increment/100));
	}
	
	public static void main(String[] args) {
		in = new Scanner(System.in);
		
		System.out.println("Enter current Salary");
		double salary = in.nextDouble();
		
		System.out.println("Enter increment %");
		double increment = in.nextDouble();
		
		int revised_salary_rounded = (int)newsalary(salary, increment);
		
		System.out.println("Revised Salary is: "+revised_salary_rounded);
	}

}
