package DSAlgo.Recursive;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PrintNumbersFromListWhichSumsEqualToTarget {
    public static void main(String[] args) {
//        int[] arr = {1,2,3,4,5,6,7};
        int[] arr = {1,4,2,6,3,1,1};
//        int[] arr = {1,1,1,2,3,4,6}; // this logic will not work for this input
        int target = 3;

//        Arrays.sort(arr);
        backTract(arr,target,0,new ArrayList<>());

    }

    public static void backTract(int[] arr, int target, int start, List<Integer> current){
        if (target == 0){
            System.out.println(current);
            return;
        }

        if (target<0){
            return;
        }

        for (int i=start; i<=arr.length-1; i++){

            if (i>start && arr[i] == arr[i-1]) //skip duplicates
                return;

            current.add(arr[i]);
            backTract(arr,target - arr[i], start+1, current);
            current.remove(current.size() -1);
        }
    }
}
