import java.util.Scanner;

public class formPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int arr[] = new int[num];
        int max = 0;

        for (int i = 0; i < num; i++) {
            arr[i] = sc.nextInt();
            max = Math.max(arr[i], max);
        }

        for (int i = 0; i < max; i++) {
            for (int j = 0; j < num; j++) {
                if (arr[j] > i) {
                    System.out.print(String.valueOf(arr[j] + " ").repeat(arr[j]));
                } else {
                    System.out.print("* ".repeat(arr[j]));
                }
            }
            System.out.println();
        }

        sc.close();
        System.exit(0);
    }
}
/*
 * input :
 *   4
 * 4 1 2 10
 * 
 * output:
* 1 2 2 10 10 10 10 10 10 10 10 10 10 5 5 5 5 5
* 2 2 10 10 10 10 10 10 10 10 10 10 5 5 5 5 5
* * * 10 10 10 10 10 10 10 10 10 10 5 5 5 5 5
* * * 10 10 10 10 10 10 10 10 10 10 5 5 5 5 5
* * * 10 10 10 10 10 10 10 10 10 10 5 5 5 5 5
* * * 10 10 10 10 10 10 10 10 10 10 * * * * *
* * * 10 10 10 10 10 10 10 10 10 10 * * * * *
* * * 10 10 10 10 10 10 10 10 10 10 * * * * *
* * * 10 10 10 10 10 10 10 10 10 10 * * * * *
* * * 10 10 10 10 10 10 10 10 10 10 * * * * *
 */
