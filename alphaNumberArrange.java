import java.util.Scanner;

public class alphaNumberArrange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt(), col = sc.nextInt();
        String str[][] = new String[row][col];
        String str1[][] = new String[row][col];

        for (int i = 0; i < row; i++)
            for (int j = 0; j < col; j++)
                str[i][j] = sc.next();

        for (int j = 0; j < col; j++) {
            int k = 0;
            for (int i = 0; i < row; i++)
                if (Character.isDigit(str[i][j].charAt(0)))
                    str1[k++][j] = str[i][j];

            for (int i = 0; i < row; i++)
                if (Character.isAlphabetic(str[i][j].charAt(0)))
                    str1[k++][j] = str[i][j];
        }

        for (String[] arr : str1) {
            for (String val : arr)
                System.out.print(val + " ");
            System.out.println();
        }
        sc.close();
    }
}
/*
 * Example Input/Output 1:

Input:

4 6

12 45 b 78 15 32

34 n 54 d y p

k 45 60 t 80 90

a 50 gr 15 w

Output:

k n b d y p

a 45 g t 15 w

12 45 54 г 80 32

34 50 60 78 15 90

Explanation:

Here R = 4 and C = 6.

After separating the alphabets and the integers in the columns based on the given conditions,

the matrix becomes

k n b d y p

a 45 g t 15 w

12 45 54 r 80 32

34 50 60 78

15 90
 */
