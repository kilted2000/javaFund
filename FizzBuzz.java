public class FizzBuzz {
    public static void main(String[] args) {
        for (int i = 1; i <= 100; i++) { // Looping through numbers 1 to 100
            // If number is divisible by 3 and 5, print "FizzBuzz"
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("FizzBuzz");
            }
            // If number is divisible by 3, print "Fizz"
            else if (i % 3 == 0) {
                System.out.println("Fizz");
            }
            // If number is divisible by 5, print "Buzz"
            else if (i % 5 == 0) {
                System.out.println("Buzz");
            }
            // If number is not divisible by either 3 or 5, print the number
            else {
                System.out.println(i);
            }
        }
    }
}
