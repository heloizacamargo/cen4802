/**
 * This class is used to calculate the nth term in the Fibonacci sequence.
 * 
 * @author Heloiza Camargo
 */
public class Fibonacci {
    
    public static void main(String args[]){
        int n = 10;
        int result = fibonacci(n);
        System.out.println("The " + n + "th term in the Fibonacci sequence is: " + result);
    }

    /**
     * Calculates the nth term in the Fibonacci sequence.
     *
     * @param n The position of the term to be calculated (non-negative integer).
     * @return The nth term in the Fibonacci sequence.
     */
    public static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }
}
