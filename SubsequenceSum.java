public class SubsequenceSum {
    /*
    
    import java.io.*;
import java.util.*;

public class Main {

    //static final long MOD = 1000000007;

    static void gen(int[] arr, int start, int end, List<Long> list){
        int len = end - start;
        int total = 1 << len;

        for(int mask = 0; mask < total; mask++){
            long sum = 0;
            for(int i=0; i<len; i++){
                if((mask & (1 << i)) != 0){
                    sum += arr[start + i];
                }
            }
            list.add(sum);
        }
    }

    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st;

        int t = Integer.parseInt(br.readLine());

        while(t-- > 0){
            st = new StringTokenizer(br.readLine());

            int n = Integer.parseInt(st.nextToken());
            long A = Long.parseLong(st.nextToken());
            long B = Long.parseLong(st.nextToken());

            int[] arr = new int[n];
            st = new StringTokenizer(br.readLine());
            for(int i=0; i<n; i++){
                arr[i] = Integer.parseInt(st.nextToken());
            }

            int mid = n/2;

            List<Long> left = new ArrayList<>();
            List<Long> right = new ArrayList<>();

            gen(arr, 0, mid, left);
            gen(arr, mid, n, right);

            Collections.sort(right);

            long count = 0;

            for(long x : left){
                long low = A - x;
                long high = B - x;
 
                int l = lowerBound(right, low);
                int r = UpperBound(right, high);

                count += (r - l);
            }
            System.out.println(count);
        }
    }

    static int lowerBound(List<Long> list, long tar){
        int l = 0, r = list.size();
        while(l < r){
            int mid = (l + r)/2;
            if(list.get(mid) >= tar) {
                r = mid;
            }else{
                l = mid + 1;
            }
        }
        return l;
    }

    static int UpperBound(List<Long> list, long tar){
        int l = 0, r = list.size();
        while(l < r){
            int mid = (l + r)/2;
            if(list.get(mid) > tar) {
                r = mid;
            }else{
                l = mid + 1;
            }
        }
        return l;
    }

    
}
    */
}
