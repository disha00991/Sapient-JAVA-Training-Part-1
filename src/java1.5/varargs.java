/*
 * Day 8
 * Exercise 3
 * Demonstrate use of varargs
 * */
package zoo;
/*
 * @author Disha Singh
 * */
public class varargs {
	
	public static float average(int size, Integer...numbers) {
		float sum = 0;
		for(int num : numbers)
			sum += num;
		
		return sum/size;
	}

	public static void main(String[] args) {
		int a = 3;
		int b= 4;
		int c = 10;
		int d = 8;
		int e = 9;
		System.out.println("Avg of 3 nos :"+ average(3, a,b,c));
		System.out.println("Avg of 5 nos :"+ average(5, a,b,c,d,e));
	}

}
