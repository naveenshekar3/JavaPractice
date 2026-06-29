package javaPrograms;

import java.util.Arrays;
import java.util.LinkedHashMap;

public class GetIndexOfSumOfTwoNumbersEqualToTarget {

    public static int[] getIndex(int[] arr, int target){
        LinkedHashMap<Integer,Integer> map = new LinkedHashMap<>();

        for(int i=0; i<=arr.length-1; i++){
            int required = target - arr[i];

            if (map.containsKey(required))
                return new int[]{map.get(required), i};

            map.put(arr[i],i);
        }
        return new int[]{};
    }

    public static void main(String[] args) {
        int[] arr = {8,3,4,1,6,5}; //output = [1, 2]
        int target = 14; //output =[0, 4]
        System.out.println(Arrays.toString(getIndex(arr,target)));
    }
}
