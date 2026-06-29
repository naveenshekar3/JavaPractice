package javaPrograms;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

public class Juno {
    public static void main(String[] args) {
        String s = "java is a language".replaceAll(" ","");
        char[] c = s.toCharArray();

        LinkedHashMap<Character, Integer> map = new LinkedHashMap<>();
        for (char ch: c){
            if (map.containsKey(ch))
                map.put(ch, map.get(ch)+1);
            else map.put(ch, 1);
        }
        System.out.println(map);

        Iterator<Map.Entry<Character,Integer>> entry = map.entrySet().iterator();
        while (entry.hasNext()){
            Map.Entry<Character,Integer> element = entry.next();
            if (element.getValue()>=1)
                System.out.print(element.getKey());
        }
    }
}
