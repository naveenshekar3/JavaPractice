package javaPrograms;

import java.util.ArrayList;
import java.util.Arrays;

public class AnagramCheck {
    public static void main(String[] args) {
        String[] input = new String[]{"god", "tan", "cat", "dog", "sat", "act"}; // output = [god, cat, dog, act, tan, sat]
        String[] duplicate = input.clone();

        int index = 0;
        for (String s: input){
            char[] c = s.toCharArray();
            Arrays.sort(c);
            String str = new String(c);
            input[index] = str;
            index++;
        }

        ArrayList<String> al = new ArrayList<>(Arrays.asList(input));
        ArrayList<String> anagram = new ArrayList<>();
        ArrayList<String> nonAnagram = new ArrayList<>();

        for (int i=0; i<= input.length-1; i++){
            al.remove(i);
            if (al.contains(input[i]))
                anagram.add(duplicate[i]);
            else nonAnagram.add(duplicate[i]);

            al.add(i,input[i]);
        }
        anagram.addAll(nonAnagram);
        System.out.println(anagram);
    }
}
