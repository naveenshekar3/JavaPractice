package javaPrograms;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Set;

public class TekionFirstProgram {

    public static void main(String[] args) {
        String input2 = "i am raj";
        Set<Integer> set = new LinkedHashSet<>();

        for (int i=0; i<=input2.length()-1; i++){
            if (input2.charAt(i)==' '){
                set.add(i);
            }
        }

        StringBuilder sb = new StringBuilder(input2.replaceAll(" ",""));
        String rev = sb.reverse().toString();
        int index = 0;
        StringBuilder result = new StringBuilder();

        for (int i=0; i<=input2.length()-1; i++){
            if (set.contains(i)){
                result.append(" ");
            }else {
                result.append(rev.charAt(index++));
            }
        }
        System.out.println(result);
    }
}