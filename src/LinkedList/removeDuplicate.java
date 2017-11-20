/*
 * Day 4
 * Exercise
 * Remove duplicates from a linked list
 * */
package LinkedList;
import java.util.*;
/*
 * @author Disha Singh
 * */
public class removeDuplicate {
	public static void main(String[] args) {
		
		List<String> fruit = new LinkedList<String>();
		fruit.add("pineapple");
		fruit.add("berry");
		fruit.add("pineapple");
		fruit.add("apple");
		fruit.add("cherry");
		
		Collections.sort(fruit);// to get list in form of aabcc
		
		for(int i=0; i<fruit.size()-1;) {//removing duplicates
		  if(fruit.get(i).equals(fruit.get(i+1))) {
			  fruit.remove(i+1);
		  } else
			  i++;
		}  
		
		for(int i=0; i<fruit.size(); i++)
			System.out.println(fruit.get(i));
	}
}
