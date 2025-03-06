import java.util.*;

class Pair {
    int x;
    int y;

    public Pair(int x, int y) {
        this.x = x;
        this.y = y;
    }
}

public class matrixreplace {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int row = sc.nextInt(), col = sc.nextInt();
        char ch[][] = new char[row][col];

        Queue<Pair> queue1 = new LinkedList<>();
        Queue<Pair> queue2 = new LinkedList<>();

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                ch[i][j] = sc.next().charAt(0);
                if (ch[i][j] == '*') {
                    queue1.add(new Pair(i, j));
                }
            }
        }

        int count = 0;

        loop1:
        for (int i = row - 1; i >= 0; i--) {
            for (int j = 0; j < col; j++) {
                if (ch[i][j] != '*') {
                    queue2.add(new Pair(i, j));
                    count++;
                }
                if (count == queue1.size()) {
                    break loop1;
                }
            }
        }

        while (!queue1.isEmpty()) {
            Pair p1 = queue1.remove();
            Pair p2 = queue2.remove();
            ch[p1.x][p1.y] = ch[p2.x][p2.y];
        }

        for (char[] arr : ch) {
            for (char val : arr) {
                System.out.print(val + " ");
            }
            System.out.println();
        }

        sc.close();
        System.exit(0);
    }
}
/*54

arj

g**b

FVtY

aVRQ

**xL

Output

axrJ

glab

FVtY

aVRQ

VRxL

Explanation:

After replacing the asterisks (from the first row to the last row) with the alphabets (from the last row to the first row), the matrix becomes

axrJ

glab

FVtY

aVRQ

VRxL */
