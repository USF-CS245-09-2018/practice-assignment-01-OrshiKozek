public class FactorialRecursive implements Factorial {
	
	public static int factorial(int n){
	    if (n == 0){
		    return 1;
	    }
	    else if(n == 1){
		    return 1;
	    }
	    else{
		    return n*recursiveFact(n-1);
        }
    }
}