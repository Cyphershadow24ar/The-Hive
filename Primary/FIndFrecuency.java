public class FIndFrecuency {
    /*
    
    import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);

       int n =sc.nextInt();
       int[] arr =new int[n];
       for(int i=0; i<n; i++){
        arr[i] = sc.nextInt();
       }
       Arrays.sort(arr);

       int q = sc.nextInt();
       for(int i=0; i<q; i++){
        int x = sc.nextInt();
        int ans = findfrequency(arr, x+1) - findfrequency(arr, x);
        System.out.println(ans);
       }
    }

    static int findfrequency(int[] arr, int x){
        int low = 0;
        int high = arr.length-1;
        int ans = arr.length;

        while(low <= high){
            int mid = (low + high)/2;
            if(arr[mid] >= x){
                ans = mid;
                high = mid - 1;
            }else{
                low = mid + 1;
            }
        }
        return ans;
    }
}
    */
}
