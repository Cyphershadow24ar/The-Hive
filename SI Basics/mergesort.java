public class mergesort {
    /*
    
    import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i= 0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        mergesort(arr, 0, n-1);
    }

    static void mergesort(int[] arr, int low, int high){
        if( low == high) return ;

        int mid = (low + high)/2;
        mergesort(arr, low, mid);
        mergesort(arr, mid+1, high);
        merge(arr, low, high,mid);

        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] +" ");
        }
        System.out.println();
    }

    static void merge(int[] arr, int low, int high, int mid){
        int p1 = low;
        int p2 = mid+1;
        int idx = 0;
        int[] temp = new int[high - low + 1];
        while(p1 <= mid && p2 <= high){
            if(arr[p1] <= arr[p2]){
                temp[idx++] = arr[p1++];
            }else{
                temp[idx++] = arr[p2++];
            }
        }

        while(p1 <= mid){
            temp[idx++] = arr[p1++];
        }
        while(p2 <= high){
            temp[idx++] = arr[p2++];
        }
        for(int i=0; i<(high-low+1); i++){
            arr[i+low] = temp[i];
        }
    }
}

    */
}
