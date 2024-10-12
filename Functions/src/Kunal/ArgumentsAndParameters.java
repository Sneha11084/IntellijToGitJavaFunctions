package Kunal;

import java.util.Scanner;

public class ArgumentsAndParameters {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
//        int a = in.nextInt();
//        int b = in.nextInt();
        System.out.println(sum(in.nextInt(),in.nextInt())); //these are the arguments
    }

    static int sum(int a, int b){ //these are parameters
        return a + b;
    }
}
