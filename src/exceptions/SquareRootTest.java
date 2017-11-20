/*
 * Day 6
 * Exercise 2
 * Write a program to calculate square root
 * handle exception of negative number
 * */
package map;
import java.util.*;
/*
 * @author Disha Singh
 * */
public class SquareRootTest {
	private static Scanner in;
	static double no;
	
	public static void acceptNo() throws ArithmeticException {
		no = in.nextDouble();
		if (no<0)
			throw new ArithmeticException("Square Root of negative number is not supported");
		}
	
	public static void main(String[] args) {
		
		in = new Scanner(System.in);
		acceptNo();
		
		System.out.println("The square root of "+no+" is:"+Math.sqrt(no));		 
	}
}