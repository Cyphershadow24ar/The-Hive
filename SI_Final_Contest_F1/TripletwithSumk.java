/*Triplet with Sum K You are given an integer array and a positive integer K. You have to tell if there exists i,j,k in the given array such that ar[i]+ar[j]+ar[k]=K, i≠j≠k.

Input Format
The first line of input contains T - the number of test cases. Its followed by 2T lines, the first line contains N and K - the size of the array and the number K. The second line contains the elements of the array.

Output Format
For each test case, print "true" if the arrays contains such elements, "false" otherwise, separated by new line.

Constraints
30 points
1 <= T <= 100
3 <= N <= 100

70 points
1 <= T <= 100
3 <= N <= 1000

General Constraints
-105 <= A[i] <= 105
0 <= K <= 105

Example
Input
3
5 60
1 20 40 100 80
12 54
12 45 52 65 21 645 234 -100 14 575 -80 112
3 15
5 5 5

Output
false
true
true

Explanation

Self Explanatory */

import java.util.Scanner;
import java.util.Arrays;

public class TripletwithSumk {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Read number of test cases
        if (!sc.hasNextInt()) return;
        int T = sc.nextInt();
        
        while (T-- > 0) {
            int N = sc.nextInt();
            int K = sc.nextInt();
            
            int[] arr = new int[N];
            for (int i = 0; i < N; i++) {
                arr[i] = sc.nextInt();
            }
            
            // Print the result for the current test case
            System.out.println(hasTriplet(arr, N, K));
        }
        
        sc.close();
    }
    
    private static boolean hasTriplet(int[] arr, int N, int K) {
        // Step 1: Sort the array
        Arrays.sort(arr);
        
        // Step 2: Fix the first element
        // We only loop up to N-2 because we need at least 3 elements
        for (int i = 0; i < N - 2; i++) {
            
            // Step 3: Use two pointers for the remaining two elements
            int left = i + 1;
            int right = N - 1;
            
            while (left < right) {
                // Calculate current sum of the triplet
                // Using long to prevent overflow, though constraints here keep it within int bounds
                long currentSum = (long) arr[i] + arr[left] + arr[right];
                
                if (currentSum == K) {
                    return true; // Found a valid triplet
                } 
                else if (currentSum < K) {
                    left++;      // We need a larger sum, move left pointer right
                } 
                else {
                    right--;     // We need a smaller sum, move right pointer left
                }
            }
        }
        
        // If we exhaust all possibilities and find nothing
        return false;
    }
}
