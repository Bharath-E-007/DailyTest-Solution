import java.util.Scanner;

public class SumOfBigAndSmall {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt(); // Read number of values

        long sum = 0; // Variable to accumulate the result

        for (int i = 0; i < num; i++) {
            int val = sc.nextInt(); // Read each number

            // Initialize smallest and largest digit
            int small = Integer.MAX_VALUE;
            int big = Integer.MIN_VALUE;

            int v1 = val;
            int count = 0;

            // Find the smallest and largest digit
            while (v1 > 0) {
                int v2 = v1 % 10; // Extract the last digit
                small = Math.min(small, v2); // Update smallest digit
                big = Math.max(big, v2); // Update largest digit
                v1 /= 10; // Remove the last digit
                count++; // Count the number of digits
            }

            // Add to sum the calculated value
            sum += ((big * (int) Math.pow(10, count) + val) * 10 + small);
        }

        System.out.println(sum); // Output the result

        sc.close(); // Close the scanner
    }
}
