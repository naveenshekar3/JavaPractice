package javaPrograms;

import java.util.*;

public class ExotelSecondProgram {
    public static void main(String[] args) {
        //input
//        //1=b
//        //2=c
//        //3=a
//     // Output, values should be sorted
//        //3=a
//        //1=b
//        //2=c

        LinkedHashMap<Integer,Character> output = new LinkedHashMap<>();
        LinkedHashMap<Integer,Character> map = new LinkedHashMap<>();
        map.put(1,'b');
        map.put(2,'c');
        map.put(3,'a');

        List<Map.Entry<Integer,Character>> list = new ArrayList<>(map.entrySet());

        list.sort(Map.Entry.comparingByValue());

        for (Map.Entry<Integer,Character> entry : list){
            output.put(entry.getKey(), entry.getValue());
        }
        System.out.println(output);


        // to Get top k number of repeated numbers
        List<Integer> listOfNumbers = new ArrayList<>(Arrays.asList(1,1,1,2,2,3));
        LinkedHashMap<Integer, Integer> mapOfNumbers = new LinkedHashMap<>();
        for (int i: listOfNumbers){
            if (mapOfNumbers.containsKey(i))
                mapOfNumbers.put(i,mapOfNumbers.get(i)+1);
            else mapOfNumbers.put(i,1);
        }

        List<Map.Entry<Integer,Integer>> listMap = new ArrayList<>(mapOfNumbers.entrySet());
        listMap.sort(Map.Entry.comparingByValue(Comparator.reverseOrder()));
        int k = 2;
        int index = 0;
        for (Map.Entry<Integer,Integer> entry :listMap){
            if (index<k) {
                System.out.println(entry.getKey());
                index++;
            }
        }


    }
}
