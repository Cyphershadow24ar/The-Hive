import java.util.*;

public class Minimumwindowsubstring {
    public static void main(String[] args) {
        // Write your code here
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String t = sc.next();

        int[] frq = new int[256];
        for(int i=0; i<t.length(); i++){
            frq[t.charAt(i)]++;
        }

        int l=0, cnt =0;
        int min = Integer.MAX_VALUE;
        int start = 0;

        for(int r= 0; r<s.length(); r++){
            char c = s.charAt(r);

            frq[c]--;
            if(frq[c] >= 0){
                cnt++;
            }

            while(cnt == t.length()){
                if(r - l + 1 < min){
                    min = r -l +1;
                    start = l;
                }

                char lc = s.charAt(l);
                frq[lc]++;

                if(frq[lc] > 0){
                    cnt--;
                }
                l++;
            }
        }
        if(min == Integer.MAX_VALUE){
            System.out.println("");
        }else{
            System.out.println(s.substring(start, start+min));
        }
    }
}
