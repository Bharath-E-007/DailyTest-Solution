import java.util.*;

public class Hello {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int size = sc.nextInt();
        sc.nextLine();

        String str[] = new String[size];
        str[0] = sc.nextLine();

        int row = str[0].length(), col = 1;

        for (int i = 1; i < size; i++) {
            str[i] = sc.nextLine();
            col = ((str[i].length() - 1) / row) + 1;
        }

        char ch[][] = new char[row][col];

        for (int i = 0; i < row; i++) {
            Arrays.fill(ch[i], '*');
        }

        int c1 = 0;

        for (int i = 0; i < size; i++) {
            int i1 = 0, ind = 0;

            while (ind < str[i].length()) {
                ch[i1++][c1] = str[i].charAt(ind++);

                if (i1 == row) {
                    i1 = 0;
                    if (ind < str[i].length()) {
                        c1++;
                    }
                }
            }
        }

        for (char[] var1 : ch) {
            for (char c2 : var1) {
                System.out.print(c2 + " ");
            }
            System.out.println();
        }

        sc.close();
        System.exit(0);
    }
}
/*
 * Example Input/Output 1:

Input:

3

photos

youtube

facebook

Output:

pyefo

horak

ou*c*

tt*he

ou*b*

sb*o*

Explanation:

The length of the first string photos is 6, so the number of rows is R = 6.

In the 1st column, all the characters in the string photos are printed.

In the 2nd column, the first 6 characters in the string youtube are printed.

In the 3rd column, the only remaining character in the string youtube is printed. The empty spaces in 3rd column are printed as asterisks.

In the 4th column, the first 6 characters in the string facebook are printed.

In the 5th column, the remaining 2 characters in the string facebook are printed. The empty spaces in 5th column are printed as asterisks.

Hence the output is

pyefo

horak

ou*c*

tt*he

ou*b*

sb*o*
 */