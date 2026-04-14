public class Interleavings {
    /*
    import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        for(int tc = 1; tc <= t; tc++){
            String a = sc.next();
            String b = sc.next();

            char[] ans = new char[a.length() + b.length()];

           List<String> list = new ArrayList<>();

           interl(a,b,0,0,ans,0,list);
           Collections.sort(list);
           System.out.println("Case #"+ tc+ ":");
           for(String s : list){
            System.out.println(s);
           }
        }
    }

    static void interl(String a, String b, int i, int j, char[] ans, int k,List<String> list){
        if(i == a.length() &&  j == b.length()){
            list.add(new String(ans));
            return;
        }

        if(i < a.length()){
            ans[k] = a.charAt(i);
            interl(a, b, i+1, j, ans, k+1, list);
        }

        if(j < b.length()){
            ans[k] = b.charAt(j);
            interl(a, b, i, j+1, ans, k+1, list);
        }
    }
}
    */
}
