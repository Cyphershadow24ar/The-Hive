/*
Sum of Subarrays Given an array of integers, answer queries of the form: [i, j]: Print the sum of array elements from A[i] to A[j], both inclusive.

Input Format
The first line of input contains the N-size of the array. The next line contains N integers - elements of the array. The next line contains Q - number of queries. Each of the next Q lines contains 2 space-separated indexes: i and j.

Output Format
For each query, print the sum of array elements from A[i] to A[j], both inclusive, separated by a new line.

Constraints
30 points
1 <= N, Q <= 10000

70 points
1 <= N, Q <= 500000

General Constraints
-109 <= A[i] <= 109
0 <= i <= j <= N-1

Example
Input
10
1 30 13 -4 -5 12 -53 -12 43 100
4
0 5
1 7
2 3
7 9

Output
47
-19
9
131

Explanation

Self Explanatory
*/

package SI_Final_Contest_F2;

import java.io.*;
import java.util.*;

public class Sumofsubarrays {

    // Fast I/O class for blazing fast input reading
    static class FastReader {
        BufferedReader br;
        StringTokenizer st;

        public FastReader() {
            br = new BufferedReader(new InputStreamReader(System.in));
        }

        String next() {
            while (st == null || !st.hasMoreElements()) {
                try {
                    String line = br.readLine();
                    if (line == null) return null;
                    st = new StringTokenizer(line);
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        int nextInt() {
            return Integer.parseInt(next());
        }
        
        long nextLong() {
            return Long.parseLong(next());
        }
    }

    public static void main(String[] args) {
        FastReader sc = new FastReader();
        
        String nStr = sc.next();
        if (nStr == null) return;
        int N = Integer.parseInt(nStr);
        
        // Use long[] to prevent integer overflow from massive sums
        long[] pref = new long[N];
        
        // 1. Build the Prefix Sum array simultaneously as we read the input
        for (int i = 0; i < N; i++) {
            long val = sc.nextLong();
            if (i == 0) {
                pref[i] = val;
            } else {
                pref[i] = pref[i - 1] + val;
            }
        }
        
        int Q = sc.nextInt();
        
        // StringBuilder is used to buffer output and print it all at once at the very end
        StringBuilder out = new StringBuilder();
        
        // 2. Process each query in O(1) time
        for (int q = 0; q < Q; q++) {
            int i = sc.nextInt();
            int j = sc.nextInt();
            
            if (i == 0) {
                out.append(pref[j]).append("\n");
            } else {
                out.append(pref[j] - pref[i - 1]).append("\n");
            }
        }
        
        // Print everything to the console
        System.out.print(out.toString());
    }
}
