package Kunal;

import java.util.Scanner;

public class ArmstrongNum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        System.out.println(isArmstrong(n));
    }

    static boolean isArmstrong(int n){
        // finding total number of digits
        int c = 0;
        int n1 = n;
        int n2 = n;
        while (n>0){
            n = n / 10;
            c += 1;
        }

        // checking Armstrong

        int ans = 0;
        while (n1>0){
            int temp = n1 % 10;
            ans = ans + temp * temp * temp;
            n1 = n1 / 10;
        }
        return n2 == ans;
    }
}
