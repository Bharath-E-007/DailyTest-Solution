import java.util.Scanner;

public class twoMatrixExcahangeVowels {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int row = sc.nextInt(), col = sc.nextInt();
        String[][] int1 = new String[row][col];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                int1[i][j] = sc.next();
            }
        }

        String[][] str1 = new String[row][col];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                str1[i][j] = sc.next();
            }
        }

        for (int i = 0; i < row * col; i++) {
            int r = i / col, c = i % col;
            if (Isvowels(str1[r][c])) {
                String temp = str1[r][c];
                str1[r][c] = int1[r][c];
                int1[r][c] = temp;
            }
        }

        PrintArray(int1);
        PrintArray(str1);

        sc.close();
        System.exit(0);
    }

    public static boolean Isvowels(String str) {
        return "AEIOUaeiou".contains(str);
    }

    public static void PrintArray(String[][] str) {
        for (String[] arr : str) {
            for (String val : arr) {
                System.out.print(val + " ");
            }
            System.out.println();
        }
    }
}
/*Accetpt The Two Matrix one Matrix Contains Integer And Another Contains Characater The Swap each Vowels in
 * The Character Matrix With The Corresponding Integer Matrix And Print The Resultant Matrices As Output.
 */
