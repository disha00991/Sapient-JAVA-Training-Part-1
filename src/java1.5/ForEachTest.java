/*
 * Day 8
 * Exercise 1
 * Demonstrate java 1.5 features
 * The new for loop
 * */
package zoo;
import java.util.*;
/*
 * @author Disha Singh
 * */
public class ForEachTest {
	int id;
	String name;
	//constructor
	public ForEachTest(int id, String name) {
		this.id = id;
		this.name = name;
	}
	 public static void main(String[] args) {
		 List<ForEachTest> emp = new ArrayList<ForEachTest>();
		 emp.add(new ForEachTest(001, "Steve"));
		 emp.add(new ForEachTest(002, "Rob"));
		 emp.add(new ForEachTest(007, "Peter")); //the order of insertion is maintained and this entry stays here
		 emp.add(new ForEachTest(004, "Mark"));
		 emp.add(new ForEachTest(005, "John"));
		 emp.add(new ForEachTest(006, "Tom"));
		 
		 for(ForEachTest ob : emp) {
			 System.out.println(ob.id+"\t"+ob.name);
		 }
	 } 
}
