/*
 * Day 2
 * Array Exercise
 * Operations on Temperature Array
 * */
package com.sapient.training;
import java.util.Scanner;
/*
 * @author Disha Singh
 * */
public class Temperature_array {
	private static Scanner in;
	public static void main(String[] args) {
		in = new Scanner(System.in);
		
		float[] temp = new float[15];
		float avg = 0;
		float high = -10000;
		System.out.println("Enter 15 temperatures");
		for(int i = 0; i < temp.length; i++) {
			temp[i] = in.nextFloat();
			avg += temp[i]/temp.length;
			
			if(temp[i] > high)
				high = temp[i];
		}//accepting from user
		
		System.out.println("The entered temperatures are:");
		for(int i = 0; i < temp.length; i++) {
			System.out.println(temp[i]);
		}//printing to console
		
		System.out.println("The average: "+avg);
		System.out.println("The highest temperature: "+high);
		
	}

}
