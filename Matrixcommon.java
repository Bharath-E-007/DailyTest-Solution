import java.util.Scanner;

public class Matrixcommon {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m1[][] = new int[n][n];
        int m2[][] = new int[n][n];

        for (int i = 0; i < n * n; i++)
            m1[i / n][i % n] = sc.nextInt();

        for (int j = 0; j < n * n; j++)
            m2[j / n][j % n] = sc.nextInt();

        int sum = -1, count = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (m1[i][j] == m2[i][j]) {
                    int arr[] = c(m1, m2, i, j);
                    if (arr.length >= 2 && count < arr[0]) {
                        count = arr[0];
                        sum = arr[1];
                    }
                }
            }
        }
        System.out.println(sum);
    }

    public static int[] c(int[][] m1, int[][] m2, int i, int j) {
        int r = 0, c = 0;
        for (int i1 = i; i1 < m1.length && m1[i1][j] == m2[i1][j]; i1++)
            r++;
        for (int j1 = j; j1 < m1.length && m1[i][j1] == m2[i][j1]; j1++)
            c++;

        if (r <= 1 || c <= 1)
            return new int[]{0};

        int sum = 0, min = Math.min(r, c);
        for (int i1 = 0; i1 < min; i1++) {
            int r1 = i1 / min, c1 = i1 % min;
            if (m1[i + r1][j + c1] != m2[i + r1][j + c1])
                return new int[]{0};
            sum += m1[i + r1][j + c1];
        }
        return new int[]{min, sum};
    }
}
/*
 * Output Format:

The first line contains the sum of integers in the largest common middle square submatrix or -1.

Example Input/Output 1:

Input

4

5884

7799

3468

5114

6983

8792

4463

6751

Output:

26

Explanation:

The largest common middle submatrix is given below.

79

46

The sum of integers in the above submatrix is 26 (7 +9+4+6).

So 26 is printed as the output.
 */
