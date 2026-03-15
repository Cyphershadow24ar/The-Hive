public class longestpalSubstring {
    /*
    
    import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t =sc.nextInt();

        while(t-- > 0){
            int n =sc.nextInt();
            String s = sc.next();
            
            int res = Integer.MIN_VALUE;
            for(int i=0; i<s.length(); i++){
                int even= valid(s, n, i, i+1);
                int odd = valid(s, n, i-1, i+1);
                res = Math.max(Math.max(res, odd),even);
            }
            System.out.println(res);
        }
    }

    static int valid(String s, int n , int p1, int p2){
        while(p2<n && p1>= 0 && s.charAt(p1) == s.charAt(p2)){
            p1--;
            p2++;
        }
        return p2-p1-1;
    }
}
    
    */
}
