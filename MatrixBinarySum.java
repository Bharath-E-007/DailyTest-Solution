import java.util.*;

public class MatrixBinarySum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int row = sc.nextInt(), col = sc.nextInt();
        
        int[][] matrix = new int[row][col];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
        
        long total = 0;
        for (int j = 0; j < col; j++) {
            long topToBottom = 0;
            long bottomToTop = 0;

            for (int i = 0; i < row; i++) {
                topToBottom = (topToBottom << 1) | matrix[i][j];
                bottomToTop = (bottomToTop << 1) | matrix[row - 1 - i][j];
            }

            total += Math.max(topToBottom, bottomToTop);
        }
        System.out.println(total);
        
        sc.close();
    }
}
/*
 * Input Format:

The first line contains R and C separated by a space. The next R lines, each contains C integer values separated by a space.

Output Format:

The first line contains an integer representing the sum of all the C integers obtain matrix.

Example Input/Output 1:

Input:

56

0 0 1 1 0 1

0 1 1 1 1 1

0 0 1 0 1 1

0 1 1 0 0 0

1 1 1 1 0 0

Output:

138

Explanation:

1st column -> 16 (bottom to top).

2nd column -> 26 (bottom to top).

3rd column -> 31 (top to bottom or bottom to top).

4th column -> 25 (top to bottom).

5th column -> 12 (top to bottom).

6th column -> 28 (top to bottom).

The sum is 16+26 +31 + 25 + 12 + 28 = 138.
 */
