import java.io.*;
import java.util.*;

public class primeCoins {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t =sc.nextInt();

        while(t-- > 0){
            long n =sc.nextLong();

            if(n %  6== 0){
                System.out.println("Banta");
            }else{
                System.out.println("Santa");
            }
        }
    }
}