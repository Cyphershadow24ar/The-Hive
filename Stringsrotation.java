import java.io.*;
import java.util.*;

public class Stringsrotation {
    Scanner sc = new Scanner(System.in);

        int n =sc.nextInt();
        String a = sc.next();
        String b = sc.next();

        if(a.length() != b.length()){
            System.out.print("no");
            return;
        }

        String B = b + b;

        if(B.contains(a)){
            System.out.print("yes");
        }else{
            System.out.print("no");
        }


    }
