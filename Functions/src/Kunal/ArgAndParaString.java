package Kunal;

import java.util.Scanner;

public class ArgAndParaString {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
//        String name = in.next().trim();
        System.out.println(Greet(in.next().trim()));
    }

    static String Greet(String name) {
        return "Hello " + name;
    }


}
