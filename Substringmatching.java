public class  Substringmatching {
    /*
    import java.io.*;
import java.util.*;

public class Main {

    static long mod = 1000000007;
    static long base = 31;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while(t-- > 0){
            String a = sc.next();
            String b = sc.next();

            int n = a.length();
            int m = b.length();

            long[] hasha = new long[n];
            long[] hashb = new long[m];

            long[] p = new long[Math.max(n,m)+1];
            p[0] = 1;

            for(int i=1; i<p.length; i++){
                p[i] = (p[i-1]* base) % mod;
            }

            hasha[0] = a.charAt(0) - 'a'+1;
            for(int i=1; i<n;i++){
                hasha[i] = (hasha[i-1]*base + (a.charAt(i)-'a'+1))% mod;
            }

            hashb[0] = b.charAt(0) - 'a'+1;
            for(int i=1; i<m; i++){
                hashb[i] = (hashb[i-1]*base + (b.charAt(i) - 'a'+1)) % mod;
            }

            int q = sc.nextInt();
            while(q-- > 0){
                int i =sc.nextInt();
                int j =sc.nextInt();
                int k =sc.nextInt();
                int l =sc.nextInt();

                long h1 = getHash(hasha, i,j,p);
                long h2 = getHash(hashb, k,l,p);

                if(h1 == h2){
                    System.out.println("Yes");
                }else{
                    System.out.println("No");
                }
            }
        }
    }

    static long getHash(long[] hash, int l, int r, long[] p){
        long res = hash[r];
        if(l > 0){
            res = (res - hash[l-1]*p[r-l+1] % mod + mod) % mod;
        }
        return res;
    }
}
    */

}