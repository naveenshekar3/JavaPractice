package javaPrograms;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

public class ExotelFirstProgram {
    public static void main(String[] args) {
        String s = "siptesting"; // print the very first non repeating character , output = p

        // Using nested for loop
        for (int i=0; i<=s.length()-1; i++){
            boolean isRepeated = false;
            for (int j=0; j<=s.length()-1; j++){
                if (i!=j && s.charAt(i) == s.charAt(j)){
                    isRepeated = true;
                    break;
                }
            }
            if (!isRepeated) {
                System.out.println("Using nested for loop -> "+s.charAt(i));
                break;
            }
        }

        // Using map
        char[] ch= s.toCharArray();
        LinkedHashMap<Character,Integer> map = new LinkedHashMap<>();
        for (char c: ch){
            if (map.containsKey(c))
                map.put(c,map.get(c)+1);
            else map.put(c,1);
        }

        Iterator<Map.Entry<Character,Integer>> entry = map.entrySet().iterator();
        while (entry.hasNext()){
            Map.Entry<Character,Integer> element = entry.next();
            if (element.getValue() == 1) {
                System.out.println("Using map -> "+element.getKey());
                break;
            }
        }

    }
}
