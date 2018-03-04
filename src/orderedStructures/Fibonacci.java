package orderedStructures;

public class Fibonacci<E> extends Progression<E> {

	private double prev; 
	
	public Fibonacci() { 
		this(1); 
		prev = 0; 
	}
	private Fibonacci(double first) {
		super(first);
	}

	@Override
	public double nextValue() {
      
	
		current = current+ prev;
		prev = current - prev;
		
		return current;
	}
	
	@Override	
	public double firstValue() { 
		double value = super.firstValue(); 
		prev = 0; 
		return value; 
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
