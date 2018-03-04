package TesterClasses;

import orderedStructures.Arithmetic;
import orderedStructures.Fibonacci;
import orderedStructures.Geometric;
import orderedStructures.Progression;

public class ProgressionTester1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Progression p; 
		Progression tmp; //A temporary variable used to store a new progression that I randomly picked
		Progression e; //A variable to store the sum of the progressions

		System.out.println("Testing Fibonaci:"); 
		p = new Fibonacci(); 
		p.printAllTerms(20);
		
		
		System.out.println("\n\n\nTesting Geometric:"); 
		p = new Geometric(2, 3); 
		p.printAllTerms(20);
		
		System.out.println("\n\n\nTesting Arithmetic:"); 
		p = new Arithmetic(2, 3); 
		p.printAllTerms(5);
		
	
		
		
		System.out.println("\n\n\nTesting Arithmetic:"); 
		p = new Arithmetic(4, 5);
		
		tmp = new Arithmetic(2, 9); 
	 
		e = p.add(tmp);//can be also used like p.add(new Arithmetic(2, 9))
		
		//e = p.substract(tmp);//can be also used like p.substract(new Arithmetic(2, 9)), works
		
		p.printAllTerms(5);
		
		System.out.println();	
		
		tmp.printAllTerms(5);
		
		System.out.println();//To test if add / remove (Progression other) is working for Arithmetic. Not implemented on Fibonnaci or Geometric
		e.printAllTerms(5);//To test if add / remove (Progression other) is working for Arithmetic. Not implemented on Fibonnaci or Geometric
		
		
		
	}

}
