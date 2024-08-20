public class FibonacciWhileLoop {
    public static void main(String[] args) {
        int n = 10;  // Number of Fibonacci numbers to print
        int t1 = 0, t2 = 1;

        int count = 1;  // To keep track of how many numbers have been printed

        // Print the first two Fibonacci numbers
        System.out.print("First " + n + " Fibonacci numbers: " + t1 + ", " + t2);

        // Use a while loop to calculate the rest of the numbers
        while (count <= n - 2) {
            int sum = t1 + t2;
            System.out.print(", " + sum);
            t1 = t2;
            t2 = sum;
            count++;
        }
    }
}
