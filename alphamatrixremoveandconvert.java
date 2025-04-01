import java.util.Scanner;

public class alphamatrixremoveandconvert {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        char c1 = sc.next().charAt(0), c2 = sc.next().charAt(0);

        char ch[][] = new char[5][5];
        char alpha = 'a';

        int r = 0, c = 0;

        for (int i = 0; i < 25; i++) {
            if (alpha == c1) {
                alpha++;
                continue;
            }
            ch[i / 5][i % 5] = alpha;

            if (alpha == c2) {
                r = i / 5;
                c = i % 5;
            }

            alpha++;
        }

        for (int i = 0; i < 9; i++) {
            if (valid(r + i / 3, c + i % 3)) {
                ch[r + i / 3][c + i % 3] ^= 32;
            }
        }

        ch[r + 1][c + 1] ^= 32;

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(ch[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static boolean valid(int i, int j) {
        return (i >= 0 && i < 5) && (j >= 0 && j < 5);
    }
}
/*Remove The First Character and Convert The All Characetr Presented Surronded The Second Alphabetic */
