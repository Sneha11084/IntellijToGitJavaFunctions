package Kunal;

public class FunctionOverloading {
    // Two or more fnx with the same name can exist but the arguments should be different
    // Function Overloading decides at compile time that which arg should be passed in which fxn
    // Condition : either the number of args should be different or the type of args should be different
    public static void main(String[] args) {
        int a = 2;
        String name = "Sneha";
        fun(a);
        fun(name);
    }

    static void fun(int a){
        System.out.println(a);
    }

    static void fun(String name){// or (int a, int b)
        System.out.println(name);
    }
}
