/*
Continuous Height of Tree Given an array of unique elements, construct a Binary Search Tree. After inserting every new node, print the height of the tree.

Input Format
First line of input contains T - number of test cases. Its followed by 2T lines. First line of each test case contains N - number of nodes in the BST. The next line contains N unique integers - value of the nodes.

Output Format
For each test case, print the height of the Binary Search Tree after every insertion, separated by newline.

Constraints

1 <= T <= 500
0 <= ar[i] <= 105

30 points
1 <= N <= 100

70 points
1 <= N <= 10000

Example
Input
3
5
1 2 3 4 5
5
3 2 4 1 5
7
4 5 15 0 1 7 17

Output
0 1 2 3 4 
0 1 1 2 2 
0 1 2 2 2 3 3 

Explanation 

Self Explanatory
*/

import java.io.*;
import java.util.*;

public class ContinuousHeightofTree {

    public static void main(String[] args) throws IOException {
        // Fast I/O for handling massive constraints smoothly
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        String tStr = br.readLine();
        if (tStr == null || tStr.trim().isEmpty()) return;
        
        int T = Integer.parseInt(tStr.trim());
        StringBuilder out = new StringBuilder();

        while (T-- > 0) {
            st = new StringTokenizer(br.readLine());
            int N = Integer.parseInt(st.nextToken());
            
            st = new StringTokenizer(br.readLine());

            // Map to store: Node Value -> Depth of that node
            TreeMap<Integer, Integer> depthMap = new TreeMap<>();
            int currentMaxHeight = 0;

            for (int i = 0; i < N; i++) {
                int val = Integer.parseInt(st.nextToken());

                // Find the inorder predecessor and successor
                Map.Entry<Integer, Integer> lower = depthMap.lowerEntry(val);
                Map.Entry<Integer, Integer> higher = depthMap.higherEntry(val);

                // Get their depths. If they don't exist, treat their depth as -1.
                int depthOfPredecessor = (lower != null) ? lower.getValue() : -1;
                int depthOfSuccessor = (higher != null) ? higher.getValue() : -1;

                // The depth of the newly inserted node
                int nodeDepth = 1 + Math.max(depthOfPredecessor, depthOfSuccessor);
                
                // Store the calculated depth for future insertions
                depthMap.put(val, nodeDepth);

                // Update the maximum height of the overall tree
                currentMaxHeight = Math.max(currentMaxHeight, nodeDepth);

                // Append output
                out.append(currentMaxHeight);
                if (i < N - 1) {
                    out.append(" ");
                }
            }
            out.append("\n");
        }
        
        // Print all outputs at once to minimize I/O overhead
        System.out.print(out.toString());
    }
}
