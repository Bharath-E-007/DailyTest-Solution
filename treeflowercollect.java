import java.util.Scanner;

public class treeflowercollect {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int size = sc.nextInt();

        int tree[] = new int[size];

        for (int i = 0; i < size; i++)
            tree[i] = sc.nextInt();

        sc.nextLine();

        String side = sc.nextLine();

        int basket[] = new int[size];

        for (char s : side.toCharArray()) {

            if (s == 'L') {

                for (int i = 0; i < size - 1; i++) {
                    if (tree[i] > 0) {
                        basket[i + 1]++;
                        tree[i]--;
                    }
                }
                tree[size-1]--;

            } else {

                for (int i = size - 1; i > 0; i--) {
                    if (tree[i] > 0) {
                        basket[i - 1]++;
                        tree[i]--;
                    }
                }
                tree[0]--;

            }

        }
        for (int val : basket)
            System.out.print(val + " ");
        sc.close();
        System.exit(0);
    }
}
/*Example Input/Output 1:

Input:

4

10 3 6 5

LRRL

Output:

2 4 3 2

Explanation:

The given string S = LRRL Initially, all 4 buckets are empty.

0 0 0 0

1st character L: After the wind blows on the left side, the number of flowers in the buckets become

0111

2nd character R: After the wind blows on the right side, the number of flowers in the buckets become

1221

3rd character R: After the wind blows on the right side, the number of flowers in the buckets become

2331

4th character L: After the wind blows on the left side, the number of flowers in the buckets become 2432 */