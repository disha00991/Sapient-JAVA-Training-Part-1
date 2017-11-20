/*
 * Day 5
 * Exercise 2
 * Sorting fruitList using HashCode
 * */
package set;

import java.util.*;

/*
 * @author Disha Singh
 * */
public class fruitHash {
	String name;
	String color;
	
	//constructor
	public fruitHash(String name, String color){
		this.name = name;
		this.color = color;
	}
	
	//comparator
	static Comparator<fruitHash> nameComparator = new Comparator<fruitHash>() {
		
		public int compare(fruitHash ob1, fruitHash ob2) {
			
			String h1 = ob1.name;
			String h2 = ob2.name;
			return h1.hashCode() - h2.hashCode();//ascending order
		}
	};
	public static void main(String[] args) {
		
		Set<fruitHash> fruit = new HashSet<fruitHash>();
		fruit.add(new fruitHash("Mango", "Yellow"));
		fruit.add(new fruitHash("Apple", "Red"));
		fruit.add(new fruitHash("Orange", "Orange"));
		fruit.add(new fruitHash("Mango", "Yellow"));
		
		/*set can not be sorted using Collections.sort
		 * so we copy data from set to arraylist
		 * and back after sorting
		 */
		List<fruitHash> fruitList = new ArrayList<fruitHash>();
		fruitList.addAll(fruit);
		fruit.clear();//clear set to refill after data is sorted
		
		Collections.sort(fruitList, fruitHash.nameComparator);
		
		fruit.addAll(fruitList);
		
        Iterator<fruitHash> it = fruit.iterator();
		
		System.out.println("Fruit Name\tFruit Color");
		while(it.hasNext()) {
			fruitHash obj = it.next();
			System.out.println(obj.name+"\t\t"+obj.color+"name hashcode:"+obj.name.hashCode() );
		}
	}

}
