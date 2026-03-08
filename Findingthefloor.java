/*

import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i =0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        Arrays.sort(arr);

        int q = sc.nextInt();
        for(int i=0; i<q; i++){
            int x = sc.nextInt();
            System.out.println(Solve(arr, n,x));
        }
    }

    static int Solve(int arr[], int n, int x){
        int low =0;
        int high = n-1;
        int ans = Integer.MIN_VALUE;
        while(low <= high){
            int mid = (low + high)/2;

            if(arr[mid] <= x){
                ans = arr[mid];
                low = mid +1;
            }else{
                high = mid -1;
            }
        }
        return ans;
    }
}

*/




