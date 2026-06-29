package javaPrograms;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

public class CheckSumEqualsZero {
    public static void main(String[] args) {
        int[] arr={-1,1,0,2,-2,1}; // output = [(-2,0,2), (-2,1,1), (-1,0,1)]
        Arrays.sort(arr);

        Set<String> s = new LinkedHashSet<>();

        for (int i=0; i<=arr.length-1; i++){
            for (int j=i+1; j<= arr.length-1; j++){
                for (int k=j+1; k<= arr.length-1; k++){
                    if (arr[i]+arr[j]+arr[k] == 0){
                        s.add("("+arr[i]+","+arr[j]+","+arr[k]+")");
                    }
                }
            }
        }
        System.out.println(s);
    }
}
