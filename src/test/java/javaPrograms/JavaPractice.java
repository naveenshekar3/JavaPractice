package javaPrograms;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class JavaPractice {
    public static void main(String[] args) {
        String[] arr = {"cat", "rat", "bat", "cow", "bow", "low", "pen"};

        Map<String, List<String>> map = new LinkedHashMap<>();

        for (String s: arr){
            String str = s.substring(s.length()-2);

            map.computeIfAbsent(str, k -> new ArrayList<>()).add(s);
        }

        System.out.println(new ArrayList<>(map.values()));
    }
}