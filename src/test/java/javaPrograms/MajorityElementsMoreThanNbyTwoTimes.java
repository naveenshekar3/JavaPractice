package javaPrograms;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

public class MajorityElementsMoreThanNbyTwoTimes {
    public static void main(String[] args) {
        int[] arr={2,2,1,1,1,2,2}; // print the number which is repeated for more than arr size divide by 2. Output = 2
        int k = arr.length/2;
        LinkedHashMap<Integer,Integer> map = new LinkedHashMap<>();

        for (int i: arr){
            if (map.containsKey(i))
                map.put(i,map.get(i)+1);
            else map.put(i,1);
        }

        Iterator<Map.Entry<Integer,Integer>> entry = map.entrySet().iterator();
        while (entry.hasNext()){
            Map.Entry<Integer,Integer> element = entry.next();
            if (element.getValue()>k) {
                System.out.println(element.getKey());
                break;
            }
            else {
                System.out.println(-1);
                break;
            }
        }
    }
}
