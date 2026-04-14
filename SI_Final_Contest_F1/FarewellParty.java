/*
Farewell Party There is a full-day farewell party at your college. A number of guests will arrive at the party during their preferred time slots. You have to analyse the guest list and report the minimum capacity room required to host the event successfully.

Input format
The first line of input contains T - the number of test cases. The first line of each test case contains N - number of guests. It's followed by N lines each containing 2 integers - A(the arrival time) and D(the departure time) of the guest in seconds.

Output Format
For each test case, print the minimum capacity room required to accommodate all the guests, separated by a new line.

Constraints
30 points
1 <= T <= 100
1 <= N <= 100
1 <= A[i] <= D[i] <= 86400

70 points
1 <= T <= 100
1 <= N <= 10000
1 <= A[i] <= D[i] <= 86400

Example
Input
3
3
1 5
5 10
15 20
7
30 50
1 70
20 25
50 100
80 90
15 65
25 70
4
16 58
4 16
12 71
57 72

Output
2
5
3

Explanation

Self Explanatory
*/

import java.io.*;
import java.util.*;

public class FarewellParty {

    // Fast I/O to handle massive inputs seamlessly
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
            
            // The day has 86400 seconds. We need up to 86400 + 1 for the departure logic.
            int[] timeline = new int[86402];
            int maxDepartureTime = 0;
            
            for (int i = 0; i < N; i++) {
                int arrival = nextInt();
                int departure = nextInt();
                
                // Guest enters
                timeline[arrival]++;
                
                // Guest leaves (capacity frees up the second AFTER departure)
                timeline[departure + 1]--;
                
                if (departure > maxDepartureTime) {
                    maxDepartureTime = departure;
                }
            }
            
            int currentGuests = 0;
            int maxCapacityRequired = 0;
            
            // Sweep through the timeline to find the peak overlapping intervals
            // We only need to loop up to the latest departure time to save operations
            for (int i = 1; i <= maxDepartureTime; i++) {
                currentGuests += timeline[i];
                if (currentGuests > maxCapacityRequired) {
                    maxCapacityRequired = currentGuests;
                }
            }
            
            out.append(maxCapacityRequired).append("\n");
        }
        
        // Print all outputs at once
        System.out.print(out.toString());
    }
}
