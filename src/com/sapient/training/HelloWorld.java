package com.sapient.training;

public class HelloWorld extends Employee{
	public void display() {
		System.out.println("derived");
	}

	public static void main(String[] args) {
		System.out.println("Hello World");
		
		Employee obj1 = new HelloWorld();
		obj1.display();
		
		HelloWorld obj3 = new HelloWorld();
		obj3.display();
		
		Employee obj4 = new Employee();
		obj4.display();

	}

}
