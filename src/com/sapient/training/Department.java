/*
 * Day 1
 * Exercise 1
 * Assigning departments to employees
 * */
package com.sapient.training;
import java.util.Scanner;
/*
 * @author Disha Singh
 * */
public class Department{
	private static Scanner in;
	public static void main(String[] args){
		String Emp_name;
		int Dept_no;
		String dept = null;
		
		in = new Scanner(System.in);
		
		System.out.println("Enter employee name");
		Emp_name = in.nextLine();
		System.out.println("Enter department number to be assigned");
		Dept_no = in.nextInt();
		
		if (Dept_no>=1 && Dept_no<=5) {
			switch(Dept_no) {
				case 1:
					dept = "Networking";
					break;
				case 2:
					dept = "Accounts";
					break;
				case 3:
					dept = "Finance";
					break;
				case 4:
					dept = "Marketing";
					break;
				case 5:
					dept = "Technology";
					break;
			}
			
			System.out.println(Emp_name+" was added to Department of "+dept);
		}
		
		else
			System.out.println("The Department number entered doesn't exist. Please try again.");		
		
	}
}