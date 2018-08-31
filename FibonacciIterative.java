public class FibonacciIterative implements Fibonacci {

    public static int fibonacci(int n){
        int fib1 = 0;
        int fib2 = 1;
        int result = 0;

        if (n == 0)
            return fib1;
        else if (n == 1)
            return fib2;
        else {
            for (int i = n; i > 1; i--) {
                result = fib1+fib2; //the next number is the sum of the previous two
                fib1 = fib2; //n-2 becomes the value of n-1
                fib2 = result; // n-1 becomes the value of the next fib number, ie nextfib
            }
        }
    }
}