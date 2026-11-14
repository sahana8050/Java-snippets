public class Amstrong_number {
    



    public static void main(String[] args) {

        // Number to check
        int num = 2;

        // Store the original number
        int original = num;

        // Variable to store the sum
        int sum = 0;

        // Repeat until the number becomes 0
        while (num > 0) {

            // Get the last digit
            int digit = num % 10;

            // Cube the digit and add it to sum
            sum = sum + (digit * digit * digit);

            // Remove the last digit
            num = num / 10;
        }

        // Check if the sum is equal to the original number
        if (sum == original) {
            System.out.println("Armstrong Number");
        } else {
            System.out.println("Not Armstrong Number");
        }
    }
}