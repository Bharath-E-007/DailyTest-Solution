import java.util.Scanner;

class Parent {

	private String name;

	private int age;

	public Parent(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public void updateAge(int yearsToAdd) {
		this.age += yearsToAdd;
	}

	public void display() {
		System.out.println(this.name);
		System.out.println(this.age);
	}
} // end of Parent class

class Child extends Parent {

	private String name;

	private int age;

	public Child(String parentName, int parentAge, String childName, int childAge) {
		super(parentName, parentAge);
		this.name = childName;
		this.age = childAge;
	}

	public void updateAge(int x) {
		super.updateAge(x);
		this.age += x;
	}

	public void display() {
		super.display();
		System.out.printf("%s\n%d\n", this.name, this.age);
	}
} // end of Child class

String parentName = sc.nextLine().trim();
 int parentAge =Integer.parseInt(sc.nextLine().trim());

String childName = sc.nextLine().trim();

int childAge = Integer.parseInt(sc.nextLine().trim());

public static void main(String[] args) {

	Scanner sc = new Scanner(System.in);

	String parentName = sc.nextLine().trim();
	int parentAge = Integer.parseInt(sc.nextLine().trim());

	String childName = sc.nextLine().trim();
	int childAge = Integer.parseInt(sc.nextLine().trim());

	int X = Integer.parseInt(sc.nextLine().trim());

	Child child = new Child(parentName, parentAge, childName, childAge);

	child.updateAge(X);

	child.display();

	sc.close();
} // end of main function
/*
 * 
 */Example Input/Output 1:

Input:

Hector 50

Gavin

23 10

Output

Hector

60 33

Gavin

Explanation:

The name of the parent is Hector and his age is 50.

The name of the child is Gavin and his age is 23.

After 10 years, the age of Hector will be 60 and the age of Gavin will be 33.

Hence the output is

Hector

60

Gavin

33

Example Input/Output 2:

Input

Arun

30

Bhuvana

4 18

Output

Arun

48

Bhuvana

22