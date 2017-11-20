/*
 * Day 4
 * Exercise 1
 * Creation of ArrayList
 * */
package ArrayList;

import java.util.*;
/*
 * @author Disha Singh
 * */
public class fruits {
	public static void main(String[] args) {
	List<String> fruit = new ArrayList<String>();
	fruit.add("apple");
	fruit.add("mango");
	fruit.add("cherry");
	fruit.add("bkiwi");
	Collections.sort(fruit);
	compareto obj = new compareto();
	fruit = obj.bubblesort(fruit);
	for(int i=0; i<fruit.size(); i++) {
		System.out.println(fruit.get(i));
	}
  
  }
	
}
