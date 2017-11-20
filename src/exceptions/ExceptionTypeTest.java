/*
Exercise:
1. To create an Object reference, pass its value as null, observe calling a method and observing NullPointerException
2. To call wait() method of Object class and observe compile time error and subsequent adjustment using try-catch
*/

import java.util.*;

class ExceptionType              
{
	void exceptionType()           //Creating a method which the object of this class can call 
	{
		System.out.println("This is the method in ExceptionType class.");
	}
}

public class ExceptionTypeTest
{
	public static void main(String args[])
	{
		ExceptionType et = new ExceptionType();       //Creating a reference variable et and initializing its value as null
		et = null;

		//NullPointerException occurs, but because it is an unchecked Exception, we don't need to compulsarily give try and catch statements.

		et.exceptionType();      

		try
		{
			//For, wait() method of Object class however, InterruptedException occurs which is a checked Exception, so we compulsarily need to give try and catch statements.

			Object obj = new Object();        
			obj.wait();
		}
		catch(InterruptedException e)
		{
			System.out.println(e);
		}
	}
}