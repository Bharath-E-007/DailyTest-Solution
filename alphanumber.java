import java.util.Scanner;

public class alphanumber {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        scanner.close();

        boolean alpha = num % 2 == 0; 

        char ch = 'a'; 
        int num1 = 1;  

        for (int i = 0; i < num; i++) {  
            for (int j = 0; j < num; j++) { 
                System.out.print(alpha ? (ch + " ") : (num1 + " "));
                ch++;
                num1++;

                if (ch > 'z') { 
                    ch = 'a';
                }
            }
            System.out.println();
            alpha = !alpha;
        }
    }
}
