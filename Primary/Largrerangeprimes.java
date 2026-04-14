public class Largrerangeprimes {
    /*
    import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t-- > 0){
            long m = sc.nextLong();
            long n = sc.nextLong();

            int limit = (int)Math.sqrt(n) + 1;

            boolean[] prime = new boolean[limit + 1];
            Arrays.fill(prime, true);

            for(int i=2; i*i <= limit; i++){
                if(prime[i]){
                    for(int j=i*i; j<= limit; j+= i){
                        prime[j] = false;
                    }
                }
            }

            boolean[] segment = new boolean[(int)(n-m+1)];
            Arrays.fill(segment, true);

            for(int p =2; p <= limit; p++){
                if(prime[p]){
                    long s = Math.max((long)p * p, ((m+p-1)/p) * p);
                    for(long j = s; j<= n; j+= p){
                        segment[(int)(j - m)] = false;
                    }
                }
            }

            for(long i=m; i<=n ;i++){
                if(i > 1 && segment[(int)(i-m)]){
                    System.out.println(i);
                }
                //System.out.println();

            }
        }
    }
}
    */
}
