import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class MatrixDiatrav {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int m = sc.nextInt();
        int n = sc.nextInt();

        int[][] mat = new int[m][n];

        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                mat[i][j] = sc.nextInt();
            }
        }

        List<Integer> res = new ArrayList<>();

        for(int d=0; d<m+n-1; d++){
            List<Integer> temp = new ArrayList<>();

            int r = d < n ? 0 : d-n+1;
            int c = d < n ? d : n-1;

            while(r<m && c>=0){
                temp.add(mat[r][c]);
                r++; 
                c--;
            }

            if(d%2==0) Collections.reverse(temp);

            res.addAll(temp);
        }
           for(int x: res) System.out.print(x+" ");
    }
}
