public class EnclosingSubstring {
    /*
    
    import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long t =sc.nextLong();
        while(t-- > 0){
            String a = sc.next();
            String b = sc.next();

            int p1 =0;
            int p2 = 0;
            long ans = Integer.MAX_VALUE;
            long[] cntA = new long[26];
            long[] cntB = new long[26];
        
            for(int i=0; i<a.length(); i++){
                cntA[a.charAt(i) - 'a']++;
            }

            while(p2 < b.length()){
                cntB[b.charAt(p2) - 'a']++;
                p2++;
                while(valid(cntB, cntA)){
                    ans = Math.min(ans,p2-p1);
                    cntB[b.charAt(p1)-'a']--;
                    p1++;
                }
            }
            if(ans == Integer.MAX_VALUE){
                System.out.println(-1);
            }else{
                System.out.println(ans);
            }
        }
    }

    static boolean valid(long cntB[], long cntA[]){
        for(int i=0; i<26; i++){
            if(cntA[i]>cntB[i]){
                return false;
            }
        }
        return true;
    }
}
    */
}
