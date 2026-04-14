import java.util.*;

public class Selectionsortidx {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            int[] arr = new int[n];
            for(int i =0; i<n; i++){
                arr[i] = sc.nextInt();
            }

            for(int i=0; i<=n;i++){
                int max = 0;
                int idx = n-1-i;
                for(int j= 1; j<= idx; j++){
                    if(arr[j] > arr[max]){
                        max =j;
                    }
                }
                System.out.print(max + " ");

                int temp = arr[max];
                arr[max] = arr[idx];
                arr[idx] = temp;
            }
            System.out.println();
        }
    }
}
