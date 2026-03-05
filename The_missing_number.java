import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 100;

        int natural_num_sum = (n * (n+1))/2;

        int sum = 0;
        while(sc.hasNextInt()){
            sum += sc.nextInt();
        }

        int ans = natural_num_sum - sum;
        System.out.print(ans);
    }
}