package orderedStructures;

import java.util.Scanner;

public class Arithmetic<E> extends Progression<E> {
	private double commonDifference;
	private double totalCommon;
	private double totalFirst; 
	
	public Arithmetic(double firstValue, double commonDifference) { 
		super(firstValue); 
		this.commonDifference = commonDifference; 
		
	}
	
	@Override
	public double nextValue() throws IllegalStateException {
		if (this.check==false){
			throw new IllegalStateException("The method firstValue() has not been properly implemented");
		}
		current = current + commonDifference; 
		return current;
	}

	public String toString(){
		return "Arith" + "("+ (int)this.firstValue() + ","+ (int)this.commonDifference + ")";
	}

	public double getTerm(int n) throws IndexOutOfBoundsException { 
		
		if (n <= 0) 
			throw new IndexOutOfBoundsException("printAllTerms: Invalid argument value = " + n); 

		
		return (this.firstValue()+ (this.commonDifference * (n-1))); 
		
		
	}
	
	@Override
	public boolean Equals(Progression other) {
		return this.firstValue() == other.firstValue() && this.commonDifference == other.commonDifference();
	}

	@Override
public Progression add(Progression p) {

		 totalFirst = this.firstValue() + p.firstValue();
		totalCommon = this.commonDifference + p.commonDifference();
		
		return  new Arithmetic(totalFirst, totalCommon);
	}

	@Override
	public Progression substract(Progression p) {
		 totalFirst = this.firstValue() - p.firstValue();
			totalCommon = this.commonDifference - p.commonDifference();
			
			return  new Arithmetic(totalFirst, totalCommon);
	}
}
