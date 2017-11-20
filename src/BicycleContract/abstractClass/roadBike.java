/*
 * Day 3
 * Bicycle Contract 1
 * class for extending abstract class
 * varying speed of road bike
 * */
package BicycleContract.abstractClass;
/*
 * @author Disha Singh
 * */
public class roadBike extends Bicycle{
	
	public void applyBrakes(int decrement) {
		System.out.println("Speed of road bike decreased");
	}

	public void speedup(int increment) {
		System.out.println("Speed of road bike increased");
	}
}
