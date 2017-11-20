/*
 * Day 4
 * Exercise
 * Using comparator interface and
 * compare(<class> <obj>, <class> <obj>)
 * to sort list
 * */
package ArrayList;

import java.util.*;
/*
 * @author Disha Singh
 * */
public class comparator {
	
	String name, color;
	static List<comparator> fruits = new ArrayList<comparator>();
	
	//constructor
	comparator(String name, String color){
		this.name = name;
		this.color = color;
	}
	
	public String getColor() {
		return color;
	}
	
	//using comparator
	static Comparator<comparator> fruitComparator = new Comparator<comparator>() {
		
		public int compare(comparator a, comparator b) {
			return b.getColor().compareTo(a.getColor());//descending order
		}
	};
	
	public static void main(String[] args) {
	
	fruits.add(new comparator("berry", "purple"));
	fruits.add(new comparator("apple", "red"));
	fruits.add(new comparator("plum", "violet"));
	fruits.add(new comparator("strawberry", "scarlet"));
	fruits.add(new comparator("peach", "cream"));
	
	Collections.sort(fruits, comparator.fruitComparator);
	
	System.out.println("The fruit list according to descending order of color is:");
	for(int i=0; i<fruits.size(); i++) {
		System.out.println((fruits.get(i)).name+" "+(fruits.get(i)).color);
	 }
   }
}
