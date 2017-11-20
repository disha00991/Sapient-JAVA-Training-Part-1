/*
 * Day 2
 * Exercise 2
 * Printing employee details
 * */
package com.sapient.training.test;
import com.sapient.training.Employee;
/*
 * @author Disha Singh
 * */
public class EmployeeTest {
	public static void main(String[] args) {
		Employee addr = new Employee("Disha", "Employee Database");
		addr.setdetails(203, 46, "160017", "Chandigarh", "India");
		addr.printdetails();
	}
}
