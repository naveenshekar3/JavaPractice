package DSAlgo.Sorting;

import java.util.Arrays;

// This will compare the 2nd and 1st element and swap, 2nd and 3rd and swap till last
// Here j< arr.length-i is because in the i number of itterations already the numbers are sorted in arr.length-i th index so we do not touch it.
public class Bubblesort {
    public static void main(String[] args) {
        int[] arr = {4,1,2,13,9,7,3};
        int temp;

        for (int i =0; i<=arr.length-1; i++){
            for (int j=1; j< arr.length-i; j++){
                if (arr[j]<arr[j-1]){
                    temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
