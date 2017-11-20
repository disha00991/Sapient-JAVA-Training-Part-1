/*
 * Day 7
 * Change code and debug the
 * StringBuilderDemo function
 * */
package com.sapient.training;
import java.util.Scanner;
/*
 * @author Disha Singh
 * */
public class StringBuilderDemo {

	public static void main(String[] args) {
		boolean contFlag = true;
		@SuppressWarnings("resource")//added to let compiler allow scanner declaration within main()
		Scanner scanner = new Scanner(System.in);
		String wordLine = "";
		StringBuilder completeText = new StringBuilder();
		
		System.out.println("Enter the text and press \"Enter\" to write on a new line "
				+"write 'q' in a new line to quit ");
		
		do {
			wordLine = scanner.next();
			if(wordLine.equalsIgnoreCase("q")) {
				contFlag = false;
			} else {
				completeText.append(wordLine + " ");
			}
		} while(contFlag);
		
		System.out.println(completeText);
	}

}