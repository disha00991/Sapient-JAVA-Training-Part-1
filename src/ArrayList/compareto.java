/*
 * Day 4
 * Exercise
 * Using compareTo() to sort list
 * */
package ArrayList;

import java.util.*;
/*
 * @author Disha Singh
 * */
public class compareto {

	public List<String> bubblesort(List<String> fruit) {//bubble sort
		
		for(int i = 0; i< fruit.size() - 1; i++) {
			for(int j = 0; j< fruit.size() - i - 1; j++) {
				String thisOne = fruit.get(j);
				String nextOne = fruit.get(j+1);
				
				if (thisOne.compareTo(nextOne) >= 1) { // swap
					String temp = thisOne;
					fruit.set(j, nextOne);
					fruit.set(j+1, temp);
				}
			}
		}
		
		return fruit;
	}
	
	public static void main(String[] args) {
	
	List<String> fruit = new ArrayList<String>();
	
	fruit.add("mango");
	fruit.add("kiwi");
	fruit.add("cherry");
	fruit.add("apple");
	
	//fruit = bubblesort(fruit);
	
	//print the sorted list
	for(int i=0; i<fruit.size(); i++) {
		System.out.println(fruit.get(i));
	}
  
  }
}	