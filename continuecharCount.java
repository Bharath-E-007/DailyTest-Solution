import java.util.Scanner;

public class continuecharCount {

    public static void main(String[] args) {
        String str = new Scanner(System.in).nextLine();

        int count = 0;
        int arr[] = new int[26];

        for (char c : str.toCharArray()) {
            arr[c - 'a']++;
        }

        boolean bool = true;

        for (int i = 1; i < 26; i++) {
            if (arr[i - 1] == 1 && arr[i] == 1) {
                if (bool) {
                    count++;
                    bool = false;
                } else {
                    bool = true;
                }
            }
        }

        System.out.println(count == 0 ? -1 : count);
        System.exit(0);
    }
}
/*
 * Example Input/Output 1:

Input yamobxcnpzr

Output: 3

Explanation:

There are three string values that can be formed using the alphabets where the alphabets are in sequence.

abc, mnop and xyz.

So the count 3 is printed as the output.

Example input/Output 2:

Input acfhkmo

Output: -1
 */