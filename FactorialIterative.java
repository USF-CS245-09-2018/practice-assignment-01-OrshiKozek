public class FactorialIterative implements Factorial{

	public int factorial(int n){
	    int result = 1;
        for (int i = n; i > 0; i--){
            result = result * i;
        }    
	    return result;
    }
}