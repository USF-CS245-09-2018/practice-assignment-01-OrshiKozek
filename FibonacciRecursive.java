public class FibonacciRecursive implements Fibonacci {
	
	public static int fibonacci(int n){
        int Fib1 = 0;
        int Fib2 = 1;
        
	    if (n == 1){
		    return Fib1; 
	    }
	    else if(n == 2){
		    return Fib2;
	    }
	    else{
		    return recursiveFib(n-1) + recursiveFib(n-2);
        }
    }
}