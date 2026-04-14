/*
Distinct Elements in Window Given an array of integers and a window size K, find the number of distinct elements in every window of size K of the given array.

Input Format
The first line of input contains T - the number of test cases. It's followed by 2T lines. The first line of each test case contains the N-size of the array and the K-size of the window. The second line contains N integers - elements of the array.

Output Format
For each test case, print the number of distinct elements in every window of size K, separated by a new line.

Constraints
30 points
1 <= N <= 100
1 <= K <= N

70 points
1 <= N <= 10000
1 <= K <= N

General Constraints
1 <= T <= 1000
-100 <= ar[i] <= 100

Example
Input
3
5 3
-2 -4 -2 4 -2
10 7
3 -4 -3 -4 -2 0 2 -2 6 0
17 13
-5 -1 4 8 -5 -3 -4 7 4 -4 0 8 0 -2 3 2 5

Output
2 3 2
6 5 6 5
8 9 9 10 11

Explanation

Self Explanatory
*/

import java.io.*;
import java.util.*;

public class DistinctElementInAwindow {

    // Fast I/O to handle up to 10^7 integers quickly
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;

    static String next() throws IOException {
        while (st == null || !st.hasMoreElements()) {
            String line = br.readLine();
            if (line == null) return null;
            st = new StringTokenizer(line);
        }
        return st.nextToken();
    }

    static int nextInt() throws IOException {
        return Integer.parseInt(next());
    }

    public static void main(String[] args) throws IOException {
        String tStr = next();
        if (tStr == null) return;
        
        int T = Integer.parseInt(tStr);
        StringBuilder out = new StringBuilder();
        
        while (T-- > 0) {
            int N = nextInt();
            int K = nextInt();
            
            int[] arr = new int[N];
            for (int i = 0; i < N; i++) {
                arr[i] = nextInt();
            }
            
            // Frequency array to replace HashMap. Size 201 handles -100 to 100.
            int[] freq = new int[201];
            int distinctCount = 0;
            
            // 1. Process the very first window of size K
            for (int i = 0; i < K; i++) {
                int val = arr[i] + 100; // Apply offset
                if (freq[val] == 0) {
                    distinctCount++; // Newly discovered distinct element
                }
                freq[val]++;
            }
            
            out.append(distinctCount);
            
            // 2. Slide the window from index K to the end of the array
            for (int i = K; i < N; i++) {
                // Remove the element that is sliding out of the left side of the window
                int leftVal = arr[i - K] + 100;
                freq[leftVal]--;
                if (freq[leftVal] == 0) {
                    distinctCount--; // An element has completely left the window
                }
                
                // Add the new element sliding into the right side of the window
                int rightVal = arr[i] + 100;
                if (freq[rightVal] == 0) {
                    distinctCount++; // Newly discovered distinct element
                }
                freq[rightVal]++;
                
                // Append the current window's distinct count
                out.append(" ").append(distinctCount);
            }
            out.append("\n");
        }
        
        // Print all output at once
        System.out.print(out.toString());
    }
}
