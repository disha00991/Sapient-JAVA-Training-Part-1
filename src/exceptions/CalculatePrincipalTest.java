/*
 * Day 6
 * Exercise 1
 * Write a program to calculate Principal
 * using formula p = si*100/r*t
 * handle exceptions of t=0 and r=0
 * */
package zoo;
import java.util.*;
/*
 * @author Disha Singh
 * */
public class CalculatePrincipalTest {
	private static Scanner in;
	static float si;
	static int r;
	static int t;
	
	public static void acceptRandT() throws ArithmeticException {
		t = in.nextInt();
		if (t==0)
			throw new ArithmeticException("time can't be 0");
		r = in.nextInt();
		if (r==0)
			throw new ArithmeticException("time can't be 0");
		}
	
	public static void main(String[] args) {
		
		in = new Scanner(System.in);
		si = in.nextFloat();
		acceptRandT();
		
		float p = (si*100)/(r*t);
		
		System.out.println("The principal is:"+p);		 
	}
}
