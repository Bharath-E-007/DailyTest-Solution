import java.util.*;
public class RotateABorderMatrix {
   
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int R = sc.nextInt();
        int C = sc.nextInt();

        int[][] M1 = new int[R][C];
        int[][] M2 = new int[R][C];

        for (int i = 0; i < R; i++)
            for (int j = 0; j < C; j++)
                M1[i][j] = sc.nextInt();

        for (int i = 0; i < R; i++)
            for (int j = 0; j < C; j++)
                M2[i][j] = sc.nextInt();

        List<Integer> border1 = getBorder(R, C, M1);
        List<Integer> border2 = getBorder(R, C, M2);

        if (isRotation(border1, border2))
            System.out.println("YES");
        else
            System.out.println("NO");
    }

    static List<Integer> getBorder(int R, int C, int[][] mat) {
        List<Integer> border = new ArrayList<>();

        // Top row
        for (int j = 0; j < C; j++)
            border.add(mat[0][j]);

        // Right column
        for (int i = 1; i < R - 1; i++)
            border.add(mat[i][C - 1]);

        // Bottom row (right to left)
        for (int j = C - 1; j >= 0; j--)
            border.add(mat[R - 1][j]);

        // Left column (bottom to top)
        for (int i = R - 2; i > 0; i--)
            border.add(mat[i][0]);

        return border;
    }

    static boolean isRotation(List<Integer> a, List<Integer> b) {
        if (a.size() != b.size()) return false;

        int len = a.size();

        // Try all rotation offsets
        for (int offset = 0; offset < len; offset++) {
            boolean match = true;
            for (int i = 0; i < len; i++) {
                if (!a.get((i + offset) % len).equals(b.get(i))) {
                    match = false;
                    break;
                }
            }
            if (match) return true;
        }

        return false;
    }
}
/*
   Example Input/Output 1:

Input

55

46 59 74 38 55

41 65 67 51 90

18 57 48 11 10

12 28 33 23 35

66 27 62 69 47

18 41 46 59 74

12 65 67 51 38

66 57 48 11 55

27 28 33 23 90

62 69 47 35 10

Output:

YES

Explanation:

The border elements of M2 is formed by rotating the border elements of M1 by 2 positions in

positions in
clockwise direction.

So YES is printed as the output.

Example Input/Output 2:

Input:

3 4

41 61 24 58

33 84 40 60

57 26 46 78

61 24 58 60

41 84 40 78

33 57 26 46

Output:

YES
*/
