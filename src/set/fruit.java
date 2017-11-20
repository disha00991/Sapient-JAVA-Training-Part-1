/*
 * Day 5
 * Exercise 1
 * Printing size of set<fruit> having fruit objects
 * */
package set;

import java.util.*;

/*
 * @author Disha Singh
 * */
public class fruit {
	String name;
	String color;
	
	//constructor
	fruit(String name, String color){
		this.name = name;
		this.color = color;
	}
	public static void main(String[] args) {
		
		Set<fruit> fruitList = new HashSet<fruit>();
		fruitList.add(new fruit("Mango", "Yellow"));
		fruitList.add(new fruit("Apple", "Red"));
		fruitList.add(new fruit("Orange", "Orange"));
		fruitList.add(new fruit("Mango", "Yellow"));
		
		System.out.println("Size:"+fruitList.size());
		//Prints 4 and not 3(as in case of a set)
		//because for objects, comparator must be 
		//used to tell set that which object attribute
		//(name or color) must be checked for duplicates.
	}

}
