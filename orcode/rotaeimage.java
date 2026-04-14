import java.util.*;

public class rotaeimage {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[][] a = new int[n][n];

        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                a[i][j] = sc.nextInt();
            }
        }

        // Transpose
        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                int temp = a[i][j];
                a[i][j] = a[j][i];
                a[j][i] = temp;
            }
        }

        // Reverse rows
        for(int i=0;i<n;i++){
            int l=0, r=n-1;
            while(l<r){
                int temp = a[i][l];
                a[i][l] = a[i][r];
                a[i][r] = temp;
                l++; 
                r--;
            }
        }

        // Output
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print(a[i][j]);
                if(j<n-1) System.out.print(" ");
            }
            System.out.println();
        }
    }
}
