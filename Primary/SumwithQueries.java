public class SumwithQueries {
    /*
    
    import java.io.*;
import java.util.*;

public class Main {

    //static final long MOD = 1000000007;

    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st;

        int t = Integer.parseInt(br.readLine());

        while(t-- > 0){
            int n = Integer.parseInt(br.readLine());
            int[] arr = new int[n];
            st = new StringTokenizer(br.readLine());
            long sum = 0;
            for(int i=0; i<n; i++){
                arr[i] = Integer.parseInt(st.nextToken());
                sum += arr[i];
            }

            int q = Integer.parseInt(br.readLine());

            long[] dif = new long[n + 1];

            while(q-- > 0){
                st = new StringTokenizer(br.readLine());
                int l = Integer.parseInt(st.nextToken());
                int r = Integer.parseInt(st.nextToken());
                int x = Integer.parseInt(st.nextToken());

                dif[l] += x;
                if(r + 1 < n) dif[r + 1] -= x;
            }

            long run =0;

            for(int i=0; i<n; i++){
                run += dif[i];
                sum += run;
            }

            System.out.println(sum);

       }
    }
}
    */
}
