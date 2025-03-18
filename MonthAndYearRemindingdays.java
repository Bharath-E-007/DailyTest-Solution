import java.time.LocalDate;
import java.time.YearMonth;
import java.util.Scanner;

public class MonthAndYearRemindingdays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] str = scanner.nextLine().split(" ");
        String[] month = {"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};
        
        int sum = 0, rem = 0;

        if (Character.isAlphabetic(str[0].charAt(0))) {
            int day = Integer.parseInt(str[1]);
            int year = Integer.parseInt(str[2]);
            int days = days(str[0], year);
            boolean b = false;

            for (String s : month) {
                if (b) sum += days(s, year);
                if (s.equals(str[0])) b = true;
            }
            rem = days(str[0], year) - day;
            System.out.printf("%d\n%d", rem, sum);
        } else {
            int day = Integer.parseInt(str[0]);
            int year = Integer.parseInt(str[2]);
            boolean b = false;

            for (String s : month) {
                if (b) sum += days(s, year);
                if (s.equals(str[1])) b = true;
            }
            rem = days(str[1], year) - day;
            System.out.printf("%d\n%d", rem + sum, rem);
        }
    }

    public static int days(String str, int year) {
        switch (str) {
            case "Jan": case "Mar": case "May": case "Jul": case "Aug": case "Oct": case "Dec":
                return 31;
            case "Apr": case "Jun": case "Sep": case "Nov":
                return 30;
            case "Feb":
                if (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)) return 29;
                return 28;
            default:
                return 0;
        }
    }

    public int getRemainingDaysInMonth() {
        LocalDate today = LocalDate.now();
        YearMonth yearMonth = YearMonth.of(today.getYear(), today.getMonth());
        int totalDaysInMonth = yearMonth.lengthOfMonth();
        return totalDaysInMonth - today.getDayOfMonth();
    }

    public int getRemainingDaysInYear() {
        LocalDate today = LocalDate.now();
        LocalDate endOfYear = LocalDate.of(today.getYear(), 12, 31);
        return endOfYear.getDayOfYear() - today.getDayOfYear();
    }
}
/*
 * The program must accept a date D in any of the following two formats.

DD-MMM-YYYY

MMM-DD-YYYY

The program must print the number of days remaining in the year YYYY after the given date.

Then the program must print the number of days in the month MMM after the given date.

Note: The value of MMM will be from Jan, Feb, Mar, Apr,... till Dec.

Input Format:

The first line contains a date D.

Output Format:

The first line contains the number of days remaining in the year after the given date.

The second line contains the number of days in the month after the given date.

Example Input/Output 1:

Input

09-Nov-2021

Output: 52 21

Explanation:

The given date is 9th November 2021.

Number of days remaining in the year 2021: 52 days

Number of days remaining in the month Nov-2021: 21 days

Example Input/Output 2:

Input:

Dec-29-2021

Output:

2

2
 */