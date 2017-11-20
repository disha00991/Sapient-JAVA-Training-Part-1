
/*
 * Day 8
 * Exercise 1
 * Demonstrate autoboxing-unboxing
 * by sorting a list of integers
 * using Collections.sort(); method
 * */
package zoo;
import java.util.*;
/*
 * @author Disha Singh
 * */
public class AutoBoxingTest {
	public static void main(String[] args) {
		List<Integer> num = new ArrayList<Integer>();
 		num.add(3);
 		num.add(7);
 		num.add(1);
 		num.add(4);
 		num.add(5);
 		
 		Collections.sort(num);
 		
		for(Integer no : num)
			System.out.println(no);
	}

}
