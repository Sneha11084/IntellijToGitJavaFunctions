package Kunal;

import java.util.Scanner;

public class ChangeName {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String name = in.next();
        changeName(name);
        System.out.println(name); // similarly this will not change the name
    }
//  The name use in below fxn, it's scope is limited to that fxn only
    static void changeName(String name){//this name is a copy of the reference variable and pointing towards the same object
        name = "Kunal"; // Here name (the copy one) is now pointing towards a new object named Kunal but the original name is still pointing to the previous object only
//        System.out.println(naam);
    }

}
