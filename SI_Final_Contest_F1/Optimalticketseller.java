/*
Optimal Ticket Seller There are N number of ticket counters outside a local theatre. Each counter has variable number of tickets - Ti. The price of a ticket on a single counter is equal to the number of tickets remaining in the counter.
For example, if a counter has 10 tickets, the price of the 1st ticket will be Rs 10, 2nd would be Rs 9 and so on. Given that K tickets are going to be sold for a particular show, find the maximum amount that can be collected.

Input Format
First line of input contains T - number of test cases. Its followed by 2T lines. First line of each test case contains N,K - the number of counters and the number of tickets to be sold. Next line contains N integers - the amount of tickets at each counter respectively.

Output Format
For each test case, print the maximum amount collected, separated by new line.

Constraints
30 points
1 <= T <= 100
1 <= N <= 102
1 <= Ti <= 103
0 <= K <= Sum(Ti)

70 points
1 <= T <= 100
1 <= N <= 104
1 <= Ti <= 105
0 <= K <= Sum(Ti)

Example
Input
2
2 4
7 5
4 10
12 10 6 8

Output
23
92

Explanation

Example 1:
Buy 3 tickets from 1st counter: 7+6+5 and 1 ticket from the 2nd counter: 5, Amount = 7+6+5+5=23.
*/

import java.io.*;
import java.util.*;

public class Optimalticketseller {
    
    // Fast I/O to prevent Time Limit Exceeded on massive inputs
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
    
    static long nextLong() throws IOException {
        return Long.parseLong(next());
    }

    public static void main(String[] args) throws IOException {
        String tStr = next();
        if (tStr == null) return;
        int T = Integer.parseInt(tStr);
        
        // Use StringBuilder for fast bulk output
        StringBuilder out = new StringBuilder();
        
        while (T-- > 0) {
            int N = nextInt();
            long K = nextLong();
            
            // freq[p] stores how many counters are currently selling tickets at price 'p'
            // Size is 100001 because max Ti is 10^5
            int[] freq = new int[100001];
            int maxPrice = 0;
            
            for (int i = 0; i < N; i++) {
                int ticketsAtCounter = nextInt();
                freq[ticketsAtCounter]++;
                if (ticketsAtCounter > maxPrice) {
                    maxPrice = ticketsAtCounter;
                }
            }
            
            long maxRevenue = 0;
            
            // Iterate from the highest ticket price down to 1
            for (int p = maxPrice; p > 0 && K > 0; p--) {
                if (freq[p] > 0) {
                    long availableCounters = freq[p];
                    
                    if (K >= availableCounters) {
                        // We can sell 1 ticket from EVERY available counter at this price
                        maxRevenue += availableCounters * p;
                        K -= availableCounters;
                        
                        // After selling 1 ticket, the remaining tickets at these counters drop in price by 1
                        freq[p - 1] += availableCounters;
                    } else {
                        // We only need a fraction of the available tickets to fulfill K
                        maxRevenue += K * p;
                        K = 0; // We've sold exactly K tickets, stop.
                    }
                }
            }
            out.append(maxRevenue).append("\n");
        }
        // Print all results at once
        System.out.print(out.toString());
    }
}
