/*

import java.io.*;
import java.util.*;

public class Main {

    public static void hanoi(char src, char temp, char des, int n){
            if(n == 0){
                return;
            }
            hanoi(src, des, temp, n-1);
            System.out.println("Move "+n+" from "+src+" to "+des);
            hanoi(temp,src,des,n-1);
        }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            int moves = (1 << n)-1;
            System.out.println(moves);
            hanoi('A','B','C',n);
        }

        
    }
}
    
*/