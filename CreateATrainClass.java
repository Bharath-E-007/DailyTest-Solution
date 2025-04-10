import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

class Train implements Comparable<Train> {
    private String name;
    private int arrivalHour, arrivalMinute;
    private int departureHour, departureMinute;
    private static int counter = 0;
    private int order;

    public Train() {
        this.order = counter++;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setArrivalTime(int h, int m) {
        this.arrivalHour = h;
        this.arrivalMinute = m;
    }

    public void setDepartureTime(int h, int m) {
        this.departureHour = h;
        this.departureMinute = m;
    }

    public String getName() {
        return name;
    }

    public String getArrivalTime() {
        return String.format("%02d:%02d", arrivalHour, arrivalMinute);
    }

    public String getDepartureTime() {
        return String.format("%02d:%02d", departureHour, departureMinute);
    }

    private int getArrivalInMinutes() {
        return arrivalHour * 60 + arrivalMinute;
    }

    private int getDepartureInMinutes() {
        return departureHour * 60 + departureMinute;
    }

    @Override
    public int compareTo(Train other) {
        int cmp = Integer.compare(this.getArrivalInMinutes(), other.getArrivalInMinutes());
        if (cmp != 0) return cmp;

        cmp = Integer.compare(this.getDepartureInMinutes(), other.getDepartureInMinutes());
        if (cmp != 0) return cmp;

        return Integer.compare(this.order, other.order); // maintain input order
    }
}
class CreateATrainClass{
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.nextLine().trim());

        List<Train> trains = new ArrayList<>();

        for (int ctr = 0; ctr < N; ctr++) {
            String[] currTrain = sc.nextLine().trim().split("\\s+");
            Train t = new Train();

            t.setName(currTrain[0]);

            String[] arrivalTime = currTrain[1].split(":");
            int ah = Integer.parseInt(arrivalTime[0]);
            int am = Integer.parseInt(arrivalTime[1]);
            t.setArrivalTime(ah, am);

            String[] departureTime = currTrain[2].split(":");
            int dh = Integer.parseInt(departureTime[0]);
            int dm = Integer.parseInt(departureTime[1]);
            t.setDepartureTime(dh, dm);

            trains.add(t);
        }

        Collections.sort(trains, new TrainComparator());

        for (Train train : trains) {
            System.out.println(train.getName() + " " + train.getArrivalTime() + " " + train.getDepartureTime());
        }
    }
}
/*
 * Example Input/Output 1:

Input

5

Chennai Express 08:00 08:15

MumbaiExpress 07:30 07:45

GangaKaveriExpress 08:00 08:10

Delhi Express 13:00 13:10

Amritha Express 08:00 08:10

Output:

MumbaiExpress 07:30 07:45

GangaKaveri Express 08:00 08:10

Amritha Express 08:00 08:10

Chennai Express 08:00 08:15

Delhi Express 13:00 13:10

Explanation:

After sorting the trains based on the given conditions, the trains become

Here N = 5.

MumbaiExpress 07:30 07:45

GangaKaveriExpress 08:00 08:10

Amritha Express 08:00 08:10

ChennaiExpress 08:00 08:15

Delhi Express 13:00 13:10
 */