/*

import java.io.*;
import java.util.*;

public class Main {
    static final long mod = 1000000007L;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n= sc.nextInt();
        
        System.out.print(fact(n) % mod);
    }

    static long fact(long n){
        if(n == 1 || n == 0){
            return 1;
        }

        return ((n % mod) * fact(n-1))% mod;
    }
}
*/