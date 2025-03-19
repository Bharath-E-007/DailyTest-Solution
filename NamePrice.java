import java.util.*;

class Mobile implements Comparable<Mobile> {
    String name;
    int price;

    // Constructor
    public Mobile(String name, int price) {
        this.name = name;
        this.price = price;
    }

    // Getters
    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    // Implement Comparable to define sorting logic
    @Override
    public int compareTo(Mobile other) {
        // Sort by price in descending order
        if (this.price != other.price) {
            return Integer.compare(other.price, this.price);
        }
        // If prices are equal, sort by name in ascending order
        return this.name.compareTo(other.name);
    }
}

public class NamePrice{ 
    public static void main(String[] args) {
        List<Mobile> mobiles = new ArrayList<>();

        // Hardcoded input values
        mobiles.add(new Mobile("Samsung", 500));
        mobiles.add(new Mobile("Apple", 1000));
        mobiles.add(new Mobile("OnePlus", 700));
        mobiles.add(new Mobile("Nokia", 300));

        // Sort using Comparable
        Collections.sort(mobiles);

        // Print sorted mobiles
        for (Mobile m : mobiles) {
            System.out.println(m.getName() + " " + m.getPrice());
        }
    }
}
/*Example Input/Output 1:

Input:

4

XoomK6Pro 8999

Abc10i 7999

BBGalaxyM30 9999

XoomC15 8999

Output:

BBGalaxyM30 9999

XoomC15 8999

XoomK6Pro 8999

Abc10i 7999

Explanation:

Here N = 4, the name and the price of the 4 mobiles are given below.

XoomK6Pro 8999

Abc10i 7999

BBGalaxyM30 9999

XoomC15 8999

After sorting the mobiles based on the given conditions, the mobiles become

BBGalaxyM30 9999

XoomC15 8999

XoomK6Pro 8999

Abc10i 7999 */
