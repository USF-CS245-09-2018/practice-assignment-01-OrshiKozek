//package edu.usfca.cs.cs245;// I must get rid of this in order for the program to work

public interface Factorial {
	
	/** 
	 * This is the factorial function, which calculates n!
	 * n! = n * (n-1)! (recursive) -OR- n! = n * (n-1) * (n-2) * ... * 1 (iterative)
	 * 
	 * @param n
	 * @return n!
	 */
	public int factorial(int n);
}
