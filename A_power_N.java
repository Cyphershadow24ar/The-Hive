/*
import java.io.*;
import java.util.*;

public class Main {
    static final long mod = 1000000007L;

    static long pow(long a, long n){
        if(n == 0){
            return 1;
        }
        long power = pow(a, n/2);
        long result = (power * power) % mod;

        if(n % 2 == 1){
            result = (result * (a % mod)) % mod;
        } 

        return result;
    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            long a = sc.nextLong();
            long b = sc.nextLong();

            System.out.println(pow(a,b));
        }
    }
}Tower
*/