package javaPrograms;

import java.util.LinkedHashMap;

public class MuthootCorpOneSecondProgram {

    public static void main(String[] args) {
        int[] arr = {1,2,3,2,4,2,5}; // print first and last index of repeated numbers Output :- 1,5
        int start = -1;
        int end = -1;

        LinkedHashMap<Integer,Integer> map = new LinkedHashMap<>();

        for (int i=0; i<=arr.length-1; i++){
            if (map.containsKey(arr[i])){
                start = map.get(arr[i]);
                end = i;
            }
            else {
                map.put(arr[i],i);
            }
        }
        System.out.println(start+","+end);
    }
}
