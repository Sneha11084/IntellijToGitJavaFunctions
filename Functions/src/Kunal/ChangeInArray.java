package Kunal;

import java.util.Arrays;

public class ChangeInArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        change(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void change(int[] array){
        array[0] = 99;
    }

}//
