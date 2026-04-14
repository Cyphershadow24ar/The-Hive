import java.util.*;

public class Validsudoku {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(); // 9
        int m = sc.nextInt(); // 9
        sc.nextLine();

        char[][] board = new char[n][m];

        for(int i=0;i<n;i++){
            String s = sc.nextLine();
            for(int j=0;j<m;j++){
                board[i][j] = s.charAt(j*2);
            }
        }

        HashSet<String> set = new HashSet<>();

        for(int i=0;i<9;i++){
            for(int j=0;j<9;j++){
                char c = board[i][j];

                if(c == '.') continue;

                if(!set.add(c + "row" + i) ||
                   !set.add(c + "col" + j) ||
                   !set.add(c + "box" + i/3 + "-" + j/3)){
                    System.out.println("false");
                    return;
                }
            }
        }

        System.out.println("true");
    }
}

