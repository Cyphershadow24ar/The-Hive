/*

import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0){
            long n = sc.nextLong();
            if(n<0){
                n = Math.abs(n);
                System.out.println(-1*cube(n));
            }else{
                System.out.println(cube(n));
            }
        }
    }

    static long cube(long n){
        long low = 1;
        long high = 1000000;

        while( low <= high){
            long mid = (low + high)/2;
            long three = mid * mid * mid;
            if(three == n){
                return mid;
            }else if(three > n){
                high = mid - 1;
            }else{
                low = mid +1;
            }
        }
        return -1;
    }
}

*/