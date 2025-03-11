import java.util.Scanner;

public class charArrayreplace {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt(), col = sc.nextInt();
        char ch[][] = new char[row][col];

        for (int i = 0; i < row; i++)
            for (int j = 0; j < col; j++)
                ch[i][j] = sc.next().charAt(0);

        sc.nextLine();
        String str = sc.nextLine();

        int i = 0, j = 0;
        loop1:
        for (; i < row; i++) {
            for (j = 0; j < col; j++) {
                if (ch[i][j] == str.charAt(0))
                    break loop1;
            }
        }

        for (char c : str.toCharArray()) {
            ch[i][j++] = c;
            if (j == col) {
                j = 0;
                i++;
            }
            if (i == row)
                break;
        }

        for (char[] arr : ch) {
            for (char val : arr)
                System.out.print(val + " ");
            System.out.println();
        }

        sc.close();
    }
}
/*Example Input/Output 2:

Input:

33

esz

zSf

iwc

Skill Rack

Output:

Rac

kSk

ill

Example Input/Output 3:

Input:

45

aSrpk

YIDKF

homxw

jiQhp

window

Output:

aSrpk

YIDKF

homxw

indow */