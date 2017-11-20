package com.sapient.training;

import java.util.Scanner;

public class bonus_calc extends Employee_2 {
    private static Scanner in;
	
	//To be implemented only if employee is a contractor
	public void print_bonus() {
		System.out.println("5000");
	}
	
	//To be implemented via overloading when employee is regular
	public void print_bonus(int ch) {
		super.print_bonus();
	}
	
	public static void main(String[] args) {
		in = new Scanner(System.in);
		int ch;
		
		bonus_calc obj = new bonus_calc();
		
		System.out.println("Enter if employee is Regular(1) or Contractor(0) to find bonus amount");
		ch = in.nextInt();
		
		if(ch == 0)//override and use local definition
			obj.print_bonus();
		else
			obj.print_bonus(ch);//use definition of parent class
		
	}

}
