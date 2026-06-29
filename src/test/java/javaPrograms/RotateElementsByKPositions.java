package javaPrograms;

import java.util.Arrays;

public class RotateElementsByKPositions {
    public static void rotate(int[] arr, int k){
        int n = arr.length;
        k = k%n;
        // Step 1: Reverse whole array
        reverse(arr,0,n-1);
        // Step 2: Reverse first k elements
        reverse(arr,0,k-1);
        // Step 3: Reverse remaining elements
        reverse(arr,k,n-1);
    }

    public static void reverse(int[] arr, int start, int end){
        while (start<end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5}; // output = [4,5,1,2,3] if k=2, if k=3 output = [3,4,5,1,2]
        int k=3;
        rotate(arr,k);
        System.out.println(Arrays.toString(arr));

    }
}
