package javaPrograms;

import java.util.Arrays;

public class MergeTwoArrays {
    public static void main(String[] args) {
        int[] a = {1, 2, 3};
        int[] b = {4, 5, 6};

        int[] mergedArray = new int[a.length + b.length];
        int index = 0;

        for (int i: a)
            mergedArray[index++] = i;
        for (int n: b)
            mergedArray[index++] = n;

        System.out.println(Arrays.toString(mergedArray));
    }
}
