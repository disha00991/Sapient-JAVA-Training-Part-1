/*
 * Day 1
 * Exercise 2
 * Finding active employment years
 * of an employee
 * */
package com.sapient.training;
/*
 * @author Disha Singh
 * */
public class Retirement {
	
	public static void main(String[] args) {
		int[] birth_year = {1978,1980,1995,1990,1992,1996};
		System.out.println("Years for active employment left are:");
		//Retirement age constraint given: 58 years
		for(int i=0; i<birth_year.length; i++) {
			//year greater than 0 and before 2017
			if(birth_year[i]>0 && birth_year[i]<2017) {
				System.out.print(58 + birth_year[i] - 2017 +" ");
			}
		}
		
	}

}
