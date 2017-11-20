/*
 * Day 3
 * Bicycle Contract 2
 * Test Class
 * */
package BicycleContract.interFace;
/*
 * @author Disha Singh
 * */
public class BicycleTest {
	public static void main(String[] args) {
		ConcreteBicycle bike = new ConcreteBicycle();
		bike.changeGear(1);
		bike.speedup(20);
		bike.applyBrakes(10);
		bike.changeGear(3);
		bike.speedup(50);
	}
}
