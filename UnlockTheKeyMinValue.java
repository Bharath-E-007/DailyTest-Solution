import java.util.Scanner;

public class UnlockTheKeyMinValue {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input two numeric strings
        System.out.print("Enter the first number: ");
        String num1 = sc.next();
        System.out.print("Enter the second number: ");
        String num2 = sc.next();

        int total = 0;

        // Ensure both strings are of the same length
        if (num1.length() != num2.length()) {
            System.out.println("Error: Both numbers must have the same length.");
            return;
        }

        // Calculate the minimum rotation value for each digit
        for (int i = 0; i < num1.length(); i++) {
            int value1 = num1.charAt(i) - '0'; // Convert char to int
            int value2 = num2.charAt(i) - '0'; // Convert char to int
            int v = Math.abs(value1 - value2);
            total += Math.min(v, 10 - v); // Minimum rotations
        }

        // Output the total minimum rotations
        System.out.println("Total minimum rotations: " + total);

        sc.close();
    }
}

/*
   Example Input/Output 1:

Input: 2850 4007

Output: 12

Explanation:

S1 = 2850

S * 2 = 4001 The minimum number of moves required to open the lock is 12(2 + 2 + 5 + 3) 2 -> 4 = 2(2 -> 3 -> 4) 8 -> 0 = 2(8 -> 9 -> 0) 5 0 Rightarrow 5(5 -> 6 -> 7 -> 8 -> 9 -> 0or * 5 -> 4 -> 3 -> 2 -> 1 -> 0) 0 -> 7 = 3(0 -> 9 -> 8 -> 7)

Example Input/Output 2:

Input: 463199 647310

Output: 13
 */