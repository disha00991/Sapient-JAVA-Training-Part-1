package com.app;

import java.util.Arrays;
import java.util.List;

import com.app.model.Employee;
import com.app.model.Gender;
import com.app.model.ItemsLib;

public class App {

	public static void main(String[] args) {
		
		Employee emp1 = new Employee("Disha", "23-05-95", 10000, Gender.M);
		Employee emp2 = new Employee("Pari", "20-04-93", 12000, Gender.F);
		
		List<Employee> employees = Arrays.asList(emp1, emp2);
		
		ItemsLib lib = new ItemsLib();
		
		lib.forEach(employees, s -> System.out.println(s.getName()));
		//--------------------------------
		List<Employee> femaleEmployees = lib.filter(employees, s -> s.getGender().equals(Gender.F));
		
		List<Double> l = lib.map(employees, s-> s.getSalary()*0.1);
		//--------------------------------
		lib.forEach(l, System.out::println);
		//--------------------------------
		lib.forEach(femaleEmployees, s -> System.out.println(s.getName()));
	}

}
