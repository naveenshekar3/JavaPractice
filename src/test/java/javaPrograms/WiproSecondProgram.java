package javaPrograms;

import java.util.*;

public class WiproSecondProgram {

    public static void main(String[] args) {
        String[] input = {"abc","bca","cab","ab", "ba", "xyz"}; // output = [abc, bca, cab] [ab, ba] [xyz]
        Map<String,List<String>> map = new LinkedHashMap<>();
        for (String s : input){
            char[] c = s.toCharArray();
            Arrays.sort(c);
            String key = new String(c);

            map.computeIfAbsent(key, k-> new ArrayList<>()).add(s);
        }

        System.out.println(new ArrayList<>(map.values()));
    }
}
