import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class SundaysInMonth {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input values
        String S1 = sc.next().trim();  // Weekday of Jan 1st
        String S2 = sc.next().trim();  // Month name
        int Y = sc.nextInt();          // Year
        sc.close();

        // Mapping weekdays to index
        Map<String, DayOfWeek> weekDays = Map.of(
            "Sun", DayOfWeek.SUNDAY, "Mon", DayOfWeek.MONDAY, "Tue", DayOfWeek.TUESDAY,
            "Wed", DayOfWeek.WEDNESDAY, "Thu", DayOfWeek.THURSDAY, "Fri", DayOfWeek.FRIDAY, "Sat", DayOfWeek.SATURDAY
        );

        // Correct way to map months
        Map<String, Month> months = new HashMap<>();
        months.put("Jan", Month.JANUARY);
        months.put("Feb", Month.FEBRUARY);
        months.put("Mar", Month.MARCH);
        months.put("Apr", Month.APRIL);
        months.put("May", Month.MAY);
        months.put("Jun", Month.JUNE);
        months.put("Jul", Month.JULY);
        months.put("Aug", Month.AUGUST);
        months.put("Sep", Month.SEPTEMBER);
        months.put("Oct", Month.OCTOBER);
        months.put("Nov", Month.NOVEMBER);
        months.put("Dec", Month.DECEMBER);

        // Get the correct first day of the year
        LocalDate janFirst = LocalDate.of(Y, Month.JANUARY, 1);
        DayOfWeek janFirstDay = weekDays.get(S1);

        while (janFirst.getDayOfWeek() != janFirstDay) {
            janFirst = janFirst.plusDays(1);
        }

        // Get the month and start date
        Month month = months.get(S2);
        LocalDate date = LocalDate.of(Y, month, 1);

        // Format for output
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MMM-yyyy");

        // Find Sundays in the given month
        while (date.getMonth() == month) {
            if (date.getDayOfWeek() == DayOfWeek.SUNDAY) {
                System.out.println(date.format(formatter));
            }
            date = date.plusDays(1);
        }
    }
}
/*
 * The program must accept two string values 51, 52 and an integer Y as the input. The string $1 represents the weekday of the 1st Jan in the year Y. The string $2 represents a month in the year Y. The program must print the dates of all the sundays in the month 52 of the given year Y as the output. Each date must be printed in the format DD-MMM-YYYY

Note:

- The value of the weekday 51 will be from Sun, Mon, Tue, Wed,... till Sat.

- The value of the month 52 will be from Jan, Feb, Mar, Apr... till Dec.

Input Format:

The first line contains 51.

The second line contains 52.

The third line contains Y.

Output Format:

The lines contain the dates of all the sundays in the month 52 of the given year Y.

Example Input/Output 1:

Input:

Fri

May

2021

Output:

02-May-2021

09-May-2021

16-May-2021

23-May-2021

30-May-2021
 */