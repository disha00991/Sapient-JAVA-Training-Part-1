/*
 * Day 5
 * Exercise 5
 * Insert Employee object in LinkedHashmap
 * and check whether order of insertion is
 * maintained or not
 * */
package map;
import java.util.*;
import java.util.Map.Entry;
/*
 * @author Disha Singh
 * */
public class empLinkedMap {
	public static void main(String[] args) {
		LinkedHashMap<Integer, String> emp = new LinkedHashMap<Integer, String>();
		emp.put(001, "Steve");
		emp.put(002, "Rob");
		emp.put(007, "Peter"); //the order of insertion is maintained and this entry stays here
		emp.put(004, "Mark");
		emp.put(005, "John");
		emp.put(006, "Tom");
		
		System.out.println("The entries with insertion order maintained are:");
		Set<Entry<Integer, String>> empEntry = emp.entrySet();
		for(Entry<Integer, String> entry : empEntry) {
			System.out.println(entry);
		}
	}
}
