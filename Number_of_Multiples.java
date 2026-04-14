// PROBLEM : Number of Multiples

// SOLUTION :

import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Main. */

        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();

        long count1 = n/3;
        long count2 = n/5;
        long count3 = n/15;

        long result = count1 + count2 - count3;

        System.out.print(result);

        sc.close();
    }
}
