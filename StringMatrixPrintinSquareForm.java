import java.util.Scanner;

public class StringMatrixPrintinSquareForm {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt(), col = sc.nextInt();
        String str[][] = new String[row][col];

        for (int i = 0; i < row * col; i++) {
            str[i / col][i % col] = sc.next();
        }

        int row1 = sc.nextInt(), col1 = sc.nextInt();
        sc.close();

        String str1 = str[row1 - 1][col1 - 1];
        int len = (int) Math.sqrt(str1.length());

        for (int i = 0; i < len; i++) {
            for (int j = 0; j < len; j++) {
                System.out.print(str1.charAt(i * len + j) + " ");
            }
            System.out.println();
        }
    }
}
/*
   Example Input/Output 1:

Input

3 3

four char skillrack

days education well

nutrition moon ELECTROGALVANIZE

2 2

Output:

edu

cat

ion

Explanation:

Here X=2 and Y=2, the string value that occurs in the position (2, 2) in the given matrix is education.

The length of the string education is 9. So the characters in the string are printed as a square

matrix of size 3*3.

edu

cat

ion

Example Input/Output 2:

Input

3 3

four char skillrack

days education well

nutrition moon ELECTROGALVANIZE

3 3

Output:

ELEC

TROG

ALVA

NIZE
 */