public class Exclusionproduct {
    /*
    
    import java.io.*;
import java.util.*;

public class Main {

    static final long MOD = 1000000007;

    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st;

        int t = Integer.parseInt(br.readLine());

        while(t-- > 0){
            int n = Integer.parseInt(br.readLine());
            int[] arr = new int[n];
            st = new StringTokenizer(br.readLine());
            for(int i=0; i<n; i++){
                arr[i] = Integer.parseInt(st.nextToken());
            }

            long[] ps = new long[n];
            long[] ss = new long[n];
            long[] ans = new long[n];

            ps[0] = 1;
            for(int i=1; i<n; i++){
                ps[i] = (ps[i-1] * arr[i-1]) % MOD;
            }

            ss[n-1] = 1;
            for(int i=n-2; i >= 0; i--){
                ss[i] = (ss[i+1] * arr[i+1]) % MOD;
            }

            for(int i=0; i<n; i++){
                ans[i] = (ps[i] * ss[i]) % MOD;
            }

            StringBuilder sb = new StringBuilder();
            for(int i=0; i<n; i++){
                sb.append(ans[i]).append(" ");
            }
            System.out.println(sb.toString().trim());

        }
    }
}
    
    */
}
