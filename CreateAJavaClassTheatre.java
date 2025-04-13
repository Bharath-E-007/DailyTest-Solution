
    import java.util.*;

class Theatre {
    int[][] Book;
    int index;

    public Theatre() {
        this.Book = new int[1000][2];
        this.index = 0;
    }

    public boolean book(int start, int end) {
        for (int i = 0; i < index; i++) {
            int s = Book[i][0];
            int e= Book[i][1];
            
            // If not completely before or after, it's overlapping
            if ((s < start && e > start) || (s < end && e > end) || (s >= start && e <= end)) {
                return false;
            }
        }
        Book[index][0] = start;
        Book[index][1] = end;
        index++;
        return true;
    }
}

public class CreateAJavaClassTheatre {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        Theatre theatre = new Theatre();

        for (int i = 0; i < N; i++) {
            int start = sc.nextInt();
            int end = sc.nextInt();

            boolean result = theatre.book(start, end);
            System.out.println(result ? "Successful" : "Failed");
        }
    }
}
/*
   Define class Theatre

The program must accept N seat booking slots in a theatre as the input. For each slot(start and end), the program must print the output based on the following conditions.

- If all the seats in the given slot are not booked, then the seats must be booked and the program must print "Successful" as the output.

- Else the program must print "Failed" as the output.

Your task is to define the class Theatre so that the program runs successfully.

Example Input/Output 1:

Input

7

20 30

25 35

30 40

31 40

10 15

5 17

12 14

Output:

Successful

Failed

Failed

Successful

Successful

Failed

Failed
 */

