public class QuadruplesofXor {
    /*
    
    import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int t = Integer.parseInt(br.readLine());
        while(t-- > 0){
            int n = Integer.parseInt(br.readLine());

            int[] a = new int[n];
            int[] b = new int[n];
            int[] c = new int[n];
            int[] d = new int[n];

            st = new StringTokenizer(br.readLine());
            for(int i=0; i<n; i++) a[i] = Integer.parseInt(st.nextToken());

            st = new StringTokenizer(br.readLine());
            for(int i=0; i<n; i++) b[i] = Integer.parseInt(st.nextToken());

            st = new StringTokenizer(br.readLine());
            for(int i=0; i<n; i++) c[i] = Integer.parseInt(st.nextToken());

            st = new StringTokenizer(br.readLine());
            for(int i=0; i<n; i++) d[i] = Integer.parseInt(st.nextToken());

            HashMap<Integer, Integer> map = new HashMap<>(n*n);

            for(int i=0; i<n; i++){
                for(int j=0; j<n; j++){
                    int x = a[i] ^ b[j];
                    map.put(x, map.getOrDefault(x, 0) + 1);
                }
            }

            long count = 0;

            for(int i=0; i<n; i++){
                for(int j=0; j<n; j++){
                    int y = c[i] ^ d[j];
                    count += map.getOrDefault(y, 0);
                }
            }


            System.out.println(count);

            
        }
    }
}
    */
}
