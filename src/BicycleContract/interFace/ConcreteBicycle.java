/*
 * Day 3
 * Bicycle Contract 2
 * Concrete Class
 * */
package BicycleContract.interFace;
/*
 * @author Disha Singh
 * */
public class ConcreteBicycle implements BicycleInterface {

	public void applyBrakes(int decrement) {
		System.out.println("Speed decreased by "+decrement);
		
	}

	public void speedup(int increment) {
		System.out.println("Speed increased by "+increment);		
	}

	public void changeGear(int gearno) {
		System.out.println("Gear changed to "+gearno);		
	}

}
