/*
 * Day 2
 * Exercise 1
 * Address store
 * */
package com.sapient.training;
/*
 * @author Disha Singh
 * */
public class Address {
	 
	public int house_no;
	public int sector;
	public String city;
	public String country;
	public String pin;
	
	//constructor
	public Address() {
		//empty
	}
	
	public Address(int house_no, int sector, String pin) {
		this.house_no = house_no;
		this.sector = sector;
		this.pin = pin;
	}

	//methods
	public void setcityandcountry(String city_, String country_) {
		city = city_;
		country = country_;
	}
	
	public void printaddress() {
		System.out.println("House No. "+house_no+",");
		System.out.println("Sector "+sector+",");
		System.out.println(city+",");
		System.out.println(country+",");
		System.out.println(pin+".");
	}
	
	public Address setaddress(Address obj, int houseno, int sector, String pin, String city, String country) {
		obj = new Address(houseno, sector, pin);//houseno,sector and pincode initialized
		
		//calling function to initialize city and country
		obj.setcityandcountry(city, country);
		
		return obj;
	}
	
}
