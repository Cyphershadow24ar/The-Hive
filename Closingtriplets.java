public class Closingtriplets {
    /*
    import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);

       int t = sc.nextInt();
       while(t-- > 0){
            int n1 =sc.nextInt();
            int[] ar1 = new int[n1];
            for(int i=0; i<n1; i++){
                ar1[i] = sc.nextInt();
            }

            int n2 =sc.nextInt();
            int[] ar2 = new int[n2];
            for(int i=0;i<n2; i++){
                ar2[i] = sc.nextInt();
            }

            int n3 =sc.nextInt();
            int[] ar3 = new int[n3];
            for(int i=0; i<n3; i++){
                ar3[i] = sc.nextInt();
            }

            Arrays.sort(ar1);
            Arrays.sort(ar2);
            Arrays.sort(ar3);

            int i=0, j=0, k=0;
            int ans =Integer.MAX_VALUE;
            while(i <n1 && j < n2 && k<n3){
                int a = ar1[i];
                int b = ar2[j];
                int c = ar3[k];

                int maxval = Math.max(a,Math.max(b,c));
                int minval = Math.min(a,Math.min(b,c));

                ans = Math.min(ans, maxval - minval);
                if(minval == a){
                    i++;
                }else if(minval == b){
                    j++;
                }else{
                    k++;
                }
            }
            System.out.println(ans);
       }
    }
}
    
    */
}
