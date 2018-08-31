public class FibonacciRecursive implements Fibonacci {
	
	public int fibonacci(int n){
        int Fib1 = 0;
        int Fib2 = 1;
        
	    if (n == 1){
		    return Fib1; 
	    }
	    else if(n == 2){
		    return Fib2;
	    }
	    else{
		    return fibonacci(n-1) + fibonacci(n-2);
        }
    }
}