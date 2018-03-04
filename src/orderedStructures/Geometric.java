package orderedStructures;

public class Geometric<E> extends Progression<E> {

	private double commonFactor; 
	

	public Geometric(double firstValue, double commonFactor) { 
		super(firstValue); 
		this.commonFactor = commonFactor; 
	}
	
	@Override
	public double nextValue() {
		if (this.check==false){
			throw new IllegalStateException("The method firstValue() has not been properly implemented");
		}
		current = current * commonFactor; 
		return current;
	}

public String toString(){
	return "Geom" + "("+ (int) this.firstValue() + ","+ (int)this.commonFactor + ")";
}

public double getTerm(int n) throws IndexOutOfBoundsException { 
	
	if (n <= 0) 
		throw new IndexOutOfBoundsException("printAllTerms: Invalid argument value = " + n); 

	
	return (this.firstValue()*(Math.pow(this.commonFactor, n-1))); 
	
	
}

@Override
public boolean Equals(Progression other) {
	return this.firstValue() == other.firstValue() && this.commonFactor == other.commonFactor();
}


@Override
public Progression add(Progression p) {
	// TODO Auto-generated method stub
	return null;
}

@Override
public Progression substract(Progression p) {
	// TODO Auto-generated method stub
	return null;
}



}
