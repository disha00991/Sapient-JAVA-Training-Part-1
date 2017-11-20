/*
 * Day 5
 * Exercise 6
 * Use TreeMap instead of a LinkedHashmap
 * of Exercise 5 and check whether it is
 * sorted or not
 * */
package map;
import java.util.*;
import java.util.Map.Entry;
/*
 * @author Disha Singh
 * */
public class empTreeMap {
	public static void main(String[] args) {
		Map<Integer, String> emp = new TreeMap<Integer, String>();
		emp.put(001, "Steve");
		emp.put(005, "Rob");
		emp.put(007, "Peter");
		emp.put(004, "Mark");
		emp.put(003, "John");
		emp.put(006, "Tom");
		
		System.out.println("The sorted entries are:");
		Set<Entry<Integer, String>> empEntry = emp.entrySet();
		for(Entry<Integer, String> entry : empEntry) {
			System.out.println(entry);
		}
	}
}
