package Kunal;

public class shadowing {
    static int x = 90; //this will be shadowed at line 8
    public static void main(String[] args) {
        System.out.println(x); //print 90
//        int x = 40;
        int x; //declaring variable
//        System.out.println(x); // gives error ;scope begins when the value is initialized
        x = 40; //initialising variable
        System.out.println(x); //print 40
        fun();
    }

    static void fun(){
        System.out.println(x); //print 90
    }
}
