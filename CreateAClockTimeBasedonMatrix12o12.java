import java.util.Scanner;

public class CreateAClockTimeBasedonMatrix12o12 {

public static void main(String[] args) {

Scanner sc=new Scanner(System.in);

char ch[][]=new char[12] [12];

int am[][]=new int[150][2];

int pm[][]=new int[150][2];

int i1 = 0, i2 = 0;

for(int i=0;i<12;i++){

for(int j=0;j<12;j++){ ch[i][j]=sc.next().charAt(0); if(ch[i][j]!='*'){ if(ch[i][j]=='A'){ am[i][0]=(i+1); am[i++][1]=(j*5); continue; } }

pm[i2][0] = (i + 1);

pm[i2++][1]=(j*5);

Sort(am, i1);

} 
}
for (int i = 0; i < i1; i++) {
	System.out.printf("%02d:%02d AM\n", am[i][0], am[i][1]);
}

Sort(pm,i2);

for(int i=0;i<12;i++)

System.out.printf("%02d:%02d PM\n",pm[i][0],pm[i][1]);

}

public static void Sort(int[][] mat, int s) {
	for (int i = 0; i < s - 1; i++) {
        int v1 = (mat[i][0] % 12) * 60 + mat[i][1];
		for (int j = i + 1; j < s; j++) {
			int v2 = (mat[j][0] % 12) * 60 + mat[j][1];
			if (v1 > v2) {
				// Swap rows i and j
				int temp = mat[i][0];
				mat[i][0] = mat[j][0];
				mat[j][0] = temp;

				temp = mat[i][1];
				mat[i][1] = mat[j][1];
				mat[j][1] = temp;

                v1=v2;
			}
		}
        return;
	}
}
}
/*
 Find Time from Matrix

The program must accept a character matrix of size 12*12 as the input. The 12 rows in the matrix represent the 12 hours (1 to 12) and the 12 columns in the matrix represent the minute slots (0, 5, 10, 15, ... till 55). The given character matrix contains only asterisks, A's and P's. For each occurrence of A and P, the program must find the corresponding time using the row and column position. Finally, the program must print the times in chronological order. The format of the time must be HH:MM AM/PM.

The 24-Hour system and the 12-Hour system are given below.

00:00 -> 12:00 AM

00:01 -> 12:01 AM

01:00 -> 01:00 AM

02:00 -> 02:00 AM

11:00 -> 11:00 AM

12:00 -> 12:00 PM

13:00 - 01:00 PM

21:00 -> 09:00 PM

22:00 -> 10:00 PM

23:00 -> 11:00 PM

23:59 -> 11:59 PM

Input Format:

The first 12 lines, each contains 12 characters separated by a space.
 */



