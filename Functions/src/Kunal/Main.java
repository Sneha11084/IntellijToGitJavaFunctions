package Kunal;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//      sum();
        System.out.println(sum1());
    }

    static int sum1(){
        Scanner in = new Scanner(System.in);
        int num1 = in.nextInt();
        int num2 = in.nextInt();
        return num1 + num2;
    }

    static void sum(){
        Scanner in = new Scanner(System.in);
        int num1 = in.nextInt();
        int num2 = in.nextInt();
        System.out.println(num1 + num2);
    }
}