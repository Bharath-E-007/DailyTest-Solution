import java.util.Scanner;

public class folderThematrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int row = sc.nextInt(), col = sc.nextInt();
        int mat[][] = new int[row][col];

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                mat[i][j] = sc.nextInt();
            }
        }

        int k = sc.nextInt();
        int start = k - 1, end = k;

        while (start >= 0 || end < row) {
            if (start >= 0 && end < row) {
                for (int i = 0; i < col; i++) {
                    System.out.print(mat[start][i] + mat[end][i] + " ");
                }
            } else if (start >= 0) {
                for (int i = 0; i < col; i++) {
                    System.out.print(mat[start][i] + " ");
                }
            } else {
                for (int i = 0; i < col; i++) {
                    System.out.print(mat[end][i] + " ");
                }
            }
            start--;
            end++;
            System.out.println();
        }

        sc.close();
        System.exit(0);
    }
}

/* 
Example Input/Output 1:

Input:

53

12.30

56 12

9490

62 30

78 55

4

+

←

Output:

13 10 85

9 4 90

5 6 12

12.30

Explanation:

The matrix must be folded from the fourth row downwards. So the 4th row will merge with the 5th row. After folding the matrix downwards starting from 4th row, the matrix becomes

13 10 85

9490

56 12

1230
*/