/*
 * Day 5
 * Exercise 3, 4
 * 
 * Ex 3:
 * Implementing HashMap and its
 * various operations on given
 * Employee Table
 * 
 * Ex 4:
 * Iterate the HashMap using
 * key, value and entry
 * */
package map;
import java.util.*;
import java.util.Map.Entry;
/*
 * @author Disha Singh
 * */
public class empMap {
	public static void main(String[] args) {
		//Ex 3
		//Creating HashMap for Employee Table
		 Map<Integer, String> emp = new HashMap<Integer, String>();
		 emp.put(001, "Steve");
		 emp.put(002, "Rob");
		 emp.put(003, "Peter");
		 emp.put(004, "Mark");
		 emp.put(005, "John");
		 emp.put(006, "Tom");
		 
		 System.out.println("The keys are:");//printing all the keys
		 System.out.println(emp.keySet());
		 
		 emp.remove(004);//remove key pair with key=004 from Map
		 System.out.println("4th entry removed");
		 
	     System.out.println(emp.entrySet());//Printing remaining key-value pairs
		 
		 //Ex 4
		 //Iterating over keys
	     System.out.println("Emp Ids(Keys):");
	     int index = 1;
		 Set<Integer> empIdSet = emp.keySet();
		 for(Integer i : empIdSet) {
			 System.out.println("Emp Id["+(index++)+"]: 00"+i);
		 } 
		 
		//Iterating over values
		 System.out.println("Emp Names(Values):");
		 index = 1;
		 Collection<String> empNameSet = emp.values();
		 for(String i : empNameSet) {
			 System.out.println("Emp Name["+(index++)+"]: "+i);
		 }
		 
		//Iterating over entry
		System.out.println("Emp Entries:");
		index = 1;
		Set<Entry<Integer, String>> empEntry = emp.entrySet();
		for(Entry<Integer, String> i : empEntry) {
			System.out.println("Emp Entry["+(index++)+"]: "+i);
		}
	}
}
