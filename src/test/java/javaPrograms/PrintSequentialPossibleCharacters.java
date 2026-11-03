package javaPrograms;

import java.util.ArrayList;
import java.util.List;

public class PrintSequentialPossibleCharacters {
    public static void main(String[] args) {
        String s = "abc"; // output:- [a, ab, abc, b, bc, c]
        List<String> list = new ArrayList<>();
        for (int i =0; i<=s.length()-1; i++){
            for (int j=i+1; j<=s.length(); j++){
                list.add(s.substring(i,j));
            }
        }
        System.out.println(list);
    }
}
