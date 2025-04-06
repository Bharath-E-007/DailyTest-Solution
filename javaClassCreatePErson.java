pimport java.util.Scanner;

class Person {
    String name;
    int weight;
    double height;

    // Constructor
    public Person(String name, int weight, double height) {
        this.name = name;
        this.weight = weight;
        this.height = height;
    }

    // toString method to display person details
    @Override
    public String toString() {
        return "Name: " + name + "\nWeight: " + weight + " kg\nHeight: " + height + " m\n";
    }

    // Method to calculate BMI
    public double getBodyMassIndex() {
        return weight / (height * height);
    }
}

public class javaClassCreatePerson {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input details
        System.out.print("Enter name: ");
        String name = sc.nextLine().trim();

        System.out.print("Enter weight (kg): ");
        int weight = sc.nextInt();

        System.out.print("Enter height (m): ");
        double height = sc.nextDouble();

        // Create Person object
        Person person = new Person(name, weight, height);

        // Display person details
        System.out.println(person);

        // Display BMI
        System.out.printf("BMI: %.1f", person.getBodyMassIndex());

        sc.close();
    }
}