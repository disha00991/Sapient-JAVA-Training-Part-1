/*
 * Day 5
 * Exercise 7
 * Create an Iterator on fruitlist<fruit>
 * and print name and color of all fruits
 * contained in it
 * */
package set;
import java.util.*;
/*
 * @author Disha Singh
 * */
public class fruitIterator {
	String name;
	String color;
	
	//constructor
	public fruitIterator(String name, String color) {
		this.name = name;
		this.color = color;
	}

	public static void main(String[] args) {
		List<fruitIterator> fruit = new ArrayList<fruitIterator>();
		fruit.add(new fruitIterator("Mango", "Yellow"));
		fruit.add(new fruitIterator("Apple", "Red"));
		fruit.add(new fruitIterator("Orange", "Orange"));
		fruit.add(new fruitIterator("Litchi", "Grey"));
		
		Iterator<fruitIterator> it = fruit.iterator();
		
		System.out.println("Fruit Name\tFruit Color");
		while(it.hasNext()) {
			fruitIterator obj = it.next();
			System.out.println(obj.name+"\t\tnk"+obj.color);
		}
	}

}
