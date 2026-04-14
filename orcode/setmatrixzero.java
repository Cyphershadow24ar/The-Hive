import java.util.*;

public class setmatrixzero {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int m = sc.nextInt();
        int n = sc.nextInt();

        int[][] a = new int[m][n];

        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                a[i][j] = sc.nextInt();
            }
        }

        boolean row0 = false, col0 = false;

        for(int i=0;i<m;i++) if(a[i][0]==0) col0=true;
        for(int j=0;j<n;j++) if(a[0][j]==0) row0=true;

        for(int i=1;i<m;i++){
            for(int j=1;j<n;j++){
                if(a[i][j]==0){
                    a[i][0]=0;
                    a[0][j]=0;
                }
            }
        }

        for(int i=1;i<m;i++){
            for(int j=1;j<n;j++){
                if(a[i][0]==0 || a[0][j]==0){
                    a[i][j]=0;
                }
            }
        }

        if(row0){
            for(int j=0;j<n;j++) a[0][j]=0;
        }

        if(col0){
            for(int i=0;i<m;i++) a[i][0]=0;
        }

        // Output
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                System.out.print(a[i][j]);
                if(j<n-1) System.out.print(" ");
            }
            System.out.println();
        }
    }
}
