import java.util.Scanner;

public class colplacearray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt(), col = sc.nextInt();
        char alpha[][] = new char[row][col];

        for (int i = 0; i < row; i++) 
            for (int j = 0; j < col; j++) 
                alpha[i][j] = sc.next().charAt(0);

        sc.nextLine();
        String str = sc.nextLine();
        char first = str.charAt(0);

        for (int j = 0; j < col; j++) {
            int i = 0;
            for (i = 0; i <= row - str.length(); i++) {
                if (alpha[i][j] == first) {
                    break;
                }
            }
            if (row - i >= str.length()) {
                for (char c : str.toCharArray()) {
                    alpha[i++][j] = c;
                }
            }
        }

        for (char[] arr : alpha) {
            for (char val : arr) 
                System.out.print(val + " ");
            System.out.println();
        }
        sc.close();
    }
}
/*
 * Example Input/Output 1:

Input:

8 5

mbouo

remyt

ktygm

otacp

dxwoo

zleau

cknoi

dfozg

open

Output:

mbouo

repyp

ktege

otnen

pxwoo

elepu

nknei

dfong
 */
