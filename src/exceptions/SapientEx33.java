/*
Exercise:
To store the names and salaries of various employees segregated into various departments as key and value pairs. 
Avoid duplication in the names of employees in a department.
Check the limitation: Salary should not be <= 0 using custom Exception.
*/

import java.util.*;

class SalaryNotValidException extends RuntimeException         //Creating custom Exception which extends RuntimeException
{
	SalaryNotValidException(String s)      //Creates a constructor in which the String value is implemented according to the super class
	{
		super(s);
	}
}
    
class Employee      
{ 
	String empName;             //Declaring the variables in which the employee details need to be stored
	int empSalary;      

	public Employee(String empName, int empSalary)    
	{      
    		this.empName = empName;           //Declaring the variable in the constructor
		this.empSalary = empSalary;
		
		if(this.empSalary <=0 )            //Throwing Exception to ensure Salary is always greater than zero.
		{
			throw new SalaryNotValidException("Salary can only be a positive integer value");
		}	   
	}

	//Getter and Setter methods

	public int getEmpSalary() 
	{
		return empSalary;
	}
	
	public void setEmpSalary(int empSalary) 
	{
		this.empSalary = empSalary;
	}

	public String getEmpName() 
	{
		return empName;
	}

	public void setEmpName(String empName) 
	{
		this.empName = empName;
	} 

	void print()        //Method for printing the employee details
	{
		System.out.println("Name: " + empName + "\tSalary: " + empSalary); 
	}  
}    

public class SapientEx33
{    
	public static void main(String[] args) 
	{    
        	//Storing Department names according to department IDs

		System.out.println("The following are the department names with their corresponding department numbers:");
		System.out.println("1. Networking \n2. Accounts \n3. Marketing \n4. Technology");
		System.out.println("");

		Set<Employee> employeeList1 = new HashSet<Employee>();         //Creating a HashSet for storing employee details for different departments
		Employee e1 = new Employee("Steve",5000);      
    		Employee e2 = new Employee("Rob",6000);
		Employee e3 = new Employee("Peter",5000);      
    		Employee e4 = new Employee("Robinson",6000);

		employeeList1.add(e1);
		employeeList1.add(e2);
		employeeList1.add(e3);
		employeeList1.add(e4);

		Set<Employee> employeeList2 = new HashSet<Employee>();
		Employee e5 = new Employee("Ross",7000);    
    		Employee e6 = new Employee("Joey",8000);
		Employee e7 = new Employee("Chandler",7000);    
    		Employee e8 = new Employee("Mark",8000);

		employeeList2.add(e5);
		employeeList2.add(e6);
		employeeList2.add(e7);
		employeeList2.add(e8);

		Set<Employee> employeeList3 = new HashSet<Employee>();
		Employee e9 = new Employee("Ben",9000);    
    		Employee e10 = new Employee("Marcus",10000);
		Employee e11 = new Employee("Mike",9000);    
    		Employee e12 = new Employee("Harvey",10000);

		employeeList3.add(e9);
		employeeList3.add(e10); 
		employeeList3.add(e11);
		employeeList3.add(e12);      

		Set<Employee> employeeList4 = new HashSet<Employee>();
		Employee e13 = new Employee("Brad",11000);    
    		Employee e14 = new Employee("David",12000);
		Employee e15 = new Employee("Michael",11000);    
    		Employee e16 = new Employee("Bruce",12000);

		employeeList4.add(e13);
		employeeList4.add(e14);
		employeeList4.add(e15);
		employeeList4.add(e16);         

	//Creating a HashMap, where the keys are the Department IDs mentioned above and the values are the HashSets created for respective departments 

		Map<Integer,Set<Employee>> map=new HashMap<Integer,Set<Employee>>();            
    
		map.put(1,employeeList1);   //Adding the key with corresponding HashSet
		map.put(2,employeeList2);
		map.put(3,employeeList3);
		map.put(4,employeeList4);

		System.out.println("List:");     

      		for(Map.Entry<Integer,Set<Employee>> m : map.entrySet())            //Printing details using entrySet() method
		{     
        		int key = m.getKey();

			if(key == 1)         //For respective keys, the Department name and the employee details for the particular department are printed.
			{
				System.out.println("For key " + key + ", The department is Networking.\n");
				System.out.println("The employee details are:\n");
				e1.print();
				e2.print();
				e3.print();
				e4.print();
			}
			else if(key == 2)
			{
				System.out.println("\nFor key " + key + ", The department is Accounts.\n");
				System.out.println("The employee details are:\n");
				e5.print();
				e6.print();
				e7.print();
				e8.print();
			}
			else if(key == 3)
			{
				System.out.println("\nFor key " + key + ", The department is Marketing.\n");
				System.out.println("The employee details are:\n");
				e9.print();
				e10.print();
				e11.print();
				e12.print();
			}
			else if(key == 4)
			{
				System.out.println("\nFor key " + key + ", The department is Technology.\n");
				System.out.println("The employee details are:\n");
				e13.print();
				e14.print();
				e15.print();
				e16.print();
			}
		}
	}
}


