
    import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class DatePrintTheEventInTheYear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int X = sc.nextInt(); // Interval in days
        int Y = sc.nextInt(); // Year
        sc.close();

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MMM-yyyy");

        // Start from the Xth day of the year
        LocalDate date = LocalDate.ofYearDay(Y, X);

        while (date.getYear() == Y) {
            System.out.println(date.format(formatter));
            date = date.plusDays(X);
    }
}
}
/*
   An event occurs every X days in a year. The program must print the dates in which the event occurs in the year Y as the output. The values of X and Y are passed as the input. The format of the date must be DD-MMM-YYYY.

Boundary Condition(s):

1< X <= 365

1<=Y<= 2500

Input Format:

The first line contains X.

The second line contains Y.

Output Format:

The lines containing the dates in which the event occurs in the year Y.

Example Input/Output 1:

Input:

25

2021

Output:

25-Jan-2021

19-Feb-2021

16-Mar-2021

10-Apr-2021

05-May-2021

30-May-2021

24-Jun-2021

19-Jul-2021

13-Aug-2021

07-Sep-2021

02-Oct-2021

27-Oct-2021

21-Nov-2021

16-Dec-2021

Explanation:

Here X = 25 and Y = 2021.

So the event occurs every 25 days in the year 2021 and the dates are printed.
 */
