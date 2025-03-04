import java.util.*;

public class StringMatches {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int val = sc.nextInt();
        String str[][] = new String[val][2];

        for (int i = 0; i < val; i++) {
            for (int j = 0; j < val; j++) {
                char c = sc.next().charAt(0);

                if (str[i][0] == null)
                    str[i][0] = "";

                if (str[j][1] == null)
                    str[j][1] = "";

                str[i][0] += c;
                str[j][1] += c;
            }
        }

        sc.nextLine();
        String str1 = sc.nextLine(), str2 = sc.nextLine();

        boolean f1 = false, f2 = false;

        for (String[] s1 : str) {
            f1 = (s1[0].equals(str1) || s1[1].equals(str1));
            f2 = (s1[0].equals(str2) || s1[1].equals(str2));
        }

        System.out.println(f1 && f2?"YES":"NO");
    }
}