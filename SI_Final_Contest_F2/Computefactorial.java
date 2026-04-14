/*
Compute Factorial Given a number N, print N!.

Input Format
The first line of input contains T - number of test cases. It's followed by T lines, each containing a single number N.

Output Format
For each test case, print N!. Since the result can be very large, print N! % 1000000007 [1e9+7].

Constraints
1 <= T <= 106
0 <= N <= 106

Example
Input
3
5
20
50

Output
120
146326063
318608048

Explanation

Self Explanatory
*/

package SI_Final_Contest_F2;

import java.io.*;

public class Computefactorial {
    
    static final int MOD = 1000000007;
    static final int MAX_N = 1000000;
    
    // DP array to hold our precomputed factorials
    static int[] fact = new int[MAX_N + 1];

    // Static block to compute the table EXACTLY ONCE when the class loads
    static {
        fact[0] = 1;
        for (int i = 1; i <= MAX_N; i++) {
            // 1L forces the multiplication to happen in 64-bit 'long' space 
            // preventing overflow before the modulo is applied.
            fact[i] = (int)((1L * fact[i - 1] * i) % MOD);
        }
    }

    public static void main(String[] args) throws IOException {
        InputStream in = System.in;
        // PrintWriter wrapped in a BufferedOutputStream is incredibly fast for massive output
        PrintWriter out = new PrintWriter(new BufferedOutputStream(System.out));
        
        int T = readInt(in);
        if (T == -1) return;
        
        // Answer each query in O(1) time
        while (T-- > 0) {
            int N = readInt(in);
            out.println(fact[N]);
        }
        
        // Flush the output buffer to the console at the very end
        out.flush();
    }

    // Ultra-Fast I/O: Reads integers byte-by-byte directly from the input stream.
    // This entirely avoids creating String objects, bypassing the Garbage Collector.
    static int readInt(InputStream in) throws IOException {
        int ret = 0;
        int c = in.read();
        
        // Skip whitespace characters
        while (c <= ' ') {
            if (c == -1) return -1; // End of File
            c = in.read();
        }
        
        // Build the integer mathematically
        do {
            ret = ret * 10 + (c - '0');
        } while ((c = in.read()) > ' ');
        
        return ret;
    }
}
