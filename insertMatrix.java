
import java.util.*;

public class insertMatrix {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int r=sc.nextInt(),c=sc.nextInt();
        int[][] arr=new int[r][c+1];
        for(int i=0;i<r*c;i++)
           arr[i/c][i%c]=sc.nextInt();
        int x=sc.nextInt(),y=sc.nextInt(),z=sc.nextInt();
        int temp=arr[x-1][y-1],i=x;
        boolean in=true;
        if(c%2==0)
            in=false;
        for(int j=y-1;j<=c;j++){
            int t1=0,t2=0;
            while(i<r && i>=0){
                t1=arr[i][j];
                arr[i][j]=temp;
                temp=t1;
                i=in?i+1:i-1;
            }
            j++;
            if(j==c)
                break;
            if(in){
                t1=arr[i-1][j];
                arr[i-1][j]=temp;
                temp=t1;
            }else{
                t1=arr[i+1][j];
                arr[i+1][j]=temp;
                temp=t1;
            }
            i=in?i-1:i+1;
            in=!in;
        }
        for(int[]i1:arr){
            for(int j:i1)
                System.out.print(j+" ");
            System.out.println();
        }
    }
}
/*Example Input/Output 1:

Input:

54

26 45 16 17

55 68 14 32

66 80 34 86

24 43 49 25

65 30 48 71

3399

Output

26 45 16 32 17

55 68 14 86-1

66 80 99 25-1

24 43 34 71-1

65 30 49 48-1

Explanation:

Here x = 5 y = 3 and z = 99 so the integer 99 is inserted at the position (3, 3) in the matrix. After inserting the integer 99 into the matrix based on the given conditions, the matrix becomes

26 45 16 32 17

55 68 14 86-1

66 80 99 25-1

24 43 34 71-1

65 30 49 48-1
 */
