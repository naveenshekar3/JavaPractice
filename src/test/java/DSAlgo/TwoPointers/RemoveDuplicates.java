package DSAlgo.TwoPointers;

import java.util.Arrays;

public class RemoveDuplicates {
    public static void main(String[] args) {
        int[] arr = {4, 1, 1, 3, 2, 2, 3, 1};
        Arrays.sort(arr);

        int slow = 0;

        for (int fast=0; fast<=arr.length-1; fast++){
            if (arr[slow] !=arr[fast]){
                slow++;
                arr[slow] = arr[fast];
            }
        }

        for (int i = 0; i<=slow; i++){
            System.out.println(arr[i]);
        }
    }
}
