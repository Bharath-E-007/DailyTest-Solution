import java.util.*;

public class alphabeticsort {

public static void main(String[] args) {

Scanner sc=new Scanner(System.in); 

int r=sc.nextInt(),c=sc.nextInt();

char ch[][]=new char[r][c];

for(int i=0;i<r;i++){

for(int j=0;j<c;j++) 
     ch[i][j]=sc.next().charAt(0);

} 
int k=sc.nextInt();

boolean b=false;

for(int i=0;i<=r-k;i++){

for(int j=0;j<=c-k;j++){

if(check(ch,i,j,k)){

b=true; break;

}

}
}
 System.out.println(b?"YES": "NO");

} public static boolean check(char ch[][],int i,int j,int k){

StringBuilder sb=new StringBuilder(); 
for(int i1=0; i1<k*k; i1++)

sb.append(ch[i+i1/k][j+i1%k]);

for(int i1=0; i1<sb.length()-1; i1++){ 
    
    if(sb.charAt(i1)>sb.charAt(i1+1))

      return false;

} return true;

}

}
/*
 * Example Input/Output 1:

Input

45

ulyjm

jmdef

uoikn

wtpxy

3

Output:

YES

Explanation:

Here K 3, the 3*3 submatrix having the alphabets in sorted order is highlighted below

ulyjm

jmdef

uolkn

wtpxy

Hence the output is YES.

Example Input/Output 2:

Input

65

rquhg

xkwip

sgncs

jzbur

mzvsw

vsyls

2

Output:

NO
 */