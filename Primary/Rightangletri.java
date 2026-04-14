import java.util.*;

public class Rightangletri {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int test = 1;

        while(t-- > 0){
            int n= sc.nextInt();

            System.out.println("Case #"+ test + ":");
            test++;

            for(int i= 1; i<=n; i++){
                for(int j = 1; j<= n-i; j++){
                    System.out.print(" ");
                }
                for(int k = 1; k <= i; k++){
                    System.out.print("*");
                }
                System.out.println();
            }
        }
    }   
}