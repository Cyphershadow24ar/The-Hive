
import java.util.*;

public class Gameoflife {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int m = sc.nextInt();
        int n = sc.nextInt();

        int[][] grid = new int[m][n];

        // Input
        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                grid[i][j] = sc.nextInt();
            }
        }

        int[][] dirs = {
            {-1,-1},{-1,0},{-1,1},
            {0,-1},{0,1},
            {1,-1},{1,0},{1,1}
        };

        int[][] ans = new int[m][n];

        // Logic
        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){

                int live = 0;

                for(int[] d : dirs){
                    int x = i + d[0];
                    int y = j + d[1];

                    if(x >= 0 && y >= 0 && x < m && y < n && grid[x][y] == 1){
                        live++;
                    }
                }

                // Apply rules
                if(grid[i][j] == 1){
                    if(live == 2 || live == 3){
                        ans[i][j] = 1;
                    }
                } else {
                    if(live == 3){
                        ans[i][j] = 1;
                    }
                }
            }
        }

        // Output (FIXED FORMAT)
        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                System.out.print(ans[i][j]);
                if(j < n - 1) System.out.print(" ");
            }
            System.out.println();
        }
    }
}