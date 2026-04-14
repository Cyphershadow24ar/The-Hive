public class Carbinatepart {
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

            System.out.println(cabinetpart(arr, n, k));
        }
    }

    static int cabinetpart(int[] arr, int n, int k){
        int low = 0;
        int high = 0;
        for(int i=0; i<n; i++){
            low = Math.max(low, arr[i]);
            high += arr[i];
        }

        int ans = high;
        while(low <= high){
            int mid = (low + high) / 2;
            if(valid(arr,n,mid,k)){
                ans = mid;
                high = mid -1;
            }
            else{
                low = mid + 1;
            }
        }
        return ans;
    }

    static boolean valid(int[] arr, int n, int mid, int k){
        int sum =0;
        int part = 1;
        for(int i=0; i<n; i++){
            if(sum + arr[i] <= mid){
                sum += arr[i];
            }
            else{
                part++;
                sum = arr[i];
            }
        }
        return part <= k;
    }
}

    */
}
