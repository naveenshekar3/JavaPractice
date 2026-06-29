package javaPrograms;

import java.util.ArrayList;
import java.util.Collections;

public class SortCharactersAndDigits {
    public static void main(String[] args) {
        String s = "d9c4a1"; // input ="d9c4a1" output = a1c4d9, input = "acb" output = abc

        ArrayList<Character> numList = new ArrayList<>();
        ArrayList<Character> charList = new ArrayList<>();


        for (int i=0; i<=s.length()-1; i++){
            if (Character.isLetter(s.charAt(i)))
                charList.add(s.charAt(i));
            else {
                numList.add(s.charAt(i));
            }
        }
        Collections.sort(numList);
        Collections.sort(charList);

        StringBuilder sb = new StringBuilder();
        int charListIndex = 0;
        int numListIndex = 0;

        for (int j=0; j<=s.length()-1; j++){
            if (Character.isLetter(s.charAt(j)))
                sb.append(charList.get(charListIndex++));
            else sb.append(numList.get(numListIndex++));
        }
        System.out.println(sb.toString());
    }
}
