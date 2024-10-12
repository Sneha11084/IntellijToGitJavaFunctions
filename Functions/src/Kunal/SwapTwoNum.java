package Kunal;

import java.net.SecureCacheResponse;
import java.util.Scanner;

import static java.util.Collections.swap;

public class SwapTwoNum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        swap(a, b);
        System.out.println(a + " " + b); // This will not swap the value of a and b because originally a and b are still
//      the same.
    }

    static void swap(int a, int b) {
        int temp = a;
        a = b;
        b = temp;
//        System.out.println(a + " " + b); // this will swap ofc
    }
}



