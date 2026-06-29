package DSAlgo.Sorting;

import java.util.Arrays;

public class MergeSort {

    public static void sort(int[] arr){
        if (arr.length<2)
            return;
        int middle = arr.length/2;
        int[] left = new int[middle];
        int[] right = new int[arr.length-middle];

        for (int i = 0; i<=middle-1; i++){
            left[i] = arr[i];
        }
        for (int j = middle; j<=arr.length-1; j++){
            right[j-middle] = arr[j];
        }
        sort(left);
        sort(right);

        merge(left,right,arr);
    }

    public static void merge(int[] left, int[] right, int[] arr){
        int i=0, j=0, k=0;

        while (i< left.length && j< right.length){

            if (left[i]<right[j]){
                arr[k] = left[i];
                i++;
                k++;
            }else {
                arr[k] = right[j];
                j++;
                k++;
            }
        }
        while (i< left.length) {
            arr[k] = left[i];
            i++;
            k++;
        }

        while (j<right.length){
            arr[k] = right[j];
            j++;
            k++;
        }
    }

    public static void main(String[] args) {
        int[] arr = {4,1,2,7,9};
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
