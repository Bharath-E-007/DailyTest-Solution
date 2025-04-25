import java.util.*;

class College implements Comparable<College> {

String CollegeName;

List<String> department;

int count;

public College(String CollegeName) {

this.CollegeName=CollegeName;

this.department=new ArrayList<>();

this.count=0;

} public void addDepartment(String dept){

department.add(dept);

count++;

} public String getName(){

return CollegeName;

} public String[] getDepartments(){

return department.toArray(new String[0]);

}

public int compareTo(College other) {
    
if (this.count == other.count) {
return this.CollegeName.compareTo(other.CollegeName);

return this.CollegeName.compare(other.CollegeName);

}

return Integer.compare(other.count,this.count);

}

} public class CreateACollegeClassImplementsSort {

public static void main(String[] args) {

Scanner sc = new Scanner(System.in);

int C= Integer.parseInt(sc.nextLine().trim());

List<College> colleges = new ArrayList<>();

for (int collegeCtr = 1; collegeCtr <= C; collegeCtr++) {

String collegeName = sc.nextLine().trim();

College college = new College(collegeName);

String departments[] = sc.nextLine().trim().split("\\s+");

for (String dept: departments) {

college.addDepartment(dept);

}

colleges.add(college);

for (College college : colleges) {

	System.out.println(college.getName());

	for (String dept : college.getDepartments()) {
		System.out.print(dept + " ");
	}
	System.out.println();
}

for (String dept : college.getDepartments()) { System.out.print(dept + " ");
}
}
}

} 