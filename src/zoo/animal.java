package zoo;

public class animal {
	String name;
	String photo;
	String food;
	String hunger;
	String boundary;
	
	//common methods for all animals
	public void sleep() {
		//sleep
		System.out.println("Your animal is sleeping");
	}
	public void roam() {}
	
	//specific methods
	public void speak() {}
	public void eat() {}
	
	public void lunchTime(animal obj) {
		obj.eat();
		obj.roam();
		obj.sleep();
	}
	
	public static void main(String[] args) {
		animal[] obj = new animal[6];
		obj[0] = new lion();
		obj[1] = new cat();
		obj[2] = new tiger();
		obj[3] = new deer();
		obj[4] = new dog();
		obj[5] = new elephant();
		
		//Looking at a tiger's routine
		System.out.println("Routine of a Tiger:");
		obj[2].speak();
		obj[2].lunchTime(obj[2]);		
	}
}
