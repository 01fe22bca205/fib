public class fibonacci {

    // Function to print the first n Fibonacci numbers
    public static void printFibonacci(int n) {
        int num1 = 0, num2 = 1;
        
        // Print the first n Fibonacci numbers
        for (int i = 1; i <= n; ++i) {
            System.out.print(num1 + " ");
            
            // Compute the next term
            int nextTerm = num1 + num2;
            num1 = num2;
            num2 = nextTerm;
        }
    }

    public static void main(String[] args) {
        int n = 10; // Number of terms to print
        System.out.println("First " + n + " Fibonacci numbers:");
        printFibonacci(n);
    }
}
