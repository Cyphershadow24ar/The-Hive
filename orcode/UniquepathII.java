import java.util.*;

public class UniquepathII {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int m = sc.nextInt();
        int n = sc.nextInt();

        int[][] g = new int[m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                g[i][j] = sc.nextInt();
            }
        }

        int[][] dp = new int[m][n];
        // edge case 
        
        if(g[0][0] == 1){
            System.out.println(0);
            return;
        }

        dp[0][0] = 1;

        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(g[i][j] == 1){
                    dp[i][j] = 0;
                } else {
                    if(i > 0) dp[i][j] += dp[i-1][j];
                    if(j > 0) dp[i][j] += dp[i][j-1];
                }
            }
        }

        System.out.println(dp[m-1][n-1]);
    }
}