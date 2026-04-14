/*
Check Palindrome Given a string, check if its a palindrome.

Input Format
First line of input contains T - number of test cases. Its followed by 2T lines, the first line contains N - the size of the string. The second line contains a string of N characters.

Output Format
For each test case, print "Yes" if the string is a palindrome, "No" otherwise, separated by new line.

Constraints
1 <= T <= 1000
1 <= N <= 1000
'a' <= str[i] <='z'

Example
Input
2
5
madam
6
tester

Output
Yes
No

Explanation

Self Explanatory
*/


package SI_Final_Contest_F2;
import java.util.*;

public class Checkpalindrome {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt(); //  input of the string length
            
            String s = sc.next();

            // using two pointer approach
            int left = 0;
            int right = n-1;
            boolean flag = true;
            while(left < right){
                if(s.charAt(left) != s.charAt(right)){
                    flag = false;
                    break;
                }
                left++;
                right--;
            }
            
            if(flag){
                System.out.println("Yes");
            }else{
                System.out.println("No");
            }

        }
    }
}
