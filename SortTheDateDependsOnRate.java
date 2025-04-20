import java.util.*;
import java.text.*;

class DateRevenue implements Comparable<DateRevenue> {
    String dateStr;
    int revenue;
    Date dateObj;

    public DateRevenue(String dateStr, int revenue) throws ParseException {
        this.dateStr = dateStr;
        this.revenue = revenue;
        this.dateObj = new SimpleDateFormat("dd-MMM-yyyy", Locale.ENGLISH).parse(dateStr);
    }

    @Override
    public int compareTo(DateRevenue other) {
        return this.dateObj.compareTo(other.dateObj);
    }
}

public class Hello {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        sc.nextLine(); // consume newline

        List<DateRevenue> valid = new ArrayList<>();

        for (int i = 0; i < num; i++) {
            try{
                String[] part = sc.nextLine().split(" ");
                String date = part[0];
                int rate = Integer.parseInt(part[1]);

                valid.add(new DateRevenue(date, rate));
            } catch (ParseException e) {
                // Ignore invalid date formats
            }
        }

        int X = sc.nextInt();

        List<DateRevenue> result = new ArrayList<>();
        for (DateRevenue dr : valid) {
            if (dr.revenue >= X) {
                result.add(dr);
            }
        }

        if (result.isEmpty()) {
            System.out.println("-1");
        } else {
            Collections.sort(result);
            for (DateRevenue dr : result) {
                System.out.println(dr.dateStr);
            }
        }
    }
}

/*
    Example Input/Output 1:

Input:

8

15-Jun-2020 750

17-Jun-2020 450

12-Jun-2020 150

18-Jun-2020 900

16-Jun-2020 250

14-Jun-2020 500

19-Jun-2020 640

13-Jun-2020 350

500

Output

14-Jun-2020

15-Jun-2020

18-Jun-2020

19-Jun-2020

Explanation:

Here N = 8 and X = 500.

The dates in which the revenue is greater than or equal to 500 are given below.

15-Jun-2020 750

18-Jun-2020 900

14-Jun-2020 500

19-Jun-2020 640

So the above four dates are sorted and printed as the output.

Example Input/Output 2:

Input:

8

22-Apr-0097 150

06-Jun-0096 200

19-Apr-0097 240

07-Jul-0095 100

23-Apr-0097 90

06-Aug-0096 190

21-Apr-0097 120

06-Jul-0096 540

50

Output:

07-Jul-0095

06-Jun-0096

06-Jul-0096

06-Aug-0096

19-Apr-0097

21-Apr-0097

22-Apr-0097

23-Apr-0097

Example Input/Output 3:

Input:

3

20-Aug-2020 1540

17-Aug-2019 2130

18-Aug-2019 5000

6000

Output:

-1
 */