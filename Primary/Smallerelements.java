public class Smallerelements {
    /*
    
    import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while(t-- > 0){
            int n =sc.nextInt();
            int[] arr = new int[n];

            for(int i=0; i<n; i++){
                arr[i] = sc.nextInt();
            }
            System.out.println(mergeSort(arr, 0, n-1));
        }
    }

    static long mergeSort(int[] arr, int low, int high){
        long count = 0;

        if(low < high){
            int mid = (low + high) / 2;

            count += mergeSort(arr, low, mid);
            count += mergeSort(arr, mid+1, high);
            count += merge(arr, low, mid, high);
        }
        return count;
    }

    static long merge(int[] arr, int low, int mid, int high){
        int n1 = mid - low  +1;
        int n2 = high - mid;

        int[] l = new int[n1];
        int[] r = new int[n2];

        for(int i=0; i<n1; i++) l[i] = arr[low + i];
        for(int j=0; j<n2; j++) r[j] = arr[mid + 1 +j];

        int i=0, j=0, k=low;
        long count = 0;

        while(i<n1 && j<n2){
            if(l[i] <= r[j]){
                arr[k++] = l[i++];
            }else{
                arr[k++] = r[j++];
                count += (n1 - i);
            }
        }

        while(i<n1) arr[k++] = l[i++];
        while(j<n2) arr[k++] = r[j++];

        return count;
    }
}

    */
}
