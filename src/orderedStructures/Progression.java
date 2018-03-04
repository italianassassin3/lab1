package orderedStructures;

import java.security.InvalidParameterException;
import java.util.ArrayList;

import interfaces.OrderedNumberStructure; 

public abstract class Progression<E> implements OrderedNumberStructure, Combinable{
	private double first;       // the first value
	protected double current;

	private int nValue;
    // current is the current value of the object � it changes
	// to �the value of the next term� whenever method 
	// �nextValue� is applied to the object.
    
	public boolean check = false;
	private double commonDifference;
	private double commonFactor;
	
	public Progression(double first) { 
		this.first = first; 
		current = first;
		check = true;
		nValue =0;
		this.commonDifference = first;
		
	}

	public double firstValue() { 
		current = first; 
		return current; 
	}
	
	public double commonFactor() {
		this.commonFactor = this.nextValue() - this.firstValue();
		return this.commonFactor;
	}

	public double commonDifference() { 
		this.commonDifference = this.nextValue() - this.firstValue();
		return this.commonDifference; 
	}
	
	public void printAllTerms(int n) throws InvalidParameterException {
		if (n <= 0) 
			throw new InvalidParameterException("printAllTerms: Invalid argument value = " + n);  

		System.out.println("Index --- Term Value"); 
		for (int i=1; i<=n; i++) { 
			System.out.println((i) +  "---" + this.getTerm(i));  
		}
	}

	
	public double getTerm(int n) throws IndexOutOfBoundsException { 
		if (n <= 0) 
			throw new IndexOutOfBoundsException("printAllTerms: Invalid argument value = " + n); 
nValue = n;
		double value = this.firstValue(); 
		for (int i=1; i<n; i++) 
			value = this.nextValue(); 
		return value; 
	}
	
	
	public boolean Equals(Progression other) {
		if(!( other instanceof Progression)) {
			System.out.println("false");//to test if its working properly
			return false;
			
		}
		if(other == this) {
			System.out.println("true");//to test if its working properly
			return true;
		}
		if(other == null ) {
			System.out.println("false");//to test if its working properly
			return false;
		}
			
	
	
	return ((Progression)other).equals(this);
	
	} 
	
	public abstract double nextValue();

	
	
}
