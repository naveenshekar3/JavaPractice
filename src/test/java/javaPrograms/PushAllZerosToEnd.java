package javaPrograms;

import java.util.Arrays;

public class PushAllZerosToEnd {
    public static void main(String[] args) {
        int[] arr = {1,0,2,0,8,3,4,6,0};
        int index = 0;

        for (int i=0; i<=arr.length-1; i++){
            if (arr[i]!=0){
                arr[index] = arr[i];
                index++;
            }
        }
        while (index< arr.length){
            arr[index] = 0;
            index++;
        }
        System.out.println(Arrays.toString(arr));
    }
}
