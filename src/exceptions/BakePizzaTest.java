/*
 * Day 6
 * Exercise 3
 * Write a program to Bake a pizza
 * in less than 5 minutes otherwise
 * throw exception. Turn off the oven
 * irrespective of whether pizza was
 * baked properly or not
 * */
package zoo;
import java.util.*;
/*
 * @author Disha Singh
 * */
public class BakePizzaTest {
	private static Scanner in;
	static double t;//time taken to bake
	
	public static void bakePizza() throws ArithmeticException {
		t = in.nextDouble();
		if (t>=5)
			throw new ArithmeticException("Pizza took too long to bake!");
		}
	
	public static void main(String[] args) {
		
		in = new Scanner(System.in);
		try {
			System.out.println("enter baking time for pizza");
			bakePizza();
		} finally {
			System.out.println("The oven is turned off.");
		}
		
		System.out.println("The pizza is ready");		 
	}
}