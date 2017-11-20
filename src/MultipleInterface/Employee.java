/*
 * Day 3
 * Multiple Interface implementation
 * Employee class implementing both interfaces
 * */
package MultipleInterface;
/*
 * @author Disha
 * */
public class Employee implements Person, Worker{
	public double getsalary() {
		return salary;
	}

	public String getdoj() {
		return doj;
	}

	public String getname() {
		return name;
	}

	public int getage() {
		return age;
	}
}
