/*
 * Day 4
 * Exercise
 * Linked List implementation
 * */
package LinkedList;
import java.util.*;
/*
 * @author Disha Singh
 * */
public class linkedList {
	public static void main(String[] args) {
		List<String> fruit = new LinkedList<String>();
		fruit.add("apple");
		fruit.add("berry");
		fruit.add("cherry");
		fruit.add("pineapple");
		
		for(int i=0; i<fruit.size(); i++)
		System.out.println(fruit.get(i));
		
	}
}
