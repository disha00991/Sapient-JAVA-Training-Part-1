package com.sapient.training.test;

public class Tax {
	double gross;
	String state;
	int dep;//no.of dependents
	
	//constructors
	public Tax(double gross, String state) {//used if only 2 parameters are sent, dep = 1 assumed
		this(1);//calling constructor within constructor
		this.gross = gross;
		this.state = state;
	}
	
    public Tax(double gross, String state, int dep) {//used if all 3 parameters are sent
    	this(dep);
    	this.gross = gross;
		this.state = state;
	}

	public Tax(int dep) {
		this.dep = dep;
	}
	
	//method
	public double tax_amt() {
		double tax = 0.0;
		//some formula according to gross , state, dep
		return tax;
	}
	public static void main(String[] args) {
		//Tax obj1 = new Tax(5000, "India");//eg for 1st constructor
		//Tax obj2 = new Tax(6000,"USA", 4);//eg for 2nd constructor
		
		//print tax amount
		//System.out.println(obj1.tax_amt());
		//System.out.println(obj2.tax_amt());
	}

}
