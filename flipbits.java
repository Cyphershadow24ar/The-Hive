/*

import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        while(t-- > 0){
            int a = sc.nextInt();
            int b = sc.nextInt();

            int x = a ^ b;

            int count = 0;

            while(x > 0){
                x = x & (x -1);
                count++;
            }

            System.out.println(count);
        }
    }
}

*/