import java.util.*;

public class CreateAClassAndImplementsSortFunction {

class Rectangle implements Comparable<Rectangle> {
    int length;
    int breadth;
    int area;

    Rectangle(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
        this.area = length * breadth;
    }

    @Override
    public int compareTo(Rectangle other) {
        return Integer.compare(other.area, this.area); // Descending order
    }

    @Override
    public String toString() {
        return "Rectangle[length=" + length + ", breadth=" + breadth + ", area=" + area + "]";
    }
}

public class Hello {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        List<Rectangle> values = new ArrayList<>();

        for (int ctr = 0; ctr < N; ctr++) {
            int length = sc.nextInt();
            int breadth = sc.nextInt();
            values.add(new Rectangle(length, breadth));
        }

        Collections.sort(values);

        for (Rectangle rect : values) {
            System.out.println(rect);
        }

        sc.close();
    }
}
}
