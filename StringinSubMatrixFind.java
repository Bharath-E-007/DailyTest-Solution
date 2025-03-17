import java.util.Scanner;

public class StringinSubMatrixFind {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int row = sc.nextInt(), col = sc.nextInt();
        char ch[][] = new char[row][col];

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                ch[i][j] = sc.next().charAt(0);
            }
        }

        sc.nextLine();
        String str = sc.nextLine();

        loop1:
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (ch[i][j] == str.charAt(0) && check(str, ch, i, j)) {
                    break loop1;
                }
            }
        }
    }

    public static boolean check(String str, char[][] c, int i, int j) {
        int r1 = i, c1 = j, k = 0;
        while (c1 < c[0].length && c[r1][c1] == str.charAt(k)) {
            c1++;
            k++;
        }

        if ((k == 1 && str.length() > c.length - i) || str.length() % k != 0)
            return false;

        int ind = 0;
        for (int ii = i; ii < i + str.length() / k; ii++) {
            for (int jj = j; jj < j + k; jj++) {
                if (str.charAt(ind++) != c[ii][jj]) {
                    return false;
                }
            }
        }

        for (int ii = i; ii < i + str.length() / k; ii++) {
            for (int jj = j; jj < j + k; jj++) {
                System.out.print(c[ii][jj] + " ");
            }
            System.out.println();
        }
        return true;
    }
}
/*Input:

For quick access, place your favorites here on the favorites bar. Ma

99

xxxwnvacc

iwzlginat

dbyfqionw

gjnquhjgo

wyeumvwuw

qrfmyhird

jmtvaccin

cybations

qgvktojbt

vaccinations

Output

vaccin

ations

Example Input/Output 3:

Input

8 5

AOQEH

ITEsm

yMPeo

BSeve

bJHey

XDFnJ

vlans

Seven

Seven

Output:

Seven */
