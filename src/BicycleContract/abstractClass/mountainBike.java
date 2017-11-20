/*
 * Day 3
 * Bicycle Contract 1
 * class for extending abstract class
 * varying speed of mountain bike
 * */
package BicycleContract.abstractClass;
/*
 * @author Disha Singh
 * */
public class mountainBike extends Bicycle{

	public void applyBrakes(int decrement) {
		System.out.println("Speed of mountain bike decreased");
	}

	public void speedup(int increment) {
		System.out.println("Speed of mountain bike increased");
	}

}
