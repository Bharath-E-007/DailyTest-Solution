import java.util.Arrays;
import java.util.Scanner;

public class MatrixCutTheHorizontalAndVertical {

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
    
            int L = sc.nextInt(); // height
            int B = sc.nextInt(); // width
    
            int H = sc.nextInt();
            int[] hCuts = new int[H + 2];
            hCuts[0] = 0;
    
            for (int i = 1; i <= H; i++) {
                hCuts[i] = sc.nextInt();
            }
            hCuts[H + 1] = L;
            Arrays.sort(hCuts);
    
            int V = sc.nextInt();
            int[] vCuts = new int[V + 2];
            vCuts[0] = 0;
    
            for (int i = 1; i <= V; i++) {
                vCuts[i] = sc.nextInt();
            }
            vCuts[V + 1] = B;
            Arrays.sort(vCuts);
    
            int maxH = 0;
            for (int i = 1; i < hCuts.length; i++) {
                maxH = Math.max(maxH, hCuts[i] - hCuts[i - 1]);
            }
    
            int maxV = 0;
            for (int i = 1; i < vCuts.length; i++) {
                maxV = Math.max(maxV, vCuts[i] - vCuts[i - 1]);
            }
    
            System.out.println(maxH * maxV);
        }
    }   

