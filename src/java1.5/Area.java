/*
 * Day 8
 * Exercise 2
 * Static import Math class
 * Find area of a circle
 * Print rounded value of
 * area
 * */
package zoo;
import static java.lang.Math.*;
/*
 * @author Disha Singh
 * */
public class Area {

	public static void main(String[] args) {
		double area = PI * 5 * 5;
		int ar = (int)area;
		System.out.println("Area of circle with radius 5 is : " +ar);
	}

}
