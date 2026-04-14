/*
Path in a Graph Given an undirected graph, you have to find if there exists a path between 2 given nodes of the graph.

Input Format
The first line of input contains T - number of test cases. First line of each test case contains N - number of nodes and M - number of edges. It is followed by M lines, each contains a pair (u,v) - denoting an undirected edge between node u and node v. The next line contains Q - number of queries. Its followed by Q lines, each contains a pair (S,D) - denoting an query to check if there exits a path between node S and node D.

Output Format
For each test case, first print the test case number as shown. For each query of a test case, print "Yes" if path exists between the nodes of the query, print "No" otherwise, separated by new line.

Constraints
1 <= T <= 1000
1 <= N <= 100
0 <= M, Q <= min(N*N, 100)
1 <= u, v, S, D <= N

Example
Input
2
5 3
1 3
2 4
3 2
4
1 5
3 4
4 5
1 4
10 9
3 4
5 1
2 5
4 6
2 3
6 3
1 4
8 9
8 10
5
2 4
8 4
9 10
10 5
9 7

Output
Test Case #1:
No
Yes
No
Yes
Test Case #2:
Yes
No
Yes
No
No

Explanation

Self Explanatory
*/

package SI_Final_Contest_F2;

import java.io.*;
import java.util.*;

public class Pathinagraph {

    // Fast I/O
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
    }

    // DSU variables
    static int[] parent;
    static int[] rank;

    // Find function with Path Compression
    static int find(int i) {
        if (parent[i] == i) {
            return i;
        }
        // Path compression: attach the node directly to the root
        return parent[i] = find(parent[i]);
    }

    // Union function with Union by Rank
    static void union(int i, int j) {
        int rootI = find(i);
        int rootJ = find(j);

        if (rootI != rootJ) {
            // Attach the smaller tree under the larger tree
            if (rank[rootI] < rank[rootJ]) {
                parent[rootI] = rootJ;
            } else if (rank[rootI] > rank[rootJ]) {
                parent[rootJ] = rootI;
            } else {
                parent[rootJ] = rootI;
                rank[rootI]++;
            }
        }
    }

    public static void main(String[] args) {
        FastReader sc = new FastReader();
        String tStr = sc.next();
        if (tStr == null) return;
        
        int T = Integer.parseInt(tStr);
        StringBuilder out = new StringBuilder();

        for (int t = 1; t <= T; t++) {
            int N = sc.nextInt();
            int M = sc.nextInt();

            // Initialize DSU arrays (1-based indexing)
            parent = new int[N + 1];
            rank = new int[N + 1];
            for (int i = 1; i <= N; i++) {
                parent[i] = i;
                rank[i] = 0;
            }

            // Read edges and build components
            for (int i = 0; i < M; i++) {
                int u = sc.nextInt();
                int v = sc.nextInt();
                union(u, v);
            }

            int Q = sc.nextInt();
            out.append("Test Case #").append(t).append(":\n");

            // Answer queries instantly
            for (int i = 0; i < Q; i++) {
                int S = sc.nextInt();
                int D = sc.nextInt();

                if (find(S) == find(D)) {
                    out.append("Yes\n");
                } else {
                    out.append("No\n");
                }
            }
        }
        
        // Print all output at once to bypass I/O bottlenecks
        System.out.print(out.toString());
    }
}
