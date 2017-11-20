/*
 * Day 4
 * Exercise
 * Changing code to use generics
 * */
package ArrayList;

import java.util.*;
/*
 * @author Disha Singh
 * */
public class generics {
	public static void main(String[] args) {
		List<List<Integer>> matrix = new ArrayList<List<Integer>>(); //List matrix = new ArrayList();
		for(int i=0; i<=10; i++) {
			List<Integer> row = new ArrayList<Integer>(); //List row = new ArrayList();
			 for(int j = 0; j<=10; j++) {
				 row.add(i*j);
		    }
		  matrix.add(row); 
		}
		for(int i=0; i<matrix.size();i++)
			System.out.println(matrix.get(i));
	}
	
}
