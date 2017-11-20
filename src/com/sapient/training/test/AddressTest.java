/*
 * Day 2
 * Exercise 1
 * Demonstration of Test class
 * */
package com.sapient.training.test;
import com.sapient.training.Address;
/*
 * @author Disha Singh
 * */
public class AddressTest {

	public static void main(String[] args) {
		Address addr = new Address();
		addr = addr.setaddress(addr, 307, 7, "160019", "Chandigarh", "India");
		addr.printaddress();
	}

}
