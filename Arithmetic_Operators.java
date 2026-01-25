// PROBLEM : Arithmetic Operators

// SOLUITON :

import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Main. */
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        int sum = a+b;
        int diff = a-b;
        int product = a*b;
        int div = a/b;
        int rem = a%b;

        System.out.println("Sum: "+sum);
        System.out.println("Difference: "+diff);
        System.out.println("Product: "+product);
        System.out.println("Division: "+div);
        System.out.println("Remainder: "+rem);
    }
}
