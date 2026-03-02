import java.io.*;
import java.util.*;

public class Balanced_paranthesis {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t =sc.nextInt();
        int testnum = 1;
        while(t-- > 0){
            int n = sc.nextInt();

            System.out.println("Test Case #"+ testnum+":");
            testnum++;
            char[] c = new char[2*n];
            Bp(c, 0, 0, n, 0);
        }
    }

    static void Bp(char c[], int open, int close, int n, int idx){
        if(idx == 2*n){
            System.out.println(new String(c));
            return ;
        }

        if(open < n){
            c[idx] = '{';
            Bp(c, open+1, close, n, idx+1);
        }
        if(close < open){
            c[idx] = '}';
            Bp(c, open, close+1, n, idx+1);
        }
        return;
    }
}