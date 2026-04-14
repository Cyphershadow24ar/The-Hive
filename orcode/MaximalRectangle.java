import java.util.*;

public class MaximalRectangle {
    
    static int largestHist(int[] h){
        Stack<Integer> st = new Stack<>();
        int max = 0;

        for(int i=0;i<=h.length;i++){
            int cur = (i==h.length) ? 0 : h[i];

            while(!st.isEmpty() && cur < h[st.peek()]){
                int height = h[st.pop()];
                int width = st.isEmpty() ? i : i - st.peek() - 1;
                max = Math.max(max, height * width);
            }
            st.push(i);
        }
        return max;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int m = sc.nextInt();
        int n = sc.nextInt();

        int[][] mat = new int[m][n];

        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                mat[i][j] = sc.nextInt();
            }
        }

        int[] height = new int[n];
        int ans = 0;

        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(mat[i][j]==1) height[j]++;
                else height[j]=0;
            }
            ans = Math.max(ans, largestHist(height));
        }

        System.out.println(ans);
    }
} 

