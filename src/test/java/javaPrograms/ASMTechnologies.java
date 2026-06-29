package javaPrograms;

import java.util.ArrayList;

public class ASMTechnologies {
    public static void main(String[] args) {
        int[] input = {2, 3, 4, 5, 5, 5, 3, 5}; // output:- 2, 3, 4, 3, 5 (All consecutive repeated numbers should be removed)

        ArrayList<Integer> list = new ArrayList<>();

        for (int i=0; i<=input.length-1; i++){
            if (i== 0 && input[i] != input[i+1])
                list.add(input[i]);
            if ((i< input.length-1 && input[i] != input[i+1]) && (i>0 && input[i] != input[i-1])){
                list.add(input[i]);
            }if (i== input.length-1 && input[i] != input[i-1])
                list.add(input[i]);
        }
        System.out.println(list);
    }
}
