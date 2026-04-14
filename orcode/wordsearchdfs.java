import java.util.Scanner;

public class wordsearchdfs {
    static boolean dfs(char[][] b, String w, int i, int j, int k){
        if(k == w.length()) return true;

        if(i<0 || j<0 || i>=b.length || j>=b[0].length || b[i][j] != w.charAt(k))
            return false;

        char temp = b[i][j];
        b[i][j] = '#';

        boolean found = dfs(b,w,i+1,j,k+1) ||
                        dfs(b,w,i-1,j,k+1) ||
                        dfs(b,w,i,j+1,k+1) ||
                        dfs(b,w,i,j-1,k+1);

        b[i][j] = temp;

        return found;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int m = sc.nextInt();
        int n = sc.nextInt();
        sc.nextLine();

        char[][] board = new char[m][n];

        for(int i=0;i<m;i++){
            String s = sc.nextLine();
            for(int j=0;j<n;j++){
                board[i][j] = s.charAt(j*2);
            }
        }

        String word = sc.nextLine();

        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(dfs(board, word, i, j, 0)){
                    System.out.println("true");
                    return;
                }
            }
        }

        System.out.println("false");
    }
}
