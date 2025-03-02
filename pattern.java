
import java.util.Scanner;

public class pattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str=sc.nextLine();
        int n=sc.nextInt();
        String str1="";
        int num=(str.length()-1)*2-1;
        for(int i=0;i<n;i++){
            str1+=str.charAt(i);
            if(num==0){
                System.out.println(str1+reverse(str1.substring(0,str1.length()-1)));
                continue;
            }
            System.out.println(str1+"*".repeat(num)+reverse(str1));
            num-=2;
            if(num<0)
              num=0;
        }
        for(int i=1;i<str.length();i++){
            if(n+i-1<str.length()){
                str1+=str.charAt(n+i-1);
            }
            if(num==0){
                System.out.println("*".repeat(i)+str1.substring(i)+reverse(str1.substring(i,str1.length()-1))+"*".repeat(i));
            }
            else
                System.out.println("*".repeat(i)+str1.substring(i)+"*".repeat(num)+reverse(str1.substring(i))+"*".repeat(i));
            num-=2;
            if(num<0)
              num=0;
        }
        sc.close();
        System.exit(0);
    }
    public static String reverse(String str){
        return new StringBuilder(str).reverse().toString();
    }
}
/*
 input:
   Parking
 * 3
 output:
P***********P
Pa*********aP
Par*******raP
*ark*****kra*
**rki***ikr**
***kin*nik***
****ingni****
*****ngn*****
******g******
 example 2:
 input:
computer
5
output
c*************c
co***********oc
com*********moc
comp*******pmoc
compu*****upmoc
*omput***tupmo*
**mpute*etupm**
***puteretup***
****uteretu****
*****teret*****
******ere******
*******r*******

 */
