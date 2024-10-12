package Kunal;

import java.util.Arrays;

public class VariableLengthArgs {
//    public static void main(String[] args) {
//        fun(2,3,4,5,6,7);
//    }
//
//    static void fun(int...b){ //this is a int array
//        System.out.println(Arrays.toString(b));
//    }

    //Also
    public static void main(String[] args) {
        multiple(2,3,"Sneha","Kunal","Raunak"); // variable length args always at the end
    }

    static void multiple(int a, int b, String...v){
        System.out.println(a + " " + b + " " + Arrays.toString(v));
    }


}
