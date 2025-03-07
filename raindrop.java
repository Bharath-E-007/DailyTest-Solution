import java.util.*;

public class raindrop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int row = sc.nextInt(), col = sc.nextInt(), x = sc.nextInt();
        int mat[][] = new int[row + 1][col + 1];

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                mat[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < col; i++) {
            int delay = x / mat[row][i];
            while (delay > 0) {
                int temp = mat[row - 1][i];
                for (int j = row - 1; j > 0; j--) {
                    mat[j][i] = mat[j - 1][i];
                }
                mat[0][i] = temp;
                delay--;
            }
        }

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(mat[i][j] + " ");
            }
            System.out.println();
        }

        sc.close();
    }
}
/*
Example Input/Output 1:

Input:

5 7 4

0 3 2 0 3 2 0

1 4 3 1 4 3 1

2 0 4 2 0 4 2

3 1 0 3 1 0 3

4 2 1 4 2 1 4

2 1 1 3 1 1 2

Output:

3 4 3 4 4 3 3

4 0 0 0 0 0 4

0 1 1 1 1 1 0

1 2 2 2 2 2 1

2 3 3 3 3 3 2

Explanation:

Here T = 4.

1st and 7th columns: Delay = 2 seconds. So the lights in the columns 1 and 7 change their state every 2 seconds.

2nd, 3rd, 5th and 6th columns: Delay = 1 second. So the lights in the columns 2, 3, 5 and 6 change their state every second.

4th column: Delay = 3 seconds. So the lights in the column 4 change their state every 3 seconds.

After 4 seconds, the state of the rain drop lights becomes

3 4 3 4 4 3 3

4 0 0 0 0 0 4

0 1 1 1 1 1 0

1 2 2 2 2 2 1

2 3 3 3 3 3 2
*/
