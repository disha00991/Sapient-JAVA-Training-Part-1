/*
 * Day 2
 * Exercise 3
 * Swap employee details
 * */
package com.sapient.training.test;
import java.util.Scanner;
import com.sapient.training.Employee;
/*
 * @author Disha Singh
 * */
public class SwapEmployee {
	private static Scanner in;
	static String name;
	static String project;
	static int house_no;
	static int sector;
	static String pin;
	static String city;
	static String country;

	public static void main(String[] args) {
		in = new Scanner(System.in);
		Employee temp = new Employee();
		
		//A details
		System.out.println("Enter details for employee A");
		System.out.println("Order: Name, Project, Pin, City, Country, House no, Sector ");
		name = in.nextLine();
		project = in.nextLine();
		pin = in.nextLine();
		city = in.nextLine();
		country = in.nextLine();
		house_no = in.nextInt();
		sector = in.nextInt();
		
		Employee A = new Employee(name, project);
		A.setdetails(house_no, sector, pin, city, country);
		
		//B details
		System.out.println("Enter details for employee B");
		System.out.println("Order: Name, Project, Pin, City, Country, House no, Sector ");
		name = in.nextLine();
		project = in.nextLine();
		pin = in.nextLine();
		city = in.nextLine();
		country = in.nextLine();
		house_no = in.nextInt();
		sector = in.nextInt();
		
		Employee B = new Employee(name, project);
		B.setdetails(house_no, sector, pin, city, country);

		//swap details
		temp = A;
		A = B;
		B = temp;
		
		//print swapped info
		System.out.println("Updated details for employee A & B respectively:");
		A.printdetails();
		B.printdetails();
	}

}
