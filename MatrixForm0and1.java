import java.util.*;

public class MatrixForm0and1 {

public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    int row = sc.nextInt(), col = sc.nextInt();

    char alpha[][] = new char[row][col];

    for (int i = 0; i < row; i++) {
        for (int j = 0; j < col; j++) {
            alpha[i][j] = sc.next().charAt(0);
        }
    }

    int k = sc.nextInt();

    int r1 = row + (k * 2), c1 = col + (k * 2);

    int start = 1;

    for (int i = 0; i < r1; i++) {
        int s = start;
        for (int j = 0; j < c1; j++) {
            if ((i >= k && i < k + row) && (j >= k && j < col + k)) {
                System.out.print(alpha[i - k][j - k] + " ");
            } else {
                System.out.print(s + " ");
            }
                if ((j + 1) % k == 0) s ^= 0;

        }
        System.out.println();
        if ((i + 1) % k= 0) start^=1;
    }
}
// Removed duplicate and malformed code
}
/*
 * Example Input/Output 3:

Inputt

46

ayyFds

socach

OVavil

PGSVCT

2

Output:

1100110011

1100110011

00aYyFds00

00socAcm00

110Vavil11

11pGsvCT11

0011001100

0011001100

Example Input/Output 4:

Inputt

48

aYyFdsmp

socAcadf

OVaviloe

PGsvCTrj

2

Outputt

110011001100

110011001100

00aYyFdsmp11

00socAcndf11

110Vavi Loe00

11pGsvCTrj00

001100110011

001100110011

Max Executlinie Time Limit: 50 millinecs
 */