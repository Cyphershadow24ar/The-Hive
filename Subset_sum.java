/*

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t= sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            int s = sc.nextInt();
            int[] arr =new int[n];
            for(int i=0; i<n; i++){
                arr[i] = sc.nextInt();
            }

            boolean[] dp = new boolean[s + 1];
            dp[0] = true; 

            for(int i = 0; i<n; i++){
                for(int j=s; j >= arr[i]; j--){
                    dp[j] = dp[j] || dp[j - arr[i]];
                }
            }
            if(dp[s]){
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }
        }
    }
}
    
*/