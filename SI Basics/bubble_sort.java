/*
import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] ar = new int[n];

        for(int i=0; i<n; i++){
            ar[i] = sc.nextInt();
        }

        for(int i=0; i<n-1; i++){
            for(int j=0; j<n-1-i;j++){
                if(ar[j] > ar[j+1]){
                    swap(ar,j,j+1);
                }
            }
            for(int k=0; k<n;k++){
                System.out.print(ar[k] + " ");
            }
            System.out.println();
        }
    }

    static void swap(int[] ar, int i,int j){
        int temp;
        temp = ar[i];
        ar[i] = ar[j];
        ar[j] = temp;
    }
}
*/