/*
Binary Strings without Adjacent 1s 
Find the number of binary strings of length N, such that there are no adjacent 1s in that string.

Input Format
The first line of input contains T - number of test cases. It is followed by T lines, each line contains N - length of the binary string.

Output Format
For each test case, print the number of binary strings of length N, separated by new line. Since the answer can be very large, print answer % 1000000007 [1e9+7].

Constraints
1 <= T <= 105
1 <= N <= 105

Example
Input
5
3
11
7
5
500

Output
5
233
34
13
73724597

Explanation

Example 1:
You can construct the following binary strings of length 3 with no adjacent 1s:
000, 001, 010, 100, 101
*/


import java.io.*;

public class BinaryStringswithoutAdjacent1s {

    // Modulo constant provided by the problem
    static final int MOD = 1000000007;
    static final int MAX_N = 100005; // Slightly larger than 10^5 to be safe
    
    // DP array to hold our precomputed answers
    static int[] dp = new int[MAX_N];

    // Static block to compute the DP table EXACTLY ONCE when the class loads
    static {
        dp[1] = 2; // Base case for N = 1
        dp[2] = 3; // Base case for N = 2
        
        for (int i = 3; i < MAX_N; i++) {
            // Apply modulo at every step to prevent integer overflow
            dp[i] = (dp[i - 1] + dp[i - 2]) % MOD;
        }
    }

    public static void main(String[] args) throws IOException {
        // Fast I/O setup
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
        if (line == null || line.trim().isEmpty()) return;
        
        int T = Integer.parseInt(line.trim());
        StringBuilder out = new StringBuilder();
        
        // Process each test case in O(1) time
        while (T-- > 0) {
            int N = Integer.parseInt(br.readLine().trim());
            out.append(dp[N]).append("\n");
        }
        
        // Print all outputs in one bulk operation
        System.out.print(out.toString());
    }
}
