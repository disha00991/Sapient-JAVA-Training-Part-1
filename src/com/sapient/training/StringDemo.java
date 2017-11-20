/*
 * Day 7
 * Change code and debug the
 * StringDemo function
 * */
package com.sapient.training;
import java.util.Scanner;
/*
 * @author Disha Singh
 * */
public class StringDemo {

	public static void main(String[] args) {
		boolean contFlag = true;
		@SuppressWarnings("resource")//added to let compiler allow scanner declaration within main()
		Scanner scanner = new Scanner(System.in);
		String completeText = "";
		String textLine = "";
		
		System.out.println("Enter the text and press \"Enter\" to write on a new line "
				+"write 'q' in a new line to quit ");
		
		do {
			textLine = scanner.next();
			if(textLine.equalsIgnoreCase("q")) {
				contFlag = false;
			} else {
				completeText += textLine + " ";
			}
		} while(contFlag);
		
		System.out.println(completeText);
	}

}