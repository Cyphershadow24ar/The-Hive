public class ProtectiveVillagers {
    /*
    
    import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            int k = sc.nextInt();

            int[] arr = new int[n];
            for(int i=0; i<n; i++){
                arr[i] = sc.nextInt();
            }

            Arrays.sort(arr);
            System.out.println(potectiveVillagers(arr, n, k));
        }
    }

    static int potectiveVillagers(int[] arr, int n, int k){
        int low = 0;
        int ans = 0;;
        int high = arr[n-1] - arr[0];

        while(low <= high){
            int mid = (low + high) / 2;
            if(valid(arr,n,mid,k)){
                ans = mid;
                low = mid  + 1;
            }
            else{
                high = mid - 1;
            }
        }
        return ans;
    }

    static boolean valid(int[] arr, int n, int mid, int k){
        int curr = arr[0];
        int cnt = 1;
        for(int i=0; i<n; i++){
            if((arr[i] - curr) >= mid){
                cnt++;
                curr = arr[i];
            }
            if(cnt >= k){
                return true;
            }
        }
        return false;
    }
}

    */
}
