import java.util.*;

public class RabinKarpStringMatcingalgorithm {

    static long mod = 1000000007;
    static long base = 31;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        while(t-- > 0){
            String a = sc.next();
            String b = sc.next();

            int m = a.length();
            int n = b.length();

            long patHash = 0;
            long winHash = 0;
            long power = 1;

            for(int i=0; i<m; i++){
                patHash = (patHash*base + (a.charAt(i)-'a'+1)) % mod;
                winHash = (winHash* base + (b.charAt(i)-'a'+1)) % mod;

                if(i<m-1){
                    power = (power*base) % mod;
                }    
            }

            int count = 0;
            for(int i=0; i<=n-m; i++){
                if(patHash == winHash){
                    count++;
                }

                if(i <n-m){
                    winHash = (winHash - (b.charAt(i) - 'a'+1)*power % mod + mod) % mod;
                    winHash = (winHash*base + (b.charAt(i+m)-'a'+1))%mod;
                }
            }
            System.out.println(count);
            
        }
    }
} 