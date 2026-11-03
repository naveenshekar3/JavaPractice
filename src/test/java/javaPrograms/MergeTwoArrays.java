package javaPrograms;

import java.util.Arrays;
import java.util.stream.IntStream;

public class MergeTwoArrays {
    public static void main(String[] args) {
        int[] a = {6, 7, 3, 8, 2, 1};
        int[] b = {5, 8, 4, 2, 3, 9};

        int[] merged = new int[a.length+b.length];

        System.arraycopy(a,0,merged,0,a.length);
        System.arraycopy(b,0,merged,a.length,b.length);

        System.out.println(Arrays.toString(merged));
//        System.out.println(Arrays.toString(Arrays.sort(merged)));

        for (int i=0; i<=merged.length-1; i++){
            for (int j=i+1; j<=merged.length-1; j++){
                int temp = 0;
                if (merged[i]>merged[j]){
                    temp = merged[i];
                    merged[i] = merged[j];
                    merged[j] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(merged));

        // using Java 8 streams
        int[] output = IntStream.concat(Arrays.stream(a),Arrays.stream(b))
                .sorted().toArray();
        System.out.println(Arrays.toString(output));

        // using Java 8 streams and if it is asked to remove duplicates in an array

        int[] result = IntStream.concat(Arrays.stream(a),Arrays.stream(b))
                .distinct().sorted().toArray();
        System.out.println(Arrays.toString(result));
    }
}
